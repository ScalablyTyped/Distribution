package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner extends INumber {
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
    INumber: INumber = null,
    accelerateOnTapHold: js.UndefOr[scala.Boolean] = js.undefined,
    cls: js.Any = null,
    component: js.Any = null,
    cycle: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: scala.Int | scala.Double = null,
    getAccelerateOnTapHold: js.Function0[scala.Boolean] = null,
    getCls: js.Function0[java.lang.String] = null,
    getComponent: js.Function0[_] = null,
    getCycle: js.Function0[scala.Boolean] = null,
    getDefaultValue: js.Function0[scala.Double] = null,
    getGroupButtons: js.Function0[scala.Boolean] = null,
    getMaxValue: js.Function0[scala.Double] = null,
    getMinValue: js.Function0[scala.Double] = null,
    getStepValue: js.Function0[scala.Double] = null,
    groupButtons: js.UndefOr[scala.Boolean] = js.undefined,
    increment: java.lang.String = null,
    incrementValue: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    reset: js.Function0[IField] = null,
    setAccelerateOnTapHold: js.Function1[/* accelerateOnTapHold */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setCycle: js.Function1[/* cycle */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDefaultValue: js.Function1[/* defaultValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setGroupButtons: js.Function1[/* groupButtons */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMaxValue: js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinValue: js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStepValue: js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    stepValue: scala.Int | scala.Double = null,
    updateComponent: js.Function1[/* newComponent */ js.UndefOr[js.Any], scala.Unit] = null
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, INumber)
    if (!js.isUndefined(accelerateOnTapHold)) __obj.updateDynamic("accelerateOnTapHold")(accelerateOnTapHold)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getAccelerateOnTapHold != null) __obj.updateDynamic("getAccelerateOnTapHold")(getAccelerateOnTapHold)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getCycle != null) __obj.updateDynamic("getCycle")(getCycle)
    if (getDefaultValue != null) __obj.updateDynamic("getDefaultValue")(getDefaultValue)
    if (getGroupButtons != null) __obj.updateDynamic("getGroupButtons")(getGroupButtons)
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(getMaxValue)
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(getMinValue)
    if (getStepValue != null) __obj.updateDynamic("getStepValue")(getStepValue)
    if (!js.isUndefined(groupButtons)) __obj.updateDynamic("groupButtons")(groupButtons)
    if (increment != null) __obj.updateDynamic("increment")(increment)
    if (incrementValue != null) __obj.updateDynamic("incrementValue")(incrementValue)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setAccelerateOnTapHold != null) __obj.updateDynamic("setAccelerateOnTapHold")(setAccelerateOnTapHold)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setCycle != null) __obj.updateDynamic("setCycle")(setCycle)
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(setDefaultValue)
    if (setGroupButtons != null) __obj.updateDynamic("setGroupButtons")(setGroupButtons)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(setStepValue)
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (updateComponent != null) __obj.updateDynamic("updateComponent")(updateComponent)
    __obj.asInstanceOf[ISpinner]
  }
}

