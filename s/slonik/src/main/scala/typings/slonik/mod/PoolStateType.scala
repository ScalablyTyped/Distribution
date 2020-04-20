package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolStateType extends js.Object {
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
}

