package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteReferenceCloseToken
  extends StObject
     with FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteReferenceCloseToken: footnote_reference_close
}
object FootnoteReferenceCloseToken {
  
  inline def apply(id: Double, level: Double): FootnoteReferenceCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_reference_close")
    __obj.asInstanceOf[FootnoteReferenceCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FootnoteReferenceCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: footnote_reference_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
