package typings.rbx.mediaItemMod

import typings.rbx.rbxStrings.content
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/media/media-item.MediaItemVariablesOverrides, rbx.rbx/components/media/media-item.MediaItemVariablesDefaults> */
@js.native
trait MediaItemVariables extends js.Object {
  var alignments: content | left | right = js.native
}

object MediaItemVariables {
  @scala.inline
  def apply(alignments: content | left | right): MediaItemVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemVariables]
  }
  @scala.inline
  implicit class MediaItemVariablesOps[Self <: MediaItemVariables] (val x: Self) extends AnyVal {
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
    def setAlignments(value: content | left | right): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
  
}

