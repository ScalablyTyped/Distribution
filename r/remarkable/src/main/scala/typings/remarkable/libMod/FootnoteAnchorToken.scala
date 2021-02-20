package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteAnchorToken extends FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteAnchorToken: footnote_anchor = js.native
}
object FootnoteAnchorToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_anchor): FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteAnchorToken]
  }
  
  @scala.inline
  implicit class FootnoteAnchorTokenMutableBuilder[Self <: FootnoteAnchorToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_anchor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
