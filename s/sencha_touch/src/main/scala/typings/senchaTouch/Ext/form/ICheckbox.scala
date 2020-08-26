package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckbox
  extends typings.senchaTouch.Ext.field.IField {
  /** [Method] Set the checked state of the checkbox to true
    * @returns Ext.field.Checkbox This checkbox.
    */
  var check: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the field checked value
    * @returns Mixed The field value.
    */
  var getChecked: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
    * @returns Array
    */
  var getGroupValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the submit value for the checkbox which can be used when submitting forms
    * @returns Boolean/String value The value of value or true, if checked.
    */
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of value
    * @returns String
    */
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean true if checked, false otherwise.
    */
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
    * @returns Ext.field.Checkbox This checkbox.
    */
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[typings.senchaTouch.Ext.field.IField]] = js.native
  /** [Method] Set the status of all matched checkboxes in the same group to checked
    * @param values Array An array of values.
    * @returns Ext.field.Checkbox This checkbox.
    */
  var setGroupValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Array], this.type]] = js.native
  /** [Method] Sets the value of value
    * @param value String The new value.
    */
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the checked state of the checkbox to false
    * @returns Ext.field.Checkbox This checkbox.
    */
  var uncheck: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  @JSName("value")
  var value_ICheckbox: js.UndefOr[String] = js.native
}

object ICheckbox {
  @scala.inline
  def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  @scala.inline
  implicit class ICheckboxOps[Self <: ICheckbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheck(value: () => ICheckbox): Self = this.set("check", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDoChecked(value: () => Unit): Self = this.set("doChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoChecked: Self = this.set("doChecked", js.undefined)
    @scala.inline
    def setDoUnChecked(value: () => Unit): Self = this.set("doUnChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoUnChecked: Self = this.set("doUnChecked", js.undefined)
    @scala.inline
    def setGetChecked(value: () => _): Self = this.set("getChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChecked: Self = this.set("getChecked", js.undefined)
    @scala.inline
    def setGetGroupValues(value: () => Array): Self = this.set("getGroupValues", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGroupValues: Self = this.set("getGroupValues", js.undefined)
    @scala.inline
    def setGetSubmitValue(value: () => _): Self = this.set("getSubmitValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmitValue: Self = this.set("getSubmitValue", js.undefined)
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = this.set("isChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setReset(value: () => typings.senchaTouch.Ext.field.IField): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setResetGroupValues(value: () => ICheckbox): Self = this.set("resetGroupValues", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetGroupValues: Self = this.set("resetGroupValues", js.undefined)
    @scala.inline
    def setSetGroupValues(value: /* values */ js.UndefOr[Array] => ICheckbox): Self = this.set("setGroupValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGroupValues: Self = this.set("setGroupValues", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setUncheck(value: () => ICheckbox): Self = this.set("uncheck", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUncheck: Self = this.set("uncheck", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

