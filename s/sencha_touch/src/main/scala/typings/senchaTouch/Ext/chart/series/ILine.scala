package typings.senchaTouch.Ext.chart.series

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
  implicit class ILineOps[Self <: ILine] (val x: Self) extends AnyVal {
    
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
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGetAggregator(value: () => _): Self = this.set("getAggregator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAggregator: Self = this.set("getAggregator", js.undefined)
    
    @scala.inline
    def setGetFill(value: () => Boolean): Self = this.set("getFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFill: Self = this.set("getFill", js.undefined)
    
    @scala.inline
    def setGetSelectionTolerance(value: () => Double): Self = this.set("getSelectionTolerance", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionTolerance: Self = this.set("getSelectionTolerance", js.undefined)
    
    @scala.inline
    def setGetSmooth(value: () => _): Self = this.set("getSmooth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSmooth: Self = this.set("getSmooth", js.undefined)
    
    @scala.inline
    def setGetStep(value: () => Boolean): Self = this.set("getStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStep: Self = this.set("getStep", js.undefined)
    
    @scala.inline
    def setSelectionTolerance(value: Double): Self = this.set("selectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionTolerance: Self = this.set("selectionTolerance", js.undefined)
    
    @scala.inline
    def setSetAggregator(value: /* aggregator */ js.UndefOr[js.Any] => Unit): Self = this.set("setAggregator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAggregator: Self = this.set("setAggregator", js.undefined)
    
    @scala.inline
    def setSetFill(value: /* fill */ js.UndefOr[Boolean] => Unit): Self = this.set("setFill", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFill: Self = this.set("setFill", js.undefined)
    
    @scala.inline
    def setSetSelectionTolerance(value: /* selectionTolerance */ js.UndefOr[Double] => Unit): Self = this.set("setSelectionTolerance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSelectionTolerance: Self = this.set("setSelectionTolerance", js.undefined)
    
    @scala.inline
    def setSetSmooth(value: /* smooth */ js.UndefOr[js.Any] => Unit): Self = this.set("setSmooth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSmooth: Self = this.set("setSmooth", js.undefined)
    
    @scala.inline
    def setSetStep(value: /* step */ js.UndefOr[Boolean] => Unit): Self = this.set("setStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStep: Self = this.set("setStep", js.undefined)
    
    @scala.inline
    def setSmooth(value: js.Any): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setStep(value: Boolean): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
