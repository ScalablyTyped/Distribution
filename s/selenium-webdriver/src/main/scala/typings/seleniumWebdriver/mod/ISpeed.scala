package typings.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpeed extends js.Object {
  
  var xspeed: Double = js.native
  
  var yspeed: Double = js.native
}
object ISpeed {
  
  @scala.inline
  def apply(xspeed: Double, yspeed: Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeed]
  }
  
  @scala.inline
  implicit class ISpeedOps[Self <: ISpeed] (val x: Self) extends AnyVal {
    
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
    def setXspeed(value: Double): Self = this.set("xspeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYspeed(value: Double): Self = this.set("yspeed", value.asInstanceOf[js.Any])
  }
}
