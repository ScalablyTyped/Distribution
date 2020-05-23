package typings.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends ISelect {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyPickerOnHide: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method]  */
  var getDatePicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of destroyPickerOnHide
    * @returns Boolean
    */
  var getDestroyPickerOnHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of the field formatted using the specified format
    * @param format String The format to be returned.
    * @returns String The formatted date.
    */
  var getFormattedValue: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], String]] = js.undefined
  /** [Method] Override this or change event will be fired twice  */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of destroyPickerOnHide
    * @param destroyPickerOnHide Boolean The new value.
    */
  var setDestroyPickerOnHide: js.UndefOr[js.Function1[/* destroyPickerOnHide */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of picker
    * @param picker Object/Ext.picker.Date The new value.
    */
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    ISelect: ISelect = null,
    dateFormat: String = null,
    destroyPickerOnHide: js.UndefOr[Boolean] = js.undefined,
    getDateFormat: () => String = null,
    getDatePicker: () => Unit = null,
    getDestroyPickerOnHide: () => Boolean = null,
    getFormattedValue: /* format */ js.UndefOr[String] => String = null,
    onChange: () => Unit = null,
    picker: js.Any = null,
    reset: () => ISelect = null,
    setDateFormat: /* dateFormat */ js.UndefOr[String] => Unit = null,
    setDestroyPickerOnHide: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Unit = null,
    setPicker: /* picker */ js.UndefOr[js.Any] => Unit = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    if (ISelect != null) js.Dynamic.global.Object.assign(__obj, ISelect)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPickerOnHide)) __obj.updateDynamic("destroyPickerOnHide")(destroyPickerOnHide.get.asInstanceOf[js.Any])
    if (getDateFormat != null) __obj.updateDynamic("getDateFormat")(js.Any.fromFunction0(getDateFormat))
    if (getDatePicker != null) __obj.updateDynamic("getDatePicker")(js.Any.fromFunction0(getDatePicker))
    if (getDestroyPickerOnHide != null) __obj.updateDynamic("getDestroyPickerOnHide")(js.Any.fromFunction0(getDestroyPickerOnHide))
    if (getFormattedValue != null) __obj.updateDynamic("getFormattedValue")(js.Any.fromFunction1(getFormattedValue))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1(setDateFormat))
    if (setDestroyPickerOnHide != null) __obj.updateDynamic("setDestroyPickerOnHide")(js.Any.fromFunction1(setDestroyPickerOnHide))
    if (setPicker != null) __obj.updateDynamic("setPicker")(js.Any.fromFunction1(setPicker))
    __obj.asInstanceOf[IDatePicker]
  }
}

