package typings.reactSpringShared.esmFrameLoopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueAnimation extends js.Object {
  
  def advance(dt: Double): Unit = js.native
  
  var idle: Boolean = js.native
  
  var priority: Double = js.native
}
object OpaqueAnimation {
  
  @scala.inline
  def apply(advance: Double => Unit, idle: Boolean, priority: Double): OpaqueAnimation = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), idle = idle.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueAnimation]
  }
  
  @scala.inline
  implicit class OpaqueAnimationOps[Self <: OpaqueAnimation] (val x: Self) extends AnyVal {
    
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
    def setAdvance(value: Double => Unit): Self = this.set("advance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdle(value: Boolean): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
}
