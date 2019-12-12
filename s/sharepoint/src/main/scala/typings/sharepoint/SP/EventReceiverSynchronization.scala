package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.EventReceiverSynchronization.asynchronous
import typings.sharepoint.SP.EventReceiverSynchronization.defaultSynchronization
import typings.sharepoint.SP.EventReceiverSynchronization.synchronous
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventReceiverSynchronization with Double] = js.native
  /* 2 */ @js.native
  object asynchronous extends TopLevel[asynchronous with Double]
  
  /* 0 */ @js.native
  object defaultSynchronization extends TopLevel[defaultSynchronization with Double]
  
  /* 1 */ @js.native
  object synchronous extends TopLevel[synchronous with Double]
  
}

