package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends IText {
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[scala.Double] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    IText: IText = null,
    component: js.Any = null,
    getComponent: js.Function0[_] = null,
    getMaxValue: js.Function0[scala.Double] = null,
    getMinValue: js.Function0[scala.Double] = null,
    getStepValue: js.Function0[scala.Double] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxValue: js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinValue: js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStepValue: js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    stepValue: scala.Int | scala.Double = null,
    ui: java.lang.String = null
  ): INumber = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(getMaxValue)
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(getMinValue)
    if (getStepValue != null) __obj.updateDynamic("getStepValue")(getStepValue)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(setStepValue)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[INumber]
  }
}

