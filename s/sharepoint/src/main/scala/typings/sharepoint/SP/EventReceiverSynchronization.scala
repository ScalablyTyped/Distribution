package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventReceiverSynchronization extends js.Object

@JSGlobal("SP.EventReceiverSynchronization")
@js.native
object EventReceiverSynchronization extends js.Object {
  @js.native
  sealed trait asynchronous extends EventReceiverSynchronization
  
  @js.native
  sealed trait defaultSynchronization extends EventReceiverSynchronization
  
  @js.native
  sealed trait synchronous extends EventReceiverSynchronization
  
  /* 2 */ val asynchronous: typings.sharepoint.SP.EventReceiverSynchronization.asynchronous with Double = js.native
  /* 0 */ val defaultSynchronization: typings.sharepoint.SP.EventReceiverSynchronization.defaultSynchronization with Double = js.native
  /* 1 */ val synchronous: typings.sharepoint.SP.EventReceiverSynchronization.synchronous with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventReceiverSynchronization with Double] = js.native
}

