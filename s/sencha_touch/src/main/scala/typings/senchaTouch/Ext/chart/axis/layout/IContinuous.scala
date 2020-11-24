package typings.senchaTouch.Ext.chart.axis.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContinuous extends ILayout {
  
  /** [Method] Returns the value of adjustMaximumByMajorUnit
    * @returns Boolean
    */
  var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of adjustMinimumByMajorUnit
    * @returns Boolean
    */
  var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of adjustMaximumByMajorUnit
    * @param adjustMaximumByMajorUnit Boolean The new value.
    */
  var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of adjustMinimumByMajorUnit
    * @param adjustMinimumByMajorUnit Boolean The new value.
    */
  var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
    * @param context Object
    * @param min Object
    * @param max Object
    * @param estStepSize Object
    */
  @JSName("snapEnds")
  var snapEnds_IContinuous: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IContinuous {
  
  @scala.inline
  def apply(): IContinuous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContinuous]
  }
  
  @scala.inline
  implicit class IContinuousOps[Self <: IContinuous] (val x: Self) extends AnyVal {
    
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
    def setGetAdjustMaximumByMajorUnit(value: () => Boolean): Self = this.set("getAdjustMaximumByMajorUnit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAdjustMaximumByMajorUnit: Self = this.set("getAdjustMaximumByMajorUnit", js.undefined)
    
    @scala.inline
    def setGetAdjustMinimumByMajorUnit(value: () => Boolean): Self = this.set("getAdjustMinimumByMajorUnit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAdjustMinimumByMajorUnit: Self = this.set("getAdjustMinimumByMajorUnit", js.undefined)
    
    @scala.inline
    def setSetAdjustMaximumByMajorUnit(value: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = this.set("setAdjustMaximumByMajorUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAdjustMaximumByMajorUnit: Self = this.set("setAdjustMaximumByMajorUnit", js.undefined)
    
    @scala.inline
    def setSetAdjustMinimumByMajorUnit(value: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = this.set("setAdjustMinimumByMajorUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAdjustMinimumByMajorUnit: Self = this.set("setAdjustMinimumByMajorUnit", js.undefined)
    
    @scala.inline
    def setSnapEnds(
      value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("snapEnds", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteSnapEnds: Self = this.set("snapEnds", js.undefined)
  }
}
