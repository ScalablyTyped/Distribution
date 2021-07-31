package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolStateType extends StObject {
  
  var activeConnectionCount: Double
  
  var ended: Boolean
  
  var idleConnectionCount: Double
  
  var waitingClientCount: Double
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
  implicit class PoolStateTypeMutableBuilder[Self <: PoolStateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveConnectionCount(value: Double): Self = StObject.set(x, "activeConnectionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleConnectionCount(value: Double): Self = StObject.set(x, "idleConnectionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingClientCount(value: Double): Self = StObject.set(x, "waitingClientCount", value.asInstanceOf[js.Any])
  }
}
