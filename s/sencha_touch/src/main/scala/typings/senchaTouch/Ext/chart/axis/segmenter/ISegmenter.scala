package typings.senchaTouch.Ext.chart.axis.segmenter

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISegmenter extends IBase {
  
  /** [Method] Add step units to the value
    * @param value * The value to be added.
    * @param step Number The step of units. Negative value are allowed.
    * @param unit * The unit.
    */
  var add: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Align value with step of units
    * @param value * The value to be aligned.
    * @param step Number The step of units.
    * @param unit * The unit.
    * @returns * Aligned value.
    */
  var align: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.native
  
  /** [Method] Returns the difference between the min and max value based on the given unit scale
    * @param min * The smaller value.
    * @param max * The larger value.
    * @param unit * The unit scale. Unit can be any type.
    * @returns Number The number of units between min and max. It is the minimum n that min + n * unit >= max.
    */
  var diff: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      Double
    ]
  ] = js.native
  
  /** [Method] Convert from any data into the target type
    * @param value * The value to convert from
    * @returns * The converted value.
    */
  var from: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of axis
    * @returns Ext.chart.axis.Axis
    */
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
    * @param start * The start point of range.
    * @param estStepSize * The estimated step size.
    * @returns Object Return the step size by an object of step x unit.
    */
  var preferredStep: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Method] This method formats the value
    * @param value * The value to format.
    * @param context Object Axis layout context.
    * @returns String
    */
  var renderer: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], String]
  ] = js.native
  
  /** [Method] Sets the value of axis
    * @param axis Ext.chart.axis.Axis The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
}
object ISegmenter {
  
  @scala.inline
  def apply(): ISegmenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmenter]
  }
  
  @scala.inline
  implicit class ISegmenterOps[Self <: ISegmenter] (val x: Self) extends AnyVal {
    
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
    def setAdd(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAlign(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => _
    ): Self = this.set("align", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAxis(value: IAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setDiff(
      value: (/* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Double
    ): Self = this.set("diff", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setFrom(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("from", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGetAxis(value: () => IAxis): Self = this.set("getAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAxis: Self = this.set("getAxis", js.undefined)
    
    @scala.inline
    def setPreferredStep(value: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _): Self = this.set("preferredStep", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreferredStep: Self = this.set("preferredStep", js.undefined)
    
    @scala.inline
    def setRenderer(value: (/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any]) => String): Self = this.set("renderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = this.set("setAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAxis: Self = this.set("setAxis", js.undefined)
  }
}
