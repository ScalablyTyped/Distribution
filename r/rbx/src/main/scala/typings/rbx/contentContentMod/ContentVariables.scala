package typings.rbx.contentContentMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/content/content.ContentVariablesOverrides, rbx.rbx/elements/content/content.ContentVariablesDefaults> */
trait ContentVariables extends js.Object {
  var sizes: small | medium | large
}

object ContentVariables {
  @scala.inline
  def apply(sizes: small | medium | large): ContentVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentVariables]
  }
}

