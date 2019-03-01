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

object ISelect {
  @scala.inline
  def apply(
    IText: IText = null,
    autoSelect: js.UndefOr[scala.Boolean] = js.undefined,
    defaultPhonePickerConfig: js.Any = null,
    defaultTabletPickerConfig: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    displayField: js.Any = null,
    getAutoSelect: js.Function0[scala.Boolean] = null,
    getDefaultPhonePickerConfig: js.Function0[_] = null,
    getDefaultTabletPickerConfig: js.Function0[_] = null,
    getDisplayField: js.Function0[_] = null,
    getHiddenName: js.Function0[java.lang.String] = null,
    getName: js.Function0[java.lang.String] = null,
    getOptions: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRecord: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] = null,
    getStore: js.Function0[_] = null,
    getUi: js.Function0[java.lang.String] = null,
    getUsePicker: js.Function0[_] = null,
    getValue: js.Function0[_] = null,
    getValueField: js.Function0[_] = null,
    hiddenName: java.lang.String = null,
    name: java.lang.String = null,
    onStoreDataChanged: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    options: senchaUnderscoreTouchLib.ExtNs.Array = null,
    reset: js.Function0[ISelect] = null,
    setAutoSelect: js.Function1[/* autoSelect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDefaultPhonePickerConfig: js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaultTabletPickerConfig: js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setDisplayField: js.Function1[/* displayField */ js.UndefOr[js.Any], scala.Unit] = null,
    setHiddenName: js.Function1[/* hiddenName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setOptions: js.Function1[/* options */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUsePicker: js.Function1[/* usePicker */ js.UndefOr[js.Any], scala.Unit] = null,
    setValueField: js.Function1[/* valueField */ js.UndefOr[js.Any], scala.Unit] = null,
    showPicker: js.Function0[scala.Unit] = null,
    store: js.Any = null,
    ui: java.lang.String = null,
    updateOptions: js.Function1[/* newOptions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], ISelect] = null,
    usePicker: js.Any = null,
    valueField: js.Any = null
  ): ISelect = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (defaultPhonePickerConfig != null) __obj.updateDynamic("defaultPhonePickerConfig")(defaultPhonePickerConfig)
    if (defaultTabletPickerConfig != null) __obj.updateDynamic("defaultTabletPickerConfig")(defaultTabletPickerConfig)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (getAutoSelect != null) __obj.updateDynamic("getAutoSelect")(getAutoSelect)
    if (getDefaultPhonePickerConfig != null) __obj.updateDynamic("getDefaultPhonePickerConfig")(getDefaultPhonePickerConfig)
    if (getDefaultTabletPickerConfig != null) __obj.updateDynamic("getDefaultTabletPickerConfig")(getDefaultTabletPickerConfig)
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(getDisplayField)
    if (getHiddenName != null) __obj.updateDynamic("getHiddenName")(getHiddenName)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOptions != null) __obj.updateDynamic("getOptions")(getOptions)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getUsePicker != null) __obj.updateDynamic("getUsePicker")(getUsePicker)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (getValueField != null) __obj.updateDynamic("getValueField")(getValueField)
    if (hiddenName != null) __obj.updateDynamic("hiddenName")(hiddenName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onStoreDataChanged != null) __obj.updateDynamic("onStoreDataChanged")(onStoreDataChanged)
    if (options != null) __obj.updateDynamic("options")(options)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setAutoSelect != null) __obj.updateDynamic("setAutoSelect")(setAutoSelect)
    if (setDefaultPhonePickerConfig != null) __obj.updateDynamic("setDefaultPhonePickerConfig")(setDefaultPhonePickerConfig)
    if (setDefaultTabletPickerConfig != null) __obj.updateDynamic("setDefaultTabletPickerConfig")(setDefaultTabletPickerConfig)
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(setDisplayField)
    if (setHiddenName != null) __obj.updateDynamic("setHiddenName")(setHiddenName)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setUsePicker != null) __obj.updateDynamic("setUsePicker")(setUsePicker)
    if (setValueField != null) __obj.updateDynamic("setValueField")(setValueField)
    if (showPicker != null) __obj.updateDynamic("showPicker")(showPicker)
    if (store != null) __obj.updateDynamic("store")(store)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (updateOptions != null) __obj.updateDynamic("updateOptions")(updateOptions)
    if (usePicker != null) __obj.updateDynamic("usePicker")(usePicker)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[ISelect]
  }
}

