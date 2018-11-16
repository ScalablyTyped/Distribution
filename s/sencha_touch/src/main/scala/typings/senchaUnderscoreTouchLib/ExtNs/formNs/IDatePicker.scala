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

