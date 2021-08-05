package typings.senchaTouch.Ext.field

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICheckbox
  extends StObject
     with IField {
  
  /** [Method] Set the checked state of the checkbox to true
    * @returns Ext.field.Checkbox This checkbox.
    */
  var check: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the field checked value
    * @returns Mixed The field value.
    */
  var getChecked: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
    * @returns Array
    */
  var getGroupValues: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the submit value for the checkbox which can be used when submitting forms
    * @returns Boolean/String value The value of value or true, if checked.
    */
  var getSubmitValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of value
    * @returns String
    */
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean true if checked, false otherwise.
    */
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
    * @returns Ext.field.Checkbox This checkbox.
    */
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[IField]] = js.undefined
  
  /** [Method] Set the status of all matched checkboxes in the same group to checked
    * @param values Array An array of values.
    * @returns Ext.field.Checkbox This checkbox.
    */
  var setGroupValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Array], this.type]] = js.undefined
  
  /** [Method] Sets the value of value
    * @param value String The new value.
    */
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Set the checked state of the checkbox to false
    * @returns Ext.field.Checkbox This checkbox.
    */
  var uncheck: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("value")
  var value_ICheckbox: js.UndefOr[String] = js.undefined
}
object ICheckbox {
  
  inline def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  
  extension [Self <: ICheckbox](x: Self) {
    
    inline def setCheck(value: () => ICheckbox): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDoChecked(value: () => Unit): Self = StObject.set(x, "doChecked", js.Any.fromFunction0(value))
    
    inline def setDoCheckedUndefined: Self = StObject.set(x, "doChecked", js.undefined)
    
    inline def setDoUnChecked(value: () => Unit): Self = StObject.set(x, "doUnChecked", js.Any.fromFunction0(value))
    
    inline def setDoUnCheckedUndefined: Self = StObject.set(x, "doUnChecked", js.undefined)
    
    inline def setGetChecked(value: () => js.Any): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
    
    inline def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
    
    inline def setGetGroupValues(value: () => Array): Self = StObject.set(x, "getGroupValues", js.Any.fromFunction0(value))
    
    inline def setGetGroupValuesUndefined: Self = StObject.set(x, "getGroupValues", js.undefined)
    
    inline def setGetSubmitValue(value: () => js.Any): Self = StObject.set(x, "getSubmitValue", js.Any.fromFunction0(value))
    
    inline def setGetSubmitValueUndefined: Self = StObject.set(x, "getSubmitValue", js.undefined)
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    inline def setReset(value: () => IField): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetGroupValues(value: () => ICheckbox): Self = StObject.set(x, "resetGroupValues", js.Any.fromFunction0(value))
    
    inline def setResetGroupValuesUndefined: Self = StObject.set(x, "resetGroupValues", js.undefined)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetGroupValues(value: /* values */ js.UndefOr[Array] => ICheckbox): Self = StObject.set(x, "setGroupValues", js.Any.fromFunction1(value))
    
    inline def setSetGroupValuesUndefined: Self = StObject.set(x, "setGroupValues", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setUncheck(value: () => ICheckbox): Self = StObject.set(x, "uncheck", js.Any.fromFunction0(value))
    
    inline def setUncheckUndefined: Self = StObject.set(x, "uncheck", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
