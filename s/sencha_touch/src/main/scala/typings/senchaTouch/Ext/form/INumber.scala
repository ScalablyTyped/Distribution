package typings.senchaTouch.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumber
  extends typings.senchaTouch.Ext.field.IText {
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.native
}
object INumber {
  
  @scala.inline
  def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  
  @scala.inline
  implicit class INumberMutableBuilder[Self <: INumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    @scala.inline
    def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    @scala.inline
    def setGetStepValue(value: () => Double): Self = StObject.set(x, "getStepValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStepValueUndefined: Self = StObject.set(x, "getStepValue", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    @scala.inline
    def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setStepValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStepValueUndefined: Self = StObject.set(x, "setStepValue", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
  }
}
