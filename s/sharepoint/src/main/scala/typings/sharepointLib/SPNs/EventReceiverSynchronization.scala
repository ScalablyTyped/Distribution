package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventReceiverSynchronization extends js.Object

@JSGlobal("SP.EventReceiverSynchronization")
@js.native
object EventReceiverSynchronization extends js.Object {
  @js.native
  sealed trait asynchronous
    extends sharepointLib.SPNs.EventReceiverSynchronization
  
  @js.native
  sealed trait defaultSynchronization
    extends sharepointLib.SPNs.EventReceiverSynchronization
  
  @js.native
  sealed trait synchronous
    extends sharepointLib.SPNs.EventReceiverSynchronization
  
  /* 2 */ val asynchronous: asynchronous with scala.Double = js.native
  /* 0 */ val defaultSynchronization: defaultSynchronization with scala.Double = js.native
  /* 1 */ val synchronous: synchronous with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.EventReceiverSynchronization with scala.Double] = js.native
}

