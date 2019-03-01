package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInput
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Input this
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Input this
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of autoCapitalize
  		* @returns Boolean
  		*/
  var getAutoCapitalize: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the checked value of this field
  		* @returns Mixed value The field value
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of fastFocus
  		* @returns Boolean
  		*/
  var getFastFocus: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of focusCls
  		* @returns String
  		*/
  var getFocusCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pattern
  		* @returns String
  		*/
  var getPattern: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of startValue
  		* @returns Mixed
  		*/
  var getStartValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns Mixed value The field value.
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its original value
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Input this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fastFocus
  		* @param fastFocus Boolean The new value.
  		*/
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of focusCls
  		* @param focusCls String The new value.
  		*/
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pattern
  		* @param pattern String The new value.
  		*/
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of startValue
  		* @param startValue Mixed The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the cls configuration
  		* @param newCls Object
  		* @param oldCls Object
  		*/
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Updates the useMask configuration
  		* @param newUseMask Object
  		*/
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IInput {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    autoComplete: js.UndefOr[scala.Boolean] = js.undefined,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    blur: js.Function0[IInput] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    cls: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fastFocus: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.Function0[IInput] = null,
    focusCls: java.lang.String = null,
    getAutoCapitalize: js.Function0[scala.Boolean] = null,
    getAutoComplete: js.Function0[scala.Boolean] = null,
    getAutoCorrect: js.Function0[scala.Boolean] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getChecked: js.Function0[_] = null,
    getCls: js.Function0[java.lang.String] = null,
    getDisabled: js.Function0[scala.Boolean] = null,
    getFastFocus: js.Function0[scala.Boolean] = null,
    getFocusCls: js.Function0[java.lang.String] = null,
    getMaxLength: js.Function0[scala.Double] = null,
    getMaxRows: js.Function0[scala.Double] = null,
    getMaxValue: js.Function0[scala.Double] = null,
    getMinValue: js.Function0[scala.Double] = null,
    getName: js.Function0[java.lang.String] = null,
    getPattern: js.Function0[java.lang.String] = null,
    getPlaceHolder: js.Function0[java.lang.String] = null,
    getReadOnly: js.Function0[scala.Boolean] = null,
    getStartValue: js.Function0[_] = null,
    getStepValue: js.Function0[scala.Double] = null,
    getTabIndex: js.Function0[scala.Double] = null,
    getType: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    isDirty: js.Function0[scala.Boolean] = null,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pattern: java.lang.String = null,
    placeHolder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.Function0[scala.Unit] = null,
    select: js.Function0[IInput] = null,
    setAutoCapitalize: js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoComplete: js.Function1[/* autoComplete */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoCorrect: js.Function1[/* autoCorrect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisabled: js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFastFocus: js.Function1[/* fastFocus */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFocusCls: js.Function1[/* focusCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMaxLength: js.Function1[/* maxLength */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxRows: js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxValue: js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinValue: js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPattern: js.Function1[/* pattern */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPlaceHolder: js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setStartValue: js.Function1[/* startValue */ js.UndefOr[js.Any], scala.Unit] = null,
    setStepValue: js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setTabIndex: js.Function1[/* tabIndex */ js.UndefOr[scala.Double], scala.Unit] = null,
    setType: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit] = null,
    startValue: js.Any = null,
    stepValue: scala.Int | scala.Double = null,
    tabIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    updateCls: js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], scala.Unit] = null,
    updateUseMask: js.Function1[/* newUseMask */ js.UndefOr[js.Any], scala.Unit] = null,
    value: js.Any = null
  ): IInput = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fastFocus)) __obj.updateDynamic("fastFocus")(fastFocus)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(getAutoCapitalize)
    if (getAutoComplete != null) __obj.updateDynamic("getAutoComplete")(getAutoComplete)
    if (getAutoCorrect != null) __obj.updateDynamic("getAutoCorrect")(getAutoCorrect)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getChecked != null) __obj.updateDynamic("getChecked")(getChecked)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(getDisabled)
    if (getFastFocus != null) __obj.updateDynamic("getFastFocus")(getFastFocus)
    if (getFocusCls != null) __obj.updateDynamic("getFocusCls")(getFocusCls)
    if (getMaxLength != null) __obj.updateDynamic("getMaxLength")(getMaxLength)
    if (getMaxRows != null) __obj.updateDynamic("getMaxRows")(getMaxRows)
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(getMaxValue)
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(getMinValue)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getPattern != null) __obj.updateDynamic("getPattern")(getPattern)
    if (getPlaceHolder != null) __obj.updateDynamic("getPlaceHolder")(getPlaceHolder)
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(getReadOnly)
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(getStartValue)
    if (getStepValue != null) __obj.updateDynamic("getStepValue")(getStepValue)
    if (getTabIndex != null) __obj.updateDynamic("getTabIndex")(getTabIndex)
    if (getType != null) __obj.updateDynamic("getType")(getType)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (select != null) __obj.updateDynamic("select")(select)
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(setAutoCapitalize)
    if (setAutoComplete != null) __obj.updateDynamic("setAutoComplete")(setAutoComplete)
    if (setAutoCorrect != null) __obj.updateDynamic("setAutoCorrect")(setAutoCorrect)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(setDisabled)
    if (setFastFocus != null) __obj.updateDynamic("setFastFocus")(setFastFocus)
    if (setFocusCls != null) __obj.updateDynamic("setFocusCls")(setFocusCls)
    if (setMaxLength != null) __obj.updateDynamic("setMaxLength")(setMaxLength)
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(setMaxRows)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setPattern != null) __obj.updateDynamic("setPattern")(setPattern)
    if (setPlaceHolder != null) __obj.updateDynamic("setPlaceHolder")(setPlaceHolder)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(setStartValue)
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(setStepValue)
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(setTabIndex)
    if (setType != null) __obj.updateDynamic("setType")(setType)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue)
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateCls != null) __obj.updateDynamic("updateCls")(updateCls)
    if (updateUseMask != null) __obj.updateDynamic("updateUseMask")(updateUseMask)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IInput]
  }
}

