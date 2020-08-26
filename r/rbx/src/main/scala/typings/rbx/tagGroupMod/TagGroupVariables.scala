package typings.rbx.tagGroupMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/tag/tag-group.TagGroupVariablesOverrides, rbx.rbx/elements/tag/tag-group.TagGroupVariablesDefaults> */
@js.native
trait TagGroupVariables extends js.Object {
  var sizes: medium | large = js.native
}

object TagGroupVariables {
  @scala.inline
  def apply(sizes: medium | large): TagGroupVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupVariables]
  }
  @scala.inline
  implicit class TagGroupVariablesOps[Self <: TagGroupVariables] (val x: Self) extends AnyVal {
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
    def setSizes(value: medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
  
}

