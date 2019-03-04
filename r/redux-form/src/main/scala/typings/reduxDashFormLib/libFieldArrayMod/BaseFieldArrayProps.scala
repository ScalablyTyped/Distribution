package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldArrayProps[P] extends js.Object {
  var component: reactLib.reactMod.ReactNs.ComponentType[P]
  var name: java.lang.String
  var props: js.UndefOr[P] = js.undefined
  var rerenderOnEveryChange: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
  var warn: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseFieldArrayProps {
  @scala.inline
  def apply[P](
    component: reactLib.reactMod.ReactNs.ComponentType[P],
    name: java.lang.String,
    props: P = null,
    rerenderOnEveryChange: js.UndefOr[scala.Boolean] = js.undefined,
    validate: reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator] = null,
    warn: reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator] = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseFieldArrayProps[P] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (!js.isUndefined(rerenderOnEveryChange)) __obj.updateDynamic("rerenderOnEveryChange")(rerenderOnEveryChange)
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[BaseFieldArrayProps[P]]
  }
}

