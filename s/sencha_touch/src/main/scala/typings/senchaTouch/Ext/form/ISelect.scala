package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelect
  extends typings.senchaTouch.Ext.field.IText {
  
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of autoSelect
    * @returns Boolean
    */
  var getAutoSelect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of defaultPhonePickerConfig
    * @returns Object
    */
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of defaultTabletPickerConfig
    * @returns Object
    */
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of displayField
    * @returns String/Number
    */
  var getDisplayField: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of hiddenName
    * @returns String
    */
  var getHiddenName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of options
    * @returns Array
    */
  var getOptions: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of store
    * @returns Ext.data.Store/Object/String
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of usePicker
    * @returns String/Boolean
    */
  var getUsePicker: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of valueField
    * @returns String/Number
    */
  var getValueField: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.native
  
  /** [Method] Called when the internal store s data has changed
    * @param store Object
    */
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Array) */
  var options: js.UndefOr[Array] = js.native
  
  /** [Method] Sets the value of autoSelect
    * @param autoSelect Boolean The new value.
    */
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of defaultPhonePickerConfig
    * @param defaultPhonePickerConfig Object The new value.
    */
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of defaultTabletPickerConfig
    * @param defaultTabletPickerConfig Object The new value.
    */
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of displayField
    * @param displayField String/Number The new value.
    */
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of hiddenName
    * @param hiddenName String The new value.
    */
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of options
    * @param options Array The new value.
    */
  var setOptions: js.UndefOr[js.Function1[/* options */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of store
    * @param store Ext.data.Store/Object/String The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of usePicker
    * @param usePicker String/Boolean The new value.
    */
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of valueField
    * @param valueField String/Number The new value.
    */
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[js.Any] = js.native
  
  /** [Method] Updates the underlying lt options gt list with new values
    * @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
    * @returns Ext.field.Select this
    */
  var updateOptions: js.UndefOr[js.Function1[/* newOptions */ js.UndefOr[Array], this.type]] = js.native
  
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[js.Any] = js.native
}
object ISelect {
  
  @scala.inline
  def apply(): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelect]
  }
  
  @scala.inline
  implicit class ISelectOps[Self <: ISelect] (val x: Self) extends AnyVal {
    
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
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    
    @scala.inline
    def setDefaultPhonePickerConfig(value: js.Any): Self = this.set("defaultPhonePickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPhonePickerConfig: Self = this.set("defaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setDefaultTabletPickerConfig(value: js.Any): Self = this.set("defaultTabletPickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTabletPickerConfig: Self = this.set("defaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setDisplayField(value: js.Any): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
    @scala.inline
    def setGetAutoSelect(value: () => Boolean): Self = this.set("getAutoSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoSelect: Self = this.set("getAutoSelect", js.undefined)
    
    @scala.inline
    def setGetDefaultPhonePickerConfig(value: () => _): Self = this.set("getDefaultPhonePickerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultPhonePickerConfig: Self = this.set("getDefaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setGetDefaultTabletPickerConfig(value: () => _): Self = this.set("getDefaultTabletPickerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultTabletPickerConfig: Self = this.set("getDefaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setGetDisplayField(value: () => _): Self = this.set("getDisplayField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisplayField: Self = this.set("getDisplayField", js.undefined)
    
    @scala.inline
    def setGetHiddenName(value: () => String): Self = this.set("getHiddenName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHiddenName: Self = this.set("getHiddenName", js.undefined)
    
    @scala.inline
    def setGetOptions(value: () => Array): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOptions: Self = this.set("getOptions", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = this.set("getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    
    @scala.inline
    def setGetUsePicker(value: () => _): Self = this.set("getUsePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUsePicker: Self = this.set("getUsePicker", js.undefined)
    
    @scala.inline
    def setGetValueField(value: () => _): Self = this.set("getValueField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValueField: Self = this.set("getValueField", js.undefined)
    
    @scala.inline
    def setHiddenName(value: String): Self = this.set("hiddenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenName: Self = this.set("hiddenName", js.undefined)
    
    @scala.inline
    def setOnStoreDataChanged(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("onStoreDataChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStoreDataChanged: Self = this.set("onStoreDataChanged", js.undefined)
    
    @scala.inline
    def setOptions(value: Array): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSetAutoSelect(value: /* autoSelect */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoSelect: Self = this.set("setAutoSelect", js.undefined)
    
    @scala.inline
    def setSetDefaultPhonePickerConfig(value: /* defaultPhonePickerConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaultPhonePickerConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultPhonePickerConfig: Self = this.set("setDefaultPhonePickerConfig", js.undefined)
    
    @scala.inline
    def setSetDefaultTabletPickerConfig(value: /* defaultTabletPickerConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaultTabletPickerConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultTabletPickerConfig: Self = this.set("setDefaultTabletPickerConfig", js.undefined)
    
    @scala.inline
    def setSetDisplayField(value: /* displayField */ js.UndefOr[js.Any] => Unit): Self = this.set("setDisplayField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisplayField: Self = this.set("setDisplayField", js.undefined)
    
    @scala.inline
    def setSetHiddenName(value: /* hiddenName */ js.UndefOr[String] => Unit): Self = this.set("setHiddenName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHiddenName: Self = this.set("setHiddenName", js.undefined)
    
    @scala.inline
    def setSetOptions(value: /* options */ js.UndefOr[Array] => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    
    @scala.inline
    def setSetUsePicker(value: /* usePicker */ js.UndefOr[js.Any] => Unit): Self = this.set("setUsePicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUsePicker: Self = this.set("setUsePicker", js.undefined)
    
    @scala.inline
    def setSetValueField(value: /* valueField */ js.UndefOr[js.Any] => Unit): Self = this.set("setValueField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValueField: Self = this.set("setValueField", js.undefined)
    
    @scala.inline
    def setShowPicker(value: () => Unit): Self = this.set("showPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowPicker: Self = this.set("showPicker", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setUpdateOptions(value: /* newOptions */ js.UndefOr[Array] => ISelect): Self = this.set("updateOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateOptions: Self = this.set("updateOptions", js.undefined)
    
    @scala.inline
    def setUsePicker(value: js.Any): Self = this.set("usePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePicker: Self = this.set("usePicker", js.undefined)
    
    @scala.inline
    def setValueField(value: js.Any): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
