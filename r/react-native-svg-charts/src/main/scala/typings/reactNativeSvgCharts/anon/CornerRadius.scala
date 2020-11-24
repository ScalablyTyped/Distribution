package typings.reactNativeSvgCharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CornerRadius extends js.Object {
  
  var cornerRadius: js.UndefOr[Double | String] = js.native
  
  var outerRadius: js.UndefOr[Double | String] = js.native
}
object CornerRadius {
  
  @scala.inline
  def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  @scala.inline
  implicit class CornerRadiusOps[Self <: CornerRadius] (val x: Self) extends AnyVal {
    
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
    def setCornerRadius(value: Double | String): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
  }
}
