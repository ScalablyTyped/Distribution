package typings.senchaUnderscoreTouch.Ext.field

import typings.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox extends IField {
  /** [Method] Set the checked state of the checkbox to true
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var check: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the field checked value
  		* @returns Mixed The field value.
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
  		* @returns Array
  		*/
  var getGroupValues: js.UndefOr[js.Function0[Array]] = js.undefined
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
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[IField]] = js.undefined
  /** [Method] Set the status of all matched checkboxes in the same group to checked
  		* @param values Array An array of values.
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var setGroupValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value String The new value.
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], Unit]] = js.undefined
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
    IField: IField = null,
    check: () => ICheckbox = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    doChecked: () => Unit = null,
    doUnChecked: () => Unit = null,
    getChecked: () => _ = null,
    getGroupValues: () => Array = null,
    getSubmitValue: () => _ = null,
    getValue: () => java.lang.String = null,
    isChecked: () => Boolean = null,
    reset: () => IField = null,
    resetGroupValues: () => ICheckbox = null,
    setGroupValues: /* values */ js.UndefOr[Array] => ICheckbox = null,
    setValue: /* value */ js.UndefOr[java.lang.String] => Unit = null,
    uncheck: () => ICheckbox = null,
    value: java.lang.String = null
  ): ICheckbox = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    if (check != null) __obj.updateDynamic("check")(js.Any.fromFunction0(check))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (doChecked != null) __obj.updateDynamic("doChecked")(js.Any.fromFunction0(doChecked))
    if (doUnChecked != null) __obj.updateDynamic("doUnChecked")(js.Any.fromFunction0(doUnChecked))
    if (getChecked != null) __obj.updateDynamic("getChecked")(js.Any.fromFunction0(getChecked))
    if (getGroupValues != null) __obj.updateDynamic("getGroupValues")(js.Any.fromFunction0(getGroupValues))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (isChecked != null) __obj.updateDynamic("isChecked")(js.Any.fromFunction0(isChecked))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetGroupValues != null) __obj.updateDynamic("resetGroupValues")(js.Any.fromFunction0(resetGroupValues))
    if (setGroupValues != null) __obj.updateDynamic("setGroupValues")(js.Any.fromFunction1(setGroupValues))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (uncheck != null) __obj.updateDynamic("uncheck")(js.Any.fromFunction0(uncheck))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckbox]
  }
}

