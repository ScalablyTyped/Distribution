package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousColorLegendProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var endColor: js.UndefOr[String] = js.native
  
   // default: '#FF9833'
  var endTitle: Double | String = js.native
  
   // default: ''
  var height: js.UndefOr[Double] = js.native
  
  var midColor: js.UndefOr[String] = js.native
  
  var midTitle: js.UndefOr[Double | String] = js.native
  
  var startColor: js.UndefOr[String] = js.native
  
   // default: '#EF5D28'
  var startTitle: Double | String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ContinuousColorLegendProps {
  
  @scala.inline
  def apply(endTitle: Double | String, startTitle: Double | String): ContinuousColorLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousColorLegendProps]
  }
  
  @scala.inline
  implicit class ContinuousColorLegendPropsOps[Self <: ContinuousColorLegendProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEndColor(value: String): Self = this.set("endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColor: Self = this.set("endColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMidColor(value: String): Self = this.set("midColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidColor: Self = this.set("midColor", js.undefined)
    
    @scala.inline
    def setMidTitle(value: Double | String): Self = this.set("midTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidTitle: Self = this.set("midTitle", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = this.set("startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColor: Self = this.set("startColor", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
