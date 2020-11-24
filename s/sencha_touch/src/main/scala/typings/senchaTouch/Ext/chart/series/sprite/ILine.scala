package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILine extends IAggregative {
  
  /** [Config Option] (Boolean) */
  var fillArea: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var preciseStroke: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var smooth: js.UndefOr[Boolean] = js.native
  
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
    def setFillArea(value: Boolean): Self = this.set("fillArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillArea: Self = this.set("fillArea", js.undefined)
    
    @scala.inline
    def setPreciseStroke(value: Boolean): Self = this.set("preciseStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreciseStroke: Self = this.set("preciseStroke", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setStep(value: Boolean): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
