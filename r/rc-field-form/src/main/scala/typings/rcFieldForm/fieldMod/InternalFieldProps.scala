package typings.rcFieldForm.fieldMod

import typings.rcFieldForm.interfaceMod.EventArgs
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.Meta
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.rcFieldFormBooleans.`false`
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalFieldProps extends js.Object {
  var children: js.UndefOr[
    ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, ReactNode])
  ] = js.undefined
  /**
    * Set up `dependencies` field.
    * When dependencies field update and current field is touched,
    * will trigger validate rules and render.
    */
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
  var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, js.Object]] = js.undefined
  var initialValue: js.UndefOr[js.Any] = js.undefined
  var messageVariables: js.UndefOr[Record[String, String]] = js.undefined
  var name: js.UndefOr[InternalNamePath] = js.undefined
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.undefined
  var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preserve: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var validateFirst: js.UndefOr[Boolean] = js.undefined
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  var valuePropName: js.UndefOr[String] = js.undefined
}

object InternalFieldProps {
  @scala.inline
  def apply(
    children: ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, ReactNode]) = null,
    dependencies: js.Array[NamePath] = null,
    getValueFromEvent: /* args */ EventArgs => StoreValue = null,
    getValueProps: /* value */ StoreValue => js.Object = null,
    initialValue: js.Any = null,
    messageVariables: Record[String, String] = null,
    name: InternalNamePath = null,
    normalize: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue = null,
    onReset: () => Unit = null,
    preserve: js.UndefOr[Boolean] = js.undefined,
    rules: js.Array[Rule] = null,
    shouldUpdate: ShouldUpdate = null,
    trigger: String = null,
    validateFirst: js.UndefOr[Boolean] = js.undefined,
    validateTrigger: String | js.Array[String] | `false` = null,
    valuePropName: String = null
  ): InternalFieldProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (getValueFromEvent != null) __obj.updateDynamic("getValueFromEvent")(js.Any.fromFunction1(getValueFromEvent))
    if (getValueProps != null) __obj.updateDynamic("getValueProps")(js.Any.fromFunction1(getValueProps))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (messageVariables != null) __obj.updateDynamic("messageVariables")(messageVariables.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction3(normalize))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(shouldUpdate.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFirst)) __obj.updateDynamic("validateFirst")(validateFirst.get.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (valuePropName != null) __obj.updateDynamic("valuePropName")(valuePropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFieldProps]
  }
}

