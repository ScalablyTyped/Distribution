package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteCloseToken
  extends StObject
     with FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteCloseToken: footnote_close
}
object FootnoteCloseToken {
  
  inline def apply(id: Double, level: Double): FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_close")
    __obj.asInstanceOf[FootnoteCloseToken]
  }
  
  extension [Self <: FootnoteCloseToken](x: Self) {
    
    inline def setType(value: footnote_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
