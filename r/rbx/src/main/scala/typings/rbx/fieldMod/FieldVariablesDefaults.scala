package typings.rbx.fieldMod

import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldVariablesDefaults extends js.Object {
  var alignments: centered | right
  var kinds: addons | group
}

object FieldVariablesDefaults {
  @scala.inline
  def apply(alignments: centered | right, kinds: addons | group): FieldVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldVariablesDefaults]
  }
}

