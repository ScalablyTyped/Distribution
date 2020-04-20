package typings.rbx.deleteMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/other/delete.DeleteVariablesOverrides, rbx.rbx/elements/other/delete.DeleteVariablesDefaults> */
trait DeleteVariables extends js.Object {
  var sizes: small | medium | large
}

object DeleteVariables {
  @scala.inline
  def apply(sizes: small | medium | large): DeleteVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVariables]
  }
}

