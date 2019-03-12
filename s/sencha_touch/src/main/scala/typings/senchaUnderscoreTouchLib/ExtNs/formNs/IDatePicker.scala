package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.ISelect {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyPickerOnHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of dateFormat
  		* @returns String
  		*/
  var getDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method]  */
  var getDatePicker: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of destroyPickerOnHide
  		* @returns Boolean
  		*/
  var getDestroyPickerOnHide: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of the field formatted using the specified format
  		* @param format String The format to be returned.
  		* @returns String The formatted date.
  		*/
  var getFormattedValue: js.UndefOr[js.Function1[/* format */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Method] Override this or change event will be fired twice  */
  var onChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object/Ext.picker.Date) */
  var picker: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the Select field to the value of the first record in the store
  		* @returns Ext.field.Select this
  		*/
  @JSName("reset")
  var reset_IDatePicker: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.ISelect]] = js.undefined
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of destroyPickerOnHide
  		* @param destroyPickerOnHide Boolean The new value.
  		*/
  var setDestroyPickerOnHide: js.UndefOr[js.Function1[/* destroyPickerOnHide */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of picker
  		* @param picker Object/Ext.picker.Date The new value.
  		*/
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    ISelect: senchaUnderscoreTouchLib.ExtNs.fieldNs.ISelect = null,
    dateFormat: java.lang.String = null,
    destroyPickerOnHide: js.UndefOr[scala.Boolean] = js.undefined,
    getDateFormat: () => java.lang.String = null,
    getDatePicker: () => scala.Unit = null,
    getDestroyPickerOnHide: () => scala.Boolean = null,
    getFormattedValue: /* format */ js.UndefOr[java.lang.String] => java.lang.String = null,
    getUi: () => java.lang.String = null,
    getValue: () => _ = null,
    onChange: () => scala.Unit = null,
    picker: js.Any = null,
    reset: () => senchaUnderscoreTouchLib.ExtNs.fieldNs.ISelect = null,
    setDateFormat: /* dateFormat */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDestroyPickerOnHide: /* destroyPickerOnHide */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setPicker: /* picker */ js.UndefOr[js.Any] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    ui: java.lang.String = null,
    value: js.Any = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISelect)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (!js.isUndefined(destroyPickerOnHide)) __obj.updateDynamic("destroyPickerOnHide")(destroyPickerOnHide)
    if (getDateFormat != null) __obj.updateDynamic("getDateFormat")(js.Any.fromFunction0(getDateFormat))
    if (getDatePicker != null) __obj.updateDynamic("getDatePicker")(js.Any.fromFunction0(getDatePicker))
    if (getDestroyPickerOnHide != null) __obj.updateDynamic("getDestroyPickerOnHide")(js.Any.fromFunction0(getDestroyPickerOnHide))
    if (getFormattedValue != null) __obj.updateDynamic("getFormattedValue")(js.Any.fromFunction1(getFormattedValue))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1(setDateFormat))
    if (setDestroyPickerOnHide != null) __obj.updateDynamic("setDestroyPickerOnHide")(js.Any.fromFunction1(setDestroyPickerOnHide))
    if (setPicker != null) __obj.updateDynamic("setPicker")(js.Any.fromFunction1(setPicker))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePicker]
  }
}

