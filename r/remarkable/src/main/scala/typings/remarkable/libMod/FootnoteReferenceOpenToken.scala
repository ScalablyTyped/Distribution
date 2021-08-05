package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteReferenceOpenToken
  extends StObject
     with FootnoteGenericToken {
  
  var label: String
  
  @JSName("type")
  var type_FootnoteReferenceOpenToken: footnote_reference_open
}
object FootnoteReferenceOpenToken {
  
  inline def apply(id: Double, label: String, level: Double): FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_reference_open")
    __obj.asInstanceOf[FootnoteReferenceOpenToken]
  }
  
  extension [Self <: FootnoteReferenceOpenToken](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: footnote_reference_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
