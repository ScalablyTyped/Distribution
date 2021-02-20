package typings.senchaTouch.Ext.field

import org.scalablytyped.runtime.StObject
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
  implicit class IDatePickerMutableBuilder[Self <: IDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDestroyPickerOnHide(value: Boolean): Self = StObject.set(x, "destroyPickerOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyPickerOnHideUndefined: Self = StObject.set(x, "destroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setGetDateFormat(value: () => String): Self = StObject.set(x, "getDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
    
    @scala.inline
    def setGetDatePicker(value: () => Unit): Self = StObject.set(x, "getDatePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDatePickerUndefined: Self = StObject.set(x, "getDatePicker", js.undefined)
    
    @scala.inline
    def setGetDestroyPickerOnHide(value: () => Boolean): Self = StObject.set(x, "getDestroyPickerOnHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDestroyPickerOnHideUndefined: Self = StObject.set(x, "getDestroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setGetFormattedValue(value: /* format */ js.UndefOr[String] => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormattedValueUndefined: Self = StObject.set(x, "getFormattedValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    @scala.inline
    def setReset(value: () => ISelect): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
    
    @scala.inline
    def setSetDestroyPickerOnHide(value: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDestroyPickerOnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDestroyPickerOnHideUndefined: Self = StObject.set(x, "setDestroyPickerOnHide", js.undefined)
    
    @scala.inline
    def setSetPicker(value: /* picker */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPickerUndefined: Self = StObject.set(x, "setPicker", js.undefined)
  }
}
