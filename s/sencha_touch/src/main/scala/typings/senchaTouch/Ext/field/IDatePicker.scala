package typings.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePicker extends ISelect {
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var destroyPickerOnHide: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method]  */
  var getDatePicker: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of destroyPickerOnHide
    * @returns Boolean
    */
  var getDestroyPickerOnHide: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of the field formatted using the specified format
    * @param format String The format to be returned.
    * @returns String The formatted date.
    */
  var getFormattedValue: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], String]] = js.native
  
  /** [Method] Override this or change event will be fired twice  */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object/Ext.picker.Date) */
  var picker: js.UndefOr[js.Any] = js.native
  
  /** [Method] Resets the Select field to the value of the first record in the store
    * @returns Ext.field.Select this
    */
  @JSName("reset")
  var reset_IDatePicker: js.UndefOr[js.Function0[ISelect]] = js.native
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of destroyPickerOnHide
    * @param destroyPickerOnHide Boolean The new value.
    */
  var setDestroyPickerOnHide: js.UndefOr[js.Function1[/* destroyPickerOnHide */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of picker
    * @param picker Object/Ext.picker.Date The new value.
    */
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDatePicker {
  
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDestroyPickerOnHide(value: Boolean): Self = this.set("destroyPickerOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyPickerOnHide: Self = this.set("destroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setGetDateFormat(value: () => String): Self = this.set("getDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDateFormat: Self = this.set("getDateFormat", js.undefined)
    
    @scala.inline
    def setGetDatePicker(value: () => Unit): Self = this.set("getDatePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDatePicker: Self = this.set("getDatePicker", js.undefined)
    
    @scala.inline
    def setGetDestroyPickerOnHide(value: () => Boolean): Self = this.set("getDestroyPickerOnHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDestroyPickerOnHide: Self = this.set("getDestroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setGetFormattedValue(value: /* format */ js.UndefOr[String] => String): Self = this.set("getFormattedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFormattedValue: Self = this.set("getFormattedValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPicker(value: js.Any): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    
    @scala.inline
    def setReset(value: () => ISelect): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = this.set("setDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDateFormat: Self = this.set("setDateFormat", js.undefined)
    
    @scala.inline
    def setSetDestroyPickerOnHide(value: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Unit): Self = this.set("setDestroyPickerOnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDestroyPickerOnHide: Self = this.set("setDestroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setSetPicker(value: /* picker */ js.UndefOr[js.Any] => Unit): Self = this.set("setPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPicker: Self = this.set("setPicker", js.undefined)
  }
}
