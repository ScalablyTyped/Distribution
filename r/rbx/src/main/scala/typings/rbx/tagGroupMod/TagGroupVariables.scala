package typings.rbx.tagGroupMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/tag/tag-group.TagGroupVariablesOverrides, rbx.rbx/elements/tag/tag-group.TagGroupVariablesDefaults> */
trait TagGroupVariables extends js.Object {
  var sizes: medium | large
}

object TagGroupVariables {
  @scala.inline
  def apply(sizes: medium | large): TagGroupVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupVariables]
  }
}

