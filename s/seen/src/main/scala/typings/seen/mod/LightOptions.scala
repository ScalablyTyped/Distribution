package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightOptions extends js.Object {
  
  var color: js.UndefOr[Color] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var intensity: js.UndefOr[Double] = js.native
  
  var normal: js.UndefOr[Point] = js.native
  
  var point: js.UndefOr[Point] = js.native
}
object LightOptions {
  
  @scala.inline
  def apply(): LightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightOptions]
  }
  
  @scala.inline
  implicit class LightOptionsOps[Self <: LightOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntensity: Self = this.set("intensity", js.undefined)
    
    @scala.inline
    def setNormal(value: Point): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
  }
}
