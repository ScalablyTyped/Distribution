package typings.senchaTouch.Ext.chart.axis.layout

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.chart.axis.IAxis
import typings.senchaTouch.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayout extends IBase {
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.native
  
  /** [Method] Calculates the position of tick marks for the axis
    * @param context Object
    * @returns *
    */
  var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Calculates the position of major ticks for the axis
    * @param context Object
    */
  var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Calculates the position of sub ticks for the axis
    * @param context Object
    */
  var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the value of axis
    * @returns Ext.chart.axis.Axis
    */
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  
  /** [Method] Processes the data of the series bound to the axis
    * @param series Ext.chart.series.Series The bound series.
    */
  var processData: js.UndefOr[js.Function1[/* series */ js.UndefOr[ISeries], Unit]] = js.native
  
  /** [Method] Sets the value of axis
    * @param axis Ext.chart.axis.Axis The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
  
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
    * @param context Object
    * @param min Number
    * @param max Number
    * @param estStepSize Number
    */
  var snapEnds: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStepSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
    * @param context Object
    * @param out Object
    * @param trimMin Number
    * @param trimMax Number
    */
  var trimByRange: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[Double], 
      /* trimMax */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}
object ILayout {
  
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: IAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setCalculateLayout(value: /* context */ js.UndefOr[js.Any] => _): Self = this.set("calculateLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateLayout: Self = this.set("calculateLayout", js.undefined)
    
    @scala.inline
    def setCalculateMajorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = this.set("calculateMajorTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateMajorTicks: Self = this.set("calculateMajorTicks", js.undefined)
    
    @scala.inline
    def setCalculateMinorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = this.set("calculateMinorTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateMinorTicks: Self = this.set("calculateMinorTicks", js.undefined)
    
    @scala.inline
    def setGetAxis(value: () => IAxis): Self = this.set("getAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAxis: Self = this.set("getAxis", js.undefined)
    
    @scala.inline
    def setProcessData(value: /* series */ js.UndefOr[ISeries] => Unit): Self = this.set("processData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    
    @scala.inline
    def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = this.set("setAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAxis: Self = this.set("setAxis", js.undefined)
    
    @scala.inline
    def setSnapEnds(
      value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStepSize */ js.UndefOr[Double]) => Unit
    ): Self = this.set("snapEnds", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteSnapEnds: Self = this.set("snapEnds", js.undefined)
    
    @scala.inline
    def setTrimByRange(
      value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit
    ): Self = this.set("trimByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTrimByRange: Self = this.set("trimByRange", js.undefined)
  }
}
