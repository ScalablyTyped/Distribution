package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldArrayProps[P] extends js.Object {
  var component: reactLib.reactMod.ComponentType[P]
  var forwardRef: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var props: js.UndefOr[P] = js.undefined
  var rerenderOnEveryChange: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
  var warn: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
}

object BaseFieldArrayProps {
  @scala.inline
  def apply[P](
    component: reactLib.reactMod.ComponentType[P],
    name: java.lang.String,
    forwardRef: js.UndefOr[scala.Boolean] = js.undefined,
    props: P = null,
    rerenderOnEveryChange: js.UndefOr[scala.Boolean] = js.undefined,
    validate: reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator] = null,
    warn: reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator] = null
  ): BaseFieldArrayProps[P] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (!js.isUndefined(rerenderOnEveryChange)) __obj.updateDynamic("rerenderOnEveryChange")(rerenderOnEveryChange)
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldArrayProps[P]]
  }
}

