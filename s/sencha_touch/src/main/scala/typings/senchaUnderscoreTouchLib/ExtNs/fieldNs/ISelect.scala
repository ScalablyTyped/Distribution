package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends IText {
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of autoSelect
  		* @returns Boolean
  		*/
  var getAutoSelect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of defaultPhonePickerConfig
  		* @returns Object
  		*/
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultTabletPickerConfig
  		* @returns Object
  		*/
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String/Number
  		*/
  var getDisplayField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hiddenName
  		* @returns String
  		*/
  var getHiddenName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of options
  		* @returns Array
  		*/
  var getOptions: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object/String
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of usePicker
  		* @returns String/Boolean
  		*/
  var getUsePicker: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of valueField
  		* @returns String/Number
  		*/
  var getValueField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Called when the internal store s data has changed
  		* @param store Object
  		*/
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Array) */
  var options: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Sets the value of autoSelect
  		* @param autoSelect Boolean The new value.
  		*/
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultPhonePickerConfig
  		* @param defaultPhonePickerConfig Object The new value.
  		*/
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultTabletPickerConfig
  		* @param defaultTabletPickerConfig Object The new value.
  		*/
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String/Number The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hiddenName
  		* @param hiddenName String The new value.
  		*/
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of options
  		* @param options Array The new value.
  		*/
  var setOptions: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of usePicker
  		* @param usePicker String/Boolean The new value.
  		*/
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String/Number The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the underlying lt options gt list with new values
  		* @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
  		* @returns Ext.field.Select this
  		*/
  var updateOptions: js.UndefOr[
    js.Function1[/* newOptions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], this.type]
  ] = js.undefined
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[js.Any] = js.undefined
}

