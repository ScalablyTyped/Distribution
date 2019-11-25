package typings.reduxDashForm.libFieldArrayMod

import typings.react.reactMod.ComponentType
import typings.reduxDashForm.libFieldMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BaseFieldArrayProps[P, FieldValue] extends js.Object {
  var component: ComponentType[WrappedFieldArrayProps[FieldValue] with P]
  var name: String
  var rerenderOnEveryChange: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object _BaseFieldArrayProps {
  @scala.inline
  def apply[P, FieldValue](
    component: ComponentType[WrappedFieldArrayProps[FieldValue] with P],
    name: String,
    rerenderOnEveryChange: js.UndefOr[Boolean] = js.undefined,
    validate: Validator | js.Array[Validator] = null,
    warn: Validator | js.Array[Validator] = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): _BaseFieldArrayProps[P, FieldValue] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(rerenderOnEveryChange)) __obj.updateDynamic("rerenderOnEveryChange")(rerenderOnEveryChange.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BaseFieldArrayProps[P, FieldValue]]
  }
}

