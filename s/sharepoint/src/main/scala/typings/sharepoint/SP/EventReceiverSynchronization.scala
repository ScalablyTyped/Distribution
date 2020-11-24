package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
