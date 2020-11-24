package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyToInterpolatorProps extends js.Object {
  
  var curve: js.UndefOr[Double] = js.native
  
  var maxDuration: js.UndefOr[Double] = js.native
  
  var screenSpeed: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object FlyToInterpolatorProps {
  
  @scala.inline
  def apply(): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
  
  @scala.inline
  implicit class FlyToInterpolatorPropsOps[Self <: FlyToInterpolatorProps] (val x: Self) extends AnyVal {
    
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
    def setCurve(value: Double): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    
    @scala.inline
    def setScreenSpeed(value: Double): Self = this.set("screenSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenSpeed: Self = this.set("screenSpeed", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
}
