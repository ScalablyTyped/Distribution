package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteInlineToken extends FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteInlineToken: footnote_ref = js.native
}
object FootnoteInlineToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_ref): FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteInlineToken]
  }
  
  @scala.inline
  implicit class FootnoteInlineTokenMutableBuilder[Self <: FootnoteInlineToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
