package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class FootnoteBlockCloseTokenOps[Self <: FootnoteBlockCloseToken] (val x: Self) extends AnyVal {
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
    def setType(value: footnote_block_close): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

