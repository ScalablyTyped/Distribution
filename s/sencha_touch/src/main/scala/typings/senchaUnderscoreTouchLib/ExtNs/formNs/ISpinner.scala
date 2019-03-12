package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.INumber {
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of accelerateOnTapHold
  		* @returns Boolean
  		*/
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of cycle
  		* @returns Boolean
  		*/
  var getCycle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of defaultValue
  		* @returns Number
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of groupButtons
  		* @returns Boolean
  		*/
  var getGroupButtons: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var increment: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of accelerateOnTapHold
  		* @param accelerateOnTapHold Boolean The new value.
  		*/
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cycle
  		* @param cycle Boolean The new value.
  		*/
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Number The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of groupButtons
  		* @param groupButtons Boolean The new value.
  		*/
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Updates the component configuration
  		* @param newComponent Object
  		*/
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ISpinner {
  @scala.inline
  def apply(
    INumber: senchaUnderscoreTouchLib.ExtNs.fieldNs.INumber = null,
    accelerateOnTapHold: js.UndefOr[scala.Boolean] = js.undefined,
    cls: js.Any = null,
    component: js.Any = null,
    cycle: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: scala.Int | scala.Double = null,
    getAccelerateOnTapHold: () => scala.Boolean = null,
    getCls: () => java.lang.String = null,
    getComponent: () => _ = null,
    getCycle: () => scala.Boolean = null,
    getDefaultValue: () => scala.Double = null,
    getGroupButtons: () => scala.Boolean = null,
    getMaxValue: () => scala.Double = null,
    getMinValue: () => scala.Double = null,
    getStepValue: () => scala.Double = null,
    groupButtons: js.UndefOr[scala.Boolean] = js.undefined,
    increment: java.lang.String = null,
    incrementValue: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    reset: () => senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    setAccelerateOnTapHold: /* accelerateOnTapHold */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => scala.Unit = null,
    setCycle: /* cycle */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setDefaultValue: /* defaultValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setGroupButtons: /* groupButtons */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinValue: /* minValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStepValue: /* stepValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    stepValue: scala.Int | scala.Double = null,
    updateComponent: /* newComponent */ js.UndefOr[js.Any] => scala.Unit = null
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, INumber)
    if (!js.isUndefined(accelerateOnTapHold)) __obj.updateDynamic("accelerateOnTapHold")(accelerateOnTapHold)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getAccelerateOnTapHold != null) __obj.updateDynamic("getAccelerateOnTapHold")(js.Any.fromFunction0(getAccelerateOnTapHold))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getCycle != null) __obj.updateDynamic("getCycle")(js.Any.fromFunction0(getCycle))
    if (getDefaultValue != null) __obj.updateDynamic("getDefaultValue")(js.Any.fromFunction0(getDefaultValue))
    if (getGroupButtons != null) __obj.updateDynamic("getGroupButtons")(js.Any.fromFunction0(getGroupButtons))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getStepValue != null) __obj.updateDynamic("getStepValue")(js.Any.fromFunction0(getStepValue))
    if (!js.isUndefined(groupButtons)) __obj.updateDynamic("groupButtons")(groupButtons)
    if (increment != null) __obj.updateDynamic("increment")(increment)
    if (incrementValue != null) __obj.updateDynamic("incrementValue")(incrementValue)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setAccelerateOnTapHold != null) __obj.updateDynamic("setAccelerateOnTapHold")(js.Any.fromFunction1(setAccelerateOnTapHold))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setCycle != null) __obj.updateDynamic("setCycle")(js.Any.fromFunction1(setCycle))
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(js.Any.fromFunction1(setDefaultValue))
    if (setGroupButtons != null) __obj.updateDynamic("setGroupButtons")(js.Any.fromFunction1(setGroupButtons))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(js.Any.fromFunction1(setStepValue))
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (updateComponent != null) __obj.updateDynamic("updateComponent")(js.Any.fromFunction1(updateComponent))
    __obj.asInstanceOf[ISpinner]
  }
}

