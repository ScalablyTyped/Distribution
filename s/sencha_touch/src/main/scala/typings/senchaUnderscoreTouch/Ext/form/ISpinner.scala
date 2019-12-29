package typings.senchaUnderscoreTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner
  extends typings.senchaUnderscoreTouch.Ext.field.INumber {
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of accelerateOnTapHold
  		* @returns Boolean
  		*/
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of cycle
  		* @returns Boolean
  		*/
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of defaultValue
  		* @returns Number
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of groupButtons
  		* @returns Boolean
  		*/
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of accelerateOnTapHold
  		* @param accelerateOnTapHold Boolean The new value.
  		*/
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of cycle
  		* @param cycle Boolean The new value.
  		*/
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Number The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of groupButtons
  		* @param groupButtons Boolean The new value.
  		*/
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Updates the component configuration
  		* @param newComponent Object
  		*/
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ISpinner {
  @scala.inline
  def apply(
    INumber: typings.senchaUnderscoreTouch.Ext.field.INumber = null,
    accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined,
    cycle: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Int | Double = null,
    getAccelerateOnTapHold: () => Boolean = null,
    getCls: () => String = null,
    getCycle: () => Boolean = null,
    getDefaultValue: () => Double = null,
    getGroupButtons: () => Boolean = null,
    groupButtons: js.UndefOr[Boolean] = js.undefined,
    increment: String = null,
    incrementValue: String = null,
    setAccelerateOnTapHold: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Unit = null,
    setCls: /* cls */ js.UndefOr[String] => Unit = null,
    setCycle: /* cycle */ js.UndefOr[Boolean] => Unit = null,
    setDefaultValue: /* defaultValue */ js.UndefOr[Double] => Unit = null,
    setGroupButtons: /* groupButtons */ js.UndefOr[Boolean] => Unit = null,
    updateComponent: /* newComponent */ js.UndefOr[js.Any] => Unit = null
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    if (INumber != null) js.Dynamic.global.Object.assign(__obj, INumber)
    if (!js.isUndefined(accelerateOnTapHold)) __obj.updateDynamic("accelerateOnTapHold")(accelerateOnTapHold.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getAccelerateOnTapHold != null) __obj.updateDynamic("getAccelerateOnTapHold")(js.Any.fromFunction0(getAccelerateOnTapHold))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getCycle != null) __obj.updateDynamic("getCycle")(js.Any.fromFunction0(getCycle))
    if (getDefaultValue != null) __obj.updateDynamic("getDefaultValue")(js.Any.fromFunction0(getDefaultValue))
    if (getGroupButtons != null) __obj.updateDynamic("getGroupButtons")(js.Any.fromFunction0(getGroupButtons))
    if (!js.isUndefined(groupButtons)) __obj.updateDynamic("groupButtons")(groupButtons.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (incrementValue != null) __obj.updateDynamic("incrementValue")(incrementValue.asInstanceOf[js.Any])
    if (setAccelerateOnTapHold != null) __obj.updateDynamic("setAccelerateOnTapHold")(js.Any.fromFunction1(setAccelerateOnTapHold))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setCycle != null) __obj.updateDynamic("setCycle")(js.Any.fromFunction1(setCycle))
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(js.Any.fromFunction1(setDefaultValue))
    if (setGroupButtons != null) __obj.updateDynamic("setGroupButtons")(js.Any.fromFunction1(setGroupButtons))
    if (updateComponent != null) __obj.updateDynamic("updateComponent")(js.Any.fromFunction1(updateComponent))
    __obj.asInstanceOf[ISpinner]
  }
}

