package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteBlockCloseToken extends TagToken {
  
  @JSName("type")
  var type_FootnoteBlockCloseToken: footnote_block_close = js.native
}
object FootnoteBlockCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: footnote_block_close): FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteBlockCloseToken]
  }
  
  @scala.inline
  implicit class FootnoteBlockCloseTokenMutableBuilder[Self <: FootnoteBlockCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_block_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
