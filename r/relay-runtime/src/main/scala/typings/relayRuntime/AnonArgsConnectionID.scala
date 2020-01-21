package typings.relayRuntime

import typings.relayRuntime.relayConnectionMod.ConnectionID
import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsConnectionID extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: ConnectionID
  var edgeID: String
  var kind: String
  var request: RequestDescriptor
}

object AnonArgsConnectionID {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): AnonArgsConnectionID = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsConnectionID]
  }
}

