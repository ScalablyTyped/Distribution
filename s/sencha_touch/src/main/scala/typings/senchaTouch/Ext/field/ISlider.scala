package typings.senchaTouch.Ext.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlider extends IField {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of increment
    * @returns Number
    */
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Convenience method
    * @returns Object
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[IField]] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of increment
    * @param increment Number The new value.
    */
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Object The new value.
    */
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Convenience method
    * @param value Object
    */
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.native
}
object ISlider {
  
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  
  @scala.inline
  implicit class ISliderMutableBuilder[Self <: ISlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    @scala.inline
    def setGetIncrement(value: () => Double): Self = StObject.set(x, "getIncrement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIncrementUndefined: Self = StObject.set(x, "getIncrement", js.undefined)
    
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    @scala.inline
    def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
    
    @scala.inline
    def setGetValues(value: () => _): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReset(value: () => IField): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    @scala.inline
    def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIncrement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIncrementUndefined: Self = StObject.set(x, "setIncrement", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    @scala.inline
    def setSetTabIndex(value: /* tabIndex */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTabIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabIndexUndefined: Self = StObject.set(x, "setTabIndex", js.undefined)
    
    @scala.inline
    def setSetValues(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
