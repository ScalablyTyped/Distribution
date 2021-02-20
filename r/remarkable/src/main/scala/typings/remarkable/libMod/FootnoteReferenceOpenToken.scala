package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteReferenceOpenToken extends FootnoteGenericToken {
  
  var label: String = js.native
  
  @JSName("type")
  var type_FootnoteReferenceOpenToken: footnote_reference_open = js.native
}
object FootnoteReferenceOpenToken {
  
  @scala.inline
  def apply(id: Double, label: String, level: Double, `type`: footnote_reference_open): FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReferenceOpenToken]
  }
  
  @scala.inline
  implicit class FootnoteReferenceOpenTokenMutableBuilder[Self <: FootnoteReferenceOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: footnote_reference_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
