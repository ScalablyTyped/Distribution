package typings.senchaTouch.Ext.field

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelect
  extends StObject
     with IText {
  
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
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of defaultTabletPickerConfig
    * @returns Object
    */
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of displayField
    * @returns String/Number
    */
  var getDisplayField: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of hiddenName
    * @returns String
    */
  var getHiddenName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of options
    * @returns Array
    */
  var getOptions: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of store
    * @returns Ext.data.Store/Object/String
    */
  var getStore: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of usePicker
    * @returns String/Boolean
    */
  var getUsePicker: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of valueField
    * @returns String/Number
    */
  var getValueField: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.undefined
  
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
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[String], Unit]] = js.undefined
  
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
  def apply(): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelect]
  }
  
  @scala.inline
  implicit class ISelectMutableBuilder[Self <: ISelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    @scala.inline
    def setDefaultPhonePickerConfig(value: js.Any): Self = StObject.set(x, "defaultPhonePickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "defaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setDefaultTabletPickerConfig(value: js.Any): Self = StObject.set(x, "defaultTabletPickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "defaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setDisplayField(value: js.Any): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setGetAutoSelect(value: () => Boolean): Self = StObject.set(x, "getAutoSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoSelectUndefined: Self = StObject.set(x, "getAutoSelect", js.undefined)
    
    @scala.inline
    def setGetDefaultPhonePickerConfig(value: () => js.Any): Self = StObject.set(x, "getDefaultPhonePickerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "getDefaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setGetDefaultTabletPickerConfig(value: () => js.Any): Self = StObject.set(x, "getDefaultTabletPickerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "getDefaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setGetDisplayField(value: () => js.Any): Self = StObject.set(x, "getDisplayField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
    
    @scala.inline
    def setGetHiddenName(value: () => String): Self = StObject.set(x, "getHiddenName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHiddenNameUndefined: Self = StObject.set(x, "getHiddenName", js.undefined)
    
    @scala.inline
    def setGetOptions(value: () => Array): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => js.Any): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setGetUsePicker(value: () => js.Any): Self = StObject.set(x, "getUsePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUsePickerUndefined: Self = StObject.set(x, "getUsePicker", js.undefined)
    
    @scala.inline
    def setGetValueField(value: () => js.Any): Self = StObject.set(x, "getValueField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueFieldUndefined: Self = StObject.set(x, "getValueField", js.undefined)
    
    @scala.inline
    def setHiddenName(value: String): Self = StObject.set(x, "hiddenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenNameUndefined: Self = StObject.set(x, "hiddenName", js.undefined)
    
    @scala.inline
    def setOnStoreDataChanged(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStoreDataChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStoreDataChangedUndefined: Self = StObject.set(x, "onStoreDataChanged", js.undefined)
    
    @scala.inline
    def setOptions(value: Array): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSetAutoSelect(value: /* autoSelect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoSelectUndefined: Self = StObject.set(x, "setAutoSelect", js.undefined)
    
    @scala.inline
    def setSetDefaultPhonePickerConfig(value: /* defaultPhonePickerConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaultPhonePickerConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultPhonePickerConfigUndefined: Self = StObject.set(x, "setDefaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setSetDefaultTabletPickerConfig(value: /* defaultTabletPickerConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaultTabletPickerConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultTabletPickerConfigUndefined: Self = StObject.set(x, "setDefaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setSetDisplayField(value: /* displayField */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
    
    @scala.inline
    def setSetHiddenName(value: /* hiddenName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setHiddenName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHiddenNameUndefined: Self = StObject.set(x, "setHiddenName", js.undefined)
    
    @scala.inline
    def setSetOptions(value: /* options */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    @scala.inline
    def setSetUsePicker(value: /* usePicker */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUsePicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUsePickerUndefined: Self = StObject.set(x, "setUsePicker", js.undefined)
    
    @scala.inline
    def setSetValueField(value: /* valueField */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValueField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueFieldUndefined: Self = StObject.set(x, "setValueField", js.undefined)
    
    @scala.inline
    def setShowPicker(value: () => Unit): Self = StObject.set(x, "showPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPickerUndefined: Self = StObject.set(x, "showPicker", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setUpdateOptions(value: /* newOptions */ js.UndefOr[Array] => ISelect): Self = StObject.set(x, "updateOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateOptionsUndefined: Self = StObject.set(x, "updateOptions", js.undefined)
    
    @scala.inline
    def setUsePicker(value: js.Any): Self = StObject.set(x, "usePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePickerUndefined: Self = StObject.set(x, "usePicker", js.undefined)
    
    @scala.inline
    def setValueField(value: js.Any): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
