package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_open
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
  implicit class FootnoteBlockOpenTokenOps[Self <: FootnoteBlockOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: footnote_block_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
