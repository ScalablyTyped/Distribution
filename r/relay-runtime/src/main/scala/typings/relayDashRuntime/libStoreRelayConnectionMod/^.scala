package typings.relayDashRuntime.libStoreRelayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayConnection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONNECTION_KEY: String = js.native
  val CONNECTION_TYPENAME: String = js.native
  def createConnectionID(parentID: String, label: String): ConnectionID = js.native
  def createConnectionRecord(connectionID: ConnectionID): ConnectionRecord = js.native
}

