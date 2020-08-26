package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ContentToken extends TagToken {
  /**
    * Is this a block element
    */
  var block: js.UndefOr[Boolean] = js.native
  /**
    * A text token has a `content` property. This is passed to
    * the corresponding renderer to be converted for output.
    */
  var content: js.UndefOr[js.Any] = js.native
}

object ContentToken {
  @scala.inline
  def apply(level: Double, `type`: String): ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToken]
  }
  @scala.inline
  implicit class ContentTokenOps[Self <: ContentToken] (val x: Self) extends AnyVal {
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

