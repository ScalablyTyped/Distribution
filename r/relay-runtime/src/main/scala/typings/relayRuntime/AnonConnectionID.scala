package typings.relayRuntime

import typings.relayRuntime.relayConnectionMod.ConnectionID
import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionID extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: ConnectionID
  var edgeID: String
  var kind: String
  var request: RequestDescriptor
}

object AnonConnectionID {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): AnonConnectionID = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionID]
  }
}

