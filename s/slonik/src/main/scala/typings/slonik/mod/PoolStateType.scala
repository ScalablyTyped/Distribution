package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolStateType extends js.Object {
  
  var activeConnectionCount: Double = js.native
  
  var ended: Boolean = js.native
  
  var idleConnectionCount: Double = js.native
  
  var waitingClientCount: Double = js.native
}
object PoolStateType {
  
  @scala.inline
  def apply(
    activeConnectionCount: Double,
    ended: Boolean,
    idleConnectionCount: Double,
    waitingClientCount: Double
  ): PoolStateType = {
    val __obj = js.Dynamic.literal(activeConnectionCount = activeConnectionCount.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], idleConnectionCount = idleConnectionCount.asInstanceOf[js.Any], waitingClientCount = waitingClientCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolStateType]
  }
  
  @scala.inline
  implicit class PoolStateTypeOps[Self <: PoolStateType] (val x: Self) extends AnyVal {
    
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
    def setActiveConnectionCount(value: Double): Self = this.set("activeConnectionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleConnectionCount(value: Double): Self = this.set("idleConnectionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingClientCount(value: Double): Self = this.set("waitingClientCount", value.asInstanceOf[js.Any])
  }
}
