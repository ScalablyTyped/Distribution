package typings.rbx.fieldMod

import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/field.FieldVariablesOverrides, rbx.rbx/elements/form/field.FieldVariablesDefaults> */
trait FieldVariables extends js.Object {
  var alignments: centered | right
  var kinds: addons | group
}

object FieldVariables {
  @scala.inline
  def apply(alignments: centered | right, kinds: addons | group): FieldVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldVariables]
  }
}

