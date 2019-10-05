package typings.senchaUnderscoreTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends IText {
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    IText: IText = null,
    component: js.Any = null,
    getComponent: () => _ = null,
    getMaxValue: () => Double = null,
    getMinValue: () => Double = null,
    getStepValue: () => Double = null,
    getUi: () => java.lang.String = null,
    getValue: () => _ = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    setComponent: /* component */ js.UndefOr[js.Any] => Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Unit = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Unit = null,
    setStepValue: /* stepValue */ js.UndefOr[Double] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    stepValue: Int | Double = null,
    ui: java.lang.String = null
  ): INumber = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getStepValue != null) __obj.updateDynamic("getStepValue")(js.Any.fromFunction0(getStepValue))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(js.Any.fromFunction1(setStepValue))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[INumber]
  }
}

