package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.IField {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Object The new value.
  		*/
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IField: senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    cls: js.Any = null,
    getCls: js.Function0[java.lang.String] = null,
    getIncrement: js.Function0[scala.Double] = null,
    getMaxValue: js.Function0[scala.Double] = null,
    getMinValue: js.Function0[scala.Double] = null,
    getReadOnly: js.Function0[scala.Boolean] = null,
    getValue: js.Function0[_] = null,
    getValues: js.Function0[_] = null,
    increment: scala.Int | scala.Double = null,
    isDirty: js.Function0[scala.Boolean] = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIncrement: js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxValue: js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinValue: js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTabIndex: js.Function1[/* tabIndex */ js.UndefOr[js.Any], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setValues: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    tabIndex: scala.Int | scala.Double = null,
    value: js.Any = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(getIncrement)
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(getMaxValue)
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(getMinValue)
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(getReadOnly)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (getValues != null) __obj.updateDynamic("getValues")(getValues)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(setIncrement)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(setTabIndex)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (setValues != null) __obj.updateDynamic("setValues")(setValues)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ISlider]
  }
}

