package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.IField {
  /** [Method] Set the checked state of the checkbox to true
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var check: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the field checked value
  		* @returns Mixed The field value.
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
  		* @returns Array
  		*/
  var getGroupValues: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the submit value for the checkbox which can be used when submitting forms
  		* @returns Boolean/String value The value of value or true, if checked.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns String
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean true if checked, false otherwise.
  		*/
  var isChecked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField]] = js.undefined
  /** [Method] Set the status of all matched checkboxes in the same group to checked
  		* @param values Array An array of values.
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var setGroupValues: js.UndefOr[
    js.Function1[/* values */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], this.type]
  ] = js.undefined
  /** [Method] Sets the value of value
  		* @param value String The new value.
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the checked state of the checkbox to false
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var uncheck: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  @JSName("value")
  var value_ICheckbox: js.UndefOr[java.lang.String] = js.undefined
}

object ICheckbox {
  @scala.inline
  def apply(
    IField: senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    check: js.Function0[ICheckbox] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    doChecked: js.Function0[scala.Unit] = null,
    doUnChecked: js.Function0[scala.Unit] = null,
    getChecked: js.Function0[_] = null,
    getComponent: js.Function0[_] = null,
    getGroupValues: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getSubmitValue: js.Function0[_] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[java.lang.String] = null,
    isChecked: js.Function0[scala.Boolean] = null,
    reset: js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField] = null,
    resetGroupValues: js.Function0[ICheckbox] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setGroupValues: js.Function1[/* values */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], ICheckbox] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Unit] = null,
    ui: java.lang.String = null,
    uncheck: js.Function0[ICheckbox] = null,
    value: java.lang.String = null
  ): ICheckbox = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (check != null) __obj.updateDynamic("check")(check)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (component != null) __obj.updateDynamic("component")(component)
    if (doChecked != null) __obj.updateDynamic("doChecked")(doChecked)
    if (doUnChecked != null) __obj.updateDynamic("doUnChecked")(doUnChecked)
    if (getChecked != null) __obj.updateDynamic("getChecked")(getChecked)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getGroupValues != null) __obj.updateDynamic("getGroupValues")(getGroupValues)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (isChecked != null) __obj.updateDynamic("isChecked")(isChecked)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resetGroupValues != null) __obj.updateDynamic("resetGroupValues")(resetGroupValues)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setGroupValues != null) __obj.updateDynamic("setGroupValues")(setGroupValues)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (uncheck != null) __obj.updateDynamic("uncheck")(uncheck)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ICheckbox]
  }
}

