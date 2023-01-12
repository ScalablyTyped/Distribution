package typings.senchaTouch.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISlider
  extends StObject
     with typings.senchaTouch.Ext.field.IField {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of increment
    * @returns Number
    */
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Convenience method
    * @returns Object
    */
  var getValues: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[typings.senchaTouch.Ext.field.IField]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of increment
    * @param increment Number The new value.
    */
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Object The new value.
    */
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Convenience method
    * @param value Object
    */
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[Any] = js.undefined
}
object ISlider {
  
  inline def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISlider] (val x: Self) extends AnyVal {
    
    inline def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetIncrement(value: () => Double): Self = StObject.set(x, "getIncrement", js.Any.fromFunction0(value))
    
    inline def setGetIncrementUndefined: Self = StObject.set(x, "getIncrement", js.undefined)
    
    inline def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    inline def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    inline def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
    
    inline def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    inline def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
    
    inline def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
    
    inline def setGetValues(value: () => Any): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReset(value: () => typings.senchaTouch.Ext.field.IField): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIncrement", js.Any.fromFunction1(value))
    
    inline def setSetIncrementUndefined: Self = StObject.set(x, "setIncrement", js.undefined)
    
    inline def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    inline def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    inline def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    inline def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    inline def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTabIndex", js.Any.fromFunction1(value))
    
    inline def setSetTabIndexUndefined: Self = StObject.set(x, "setTabIndex", js.undefined)
    
    inline def setSetValues(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
