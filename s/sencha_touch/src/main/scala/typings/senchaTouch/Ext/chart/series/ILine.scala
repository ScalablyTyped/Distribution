package typings.senchaTouch.Ext.chart.series

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILine extends ICartesian {
  
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of aggregator
    * @returns Object
    */
  var getAggregator: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of fill
    * @returns Boolean
    */
  var getFill: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of selectionTolerance
    * @returns Number
    */
  var getSelectionTolerance: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of smooth
    * @returns Boolean/Number
    */
  var getSmooth: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of step
    * @returns Boolean
    */
  var getStep: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of aggregator
    * @param aggregator Object The new value.
    */
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of fill
    * @param fill Boolean The new value.
    */
  var setFill: js.UndefOr[js.Function1[/* fill */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of selectionTolerance
    * @param selectionTolerance Number The new value.
    */
  var setSelectionTolerance: js.UndefOr[js.Function1[/* selectionTolerance */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of smooth
    * @param smooth Boolean/Number The new value.
    */
  var setSmooth: js.UndefOr[js.Function1[/* smooth */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of step
    * @param step Boolean The new value.
    */
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[Boolean] = js.native
}
object ILine {
  
  @scala.inline
  def apply(): ILine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILine]
  }
  
  @scala.inline
  implicit class ILineMutableBuilder[Self <: ILine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGetAggregator(value: () => _): Self = StObject.set(x, "getAggregator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
    
    @scala.inline
    def setGetFill(value: () => Boolean): Self = StObject.set(x, "getFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillUndefined: Self = StObject.set(x, "getFill", js.undefined)
    
    @scala.inline
    def setGetSelectionTolerance(value: () => Double): Self = StObject.set(x, "getSelectionTolerance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionToleranceUndefined: Self = StObject.set(x, "getSelectionTolerance", js.undefined)
    
    @scala.inline
    def setGetSmooth(value: () => _): Self = StObject.set(x, "getSmooth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSmoothUndefined: Self = StObject.set(x, "getSmooth", js.undefined)
    
    @scala.inline
    def setGetStep(value: () => Boolean): Self = StObject.set(x, "getStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
    
    @scala.inline
    def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
    
    @scala.inline
    def setSetAggregator(value: /* aggregator */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
    
    @scala.inline
    def setSetFill(value: /* fill */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFillUndefined: Self = StObject.set(x, "setFill", js.undefined)
    
    @scala.inline
    def setSetSelectionTolerance(value: /* selectionTolerance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setSelectionTolerance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectionToleranceUndefined: Self = StObject.set(x, "setSelectionTolerance", js.undefined)
    
    @scala.inline
    def setSetSmooth(value: /* smooth */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSmooth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSmoothUndefined: Self = StObject.set(x, "setSmooth", js.undefined)
    
    @scala.inline
    def setSetStep(value: /* step */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
    
    @scala.inline
    def setSmooth(value: js.Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
