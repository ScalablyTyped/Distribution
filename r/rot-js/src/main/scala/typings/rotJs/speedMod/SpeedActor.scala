package typings.rotJs.speedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeedActor extends js.Object {
  
  def getSpeed(): Double = js.native
}
object SpeedActor {
  
  @scala.inline
  def apply(getSpeed: () => Double): SpeedActor = {
    val __obj = js.Dynamic.literal(getSpeed = js.Any.fromFunction0(getSpeed))
    __obj.asInstanceOf[SpeedActor]
  }
  
  @scala.inline
  implicit class SpeedActorOps[Self <: SpeedActor] (val x: Self) extends AnyVal {
    
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
    def setGetSpeed(value: () => Double): Self = this.set("getSpeed", js.Any.fromFunction0(value))
  }
}
