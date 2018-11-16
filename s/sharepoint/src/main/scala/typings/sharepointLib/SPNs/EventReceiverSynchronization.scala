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
  
  val asynchronous: asynchronous with java.lang.String = js.native
  val defaultSynchronization: defaultSynchronization with java.lang.String = js.native
  val synchronous: synchronous with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.EventReceiverSynchronization with java.lang.String] = js.native
}

