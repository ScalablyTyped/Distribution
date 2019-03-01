package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends ISelect {
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
  var reset_IDatePicker: js.UndefOr[js.Function0[ISelect]] = js.undefined
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
    ISelect: ISelect = null,
    dateFormat: java.lang.String = null,
    destroyPickerOnHide: js.UndefOr[scala.Boolean] = js.undefined,
    getDateFormat: js.Function0[java.lang.String] = null,
    getDatePicker: js.Function0[scala.Unit] = null,
    getDestroyPickerOnHide: js.Function0[scala.Boolean] = null,
    getFormattedValue: js.Function1[/* format */ js.UndefOr[java.lang.String], java.lang.String] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    onChange: js.Function0[scala.Unit] = null,
    picker: js.Any = null,
    reset: js.Function0[ISelect] = null,
    setDateFormat: js.Function1[/* dateFormat */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDestroyPickerOnHide: js.Function1[/* destroyPickerOnHide */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPicker: js.Function1[/* picker */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    ui: java.lang.String = null,
    value: js.Any = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISelect)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (!js.isUndefined(destroyPickerOnHide)) __obj.updateDynamic("destroyPickerOnHide")(destroyPickerOnHide)
    if (getDateFormat != null) __obj.updateDynamic("getDateFormat")(getDateFormat)
    if (getDatePicker != null) __obj.updateDynamic("getDatePicker")(getDatePicker)
    if (getDestroyPickerOnHide != null) __obj.updateDynamic("getDestroyPickerOnHide")(getDestroyPickerOnHide)
    if (getFormattedValue != null) __obj.updateDynamic("getFormattedValue")(getFormattedValue)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(setDateFormat)
    if (setDestroyPickerOnHide != null) __obj.updateDynamic("setDestroyPickerOnHide")(setDestroyPickerOnHide)
    if (setPicker != null) __obj.updateDynamic("setPicker")(setPicker)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePicker]
  }
}

