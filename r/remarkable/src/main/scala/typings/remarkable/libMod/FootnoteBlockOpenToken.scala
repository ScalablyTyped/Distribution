package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteBlockOpenToken extends TagToken {
  
  @JSName("type")
  var type_FootnoteBlockOpenToken: footnote_block_open = js.native
}
object FootnoteBlockOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: footnote_block_open): FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteBlockOpenToken]
  }
  
  @scala.inline
  implicit class FootnoteBlockOpenTokenMutableBuilder[Self <: FootnoteBlockOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_block_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
