package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.undefined
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.undefined
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    onFieldsChange: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit = null,
    onFinish: /* values */ Store => Unit = null,
    onFinishFailed: /* errorInfo */ ValidateErrorEntity => Unit = null,
    onValuesChange: (/* changedValues */ Store, /* values */ Store) => Unit = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(js.Any.fromFunction2(onFieldsChange))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction1(onFinish))
    if (onFinishFailed != null) __obj.updateDynamic("onFinishFailed")(js.Any.fromFunction1(onFinishFailed))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction2(onValuesChange))
    __obj.asInstanceOf[Callbacks]
  }
}

