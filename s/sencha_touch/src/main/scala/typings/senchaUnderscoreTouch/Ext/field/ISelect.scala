package typings.senchaUnderscoreTouch.Ext.field

import typings.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends IText {
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of autoSelect
  		* @returns Boolean
  		*/
  var getAutoSelect: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getOptions: js.UndefOr[js.Function0[Array]] = js.undefined
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
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var options: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of autoSelect
  		* @param autoSelect Boolean The new value.
  		*/
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultPhonePickerConfig
  		* @param defaultPhonePickerConfig Object The new value.
  		*/
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultTabletPickerConfig
  		* @param defaultTabletPickerConfig Object The new value.
  		*/
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String/Number The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hiddenName
  		* @param hiddenName String The new value.
  		*/
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of options
  		* @param options Array The new value.
  		*/
  var setOptions: js.UndefOr[js.Function1[/* options */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of usePicker
  		* @param usePicker String/Boolean The new value.
  		*/
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String/Number The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the underlying lt options gt list with new values
  		* @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
  		* @returns Ext.field.Select this
  		*/
  var updateOptions: js.UndefOr[js.Function1[/* newOptions */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[js.Any] = js.undefined
}

object ISelect {
  @scala.inline
  def apply(
    IText: IText = null,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    defaultPhonePickerConfig: js.Any = null,
    defaultTabletPickerConfig: js.Any = null,
    displayField: js.Any = null,
    getAutoSelect: () => Boolean = null,
    getDefaultPhonePickerConfig: () => _ = null,
    getDefaultTabletPickerConfig: () => _ = null,
    getDisplayField: () => _ = null,
    getHiddenName: () => java.lang.String = null,
    getOptions: () => Array = null,
    getStore: () => _ = null,
    getUsePicker: () => _ = null,
    getValueField: () => _ = null,
    hiddenName: java.lang.String = null,
    onStoreDataChanged: /* store */ js.UndefOr[js.Any] => Unit = null,
    options: Array = null,
    setAutoSelect: /* autoSelect */ js.UndefOr[Boolean] => Unit = null,
    setDefaultPhonePickerConfig: /* defaultPhonePickerConfig */ js.UndefOr[js.Any] => Unit = null,
    setDefaultTabletPickerConfig: /* defaultTabletPickerConfig */ js.UndefOr[js.Any] => Unit = null,
    setDisplayField: /* displayField */ js.UndefOr[js.Any] => Unit = null,
    setHiddenName: /* hiddenName */ js.UndefOr[java.lang.String] => Unit = null,
    setOptions: /* options */ js.UndefOr[Array] => Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    setUsePicker: /* usePicker */ js.UndefOr[js.Any] => Unit = null,
    setValueField: /* valueField */ js.UndefOr[js.Any] => Unit = null,
    showPicker: () => Unit = null,
    store: js.Any = null,
    updateOptions: /* newOptions */ js.UndefOr[Array] => ISelect = null,
    usePicker: js.Any = null,
    valueField: js.Any = null
  ): ISelect = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (defaultPhonePickerConfig != null) __obj.updateDynamic("defaultPhonePickerConfig")(defaultPhonePickerConfig.asInstanceOf[js.Any])
    if (defaultTabletPickerConfig != null) __obj.updateDynamic("defaultTabletPickerConfig")(defaultTabletPickerConfig.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (getAutoSelect != null) __obj.updateDynamic("getAutoSelect")(js.Any.fromFunction0(getAutoSelect))
    if (getDefaultPhonePickerConfig != null) __obj.updateDynamic("getDefaultPhonePickerConfig")(js.Any.fromFunction0(getDefaultPhonePickerConfig))
    if (getDefaultTabletPickerConfig != null) __obj.updateDynamic("getDefaultTabletPickerConfig")(js.Any.fromFunction0(getDefaultTabletPickerConfig))
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(js.Any.fromFunction0(getDisplayField))
    if (getHiddenName != null) __obj.updateDynamic("getHiddenName")(js.Any.fromFunction0(getHiddenName))
    if (getOptions != null) __obj.updateDynamic("getOptions")(js.Any.fromFunction0(getOptions))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getUsePicker != null) __obj.updateDynamic("getUsePicker")(js.Any.fromFunction0(getUsePicker))
    if (getValueField != null) __obj.updateDynamic("getValueField")(js.Any.fromFunction0(getValueField))
    if (hiddenName != null) __obj.updateDynamic("hiddenName")(hiddenName.asInstanceOf[js.Any])
    if (onStoreDataChanged != null) __obj.updateDynamic("onStoreDataChanged")(js.Any.fromFunction1(onStoreDataChanged))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (setAutoSelect != null) __obj.updateDynamic("setAutoSelect")(js.Any.fromFunction1(setAutoSelect))
    if (setDefaultPhonePickerConfig != null) __obj.updateDynamic("setDefaultPhonePickerConfig")(js.Any.fromFunction1(setDefaultPhonePickerConfig))
    if (setDefaultTabletPickerConfig != null) __obj.updateDynamic("setDefaultTabletPickerConfig")(js.Any.fromFunction1(setDefaultTabletPickerConfig))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1(setDisplayField))
    if (setHiddenName != null) __obj.updateDynamic("setHiddenName")(js.Any.fromFunction1(setHiddenName))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction1(setOptions))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setUsePicker != null) __obj.updateDynamic("setUsePicker")(js.Any.fromFunction1(setUsePicker))
    if (setValueField != null) __obj.updateDynamic("setValueField")(js.Any.fromFunction1(setValueField))
    if (showPicker != null) __obj.updateDynamic("showPicker")(js.Any.fromFunction0(showPicker))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (updateOptions != null) __obj.updateDynamic("updateOptions")(js.Any.fromFunction1(updateOptions))
    if (usePicker != null) __obj.updateDynamic("usePicker")(usePicker.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelect]
  }
}

