package typings.reactTypingAnimation.mod.Typing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeedProperties extends js.Object {
  
  var ms: Double = js.native
}
object SpeedProperties {
  
  @scala.inline
  def apply(ms: Double): SpeedProperties = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedProperties]
  }
  
  @scala.inline
  implicit class SpeedPropertiesOps[Self <: SpeedProperties] (val x: Self) extends AnyVal {
    
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
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
  }
}
