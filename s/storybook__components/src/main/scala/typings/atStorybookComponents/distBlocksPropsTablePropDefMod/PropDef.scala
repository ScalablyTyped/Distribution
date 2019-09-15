package typings.atStorybookComponents.distBlocksPropsTablePropDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropDef extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var required: Boolean
  var `type`: js.Any
}

object PropDef {
  @scala.inline
  def apply(
    name: String,
    required: Boolean,
    `type`: js.Any,
    defaultValue: js.Any = null,
    description: String = null
  ): PropDef = {
    val __obj = js.Dynamic.literal(name = name, required = required)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[PropDef]
  }
}

