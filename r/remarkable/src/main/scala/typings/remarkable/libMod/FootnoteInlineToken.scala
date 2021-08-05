package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteInlineToken
  extends StObject
     with FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteInlineToken: footnote_ref
}
object FootnoteInlineToken {
  
  inline def apply(id: Double, level: Double): FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_ref")
    __obj.asInstanceOf[FootnoteInlineToken]
  }
  
  extension [Self <: FootnoteInlineToken](x: Self) {
    
    inline def setType(value: footnote_ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
