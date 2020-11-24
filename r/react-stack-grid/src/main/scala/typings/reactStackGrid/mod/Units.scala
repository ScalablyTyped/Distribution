package typings.reactStackGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Units extends js.Object {
  
  var angle: String = js.native
  
  var length: String = js.native
}
object Units {
  
  @scala.inline
  def apply(angle: String, length: String): Units = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Units]
  }
  
  @scala.inline
  implicit class UnitsOps[Self <: Units] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: String): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
