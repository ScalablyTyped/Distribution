package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousSizeLegendProps extends js.Object {
  
   // default: ''
  var circlesTotal: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
   // default: 10
  var endSize: js.UndefOr[Double] = js.native
  
   // default: 20
  var endTitle: Double | String = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var startSize: js.UndefOr[Double] = js.native
  
   // default: 2
  var startTitle: Double | String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ContinuousSizeLegendProps {
  
  @scala.inline
  def apply(endTitle: Double | String, startTitle: Double | String): ContinuousSizeLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousSizeLegendProps]
  }
  
  @scala.inline
  implicit class ContinuousSizeLegendPropsOps[Self <: ContinuousSizeLegendProps] (val x: Self) extends AnyVal {
    
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
    def setEndTitle(value: Double | String): Self = this.set("endTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTitle(value: Double | String): Self = this.set("startTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCirclesTotal(value: Double): Self = this.set("circlesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCirclesTotal: Self = this.set("circlesTotal", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEndSize(value: Double): Self = this.set("endSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndSize: Self = this.set("endSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setStartSize(value: Double): Self = this.set("startSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSize: Self = this.set("startSize", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
