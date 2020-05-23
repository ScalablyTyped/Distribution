package typings.relayRuntime.anon

import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionID extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: typings.relayRuntime.relayConnectionMod.ConnectionID
  var edgeID: String
  var kind: String
  var request: RequestDescriptor
}

object ConnectionID {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: typings.relayRuntime.relayConnectionMod.ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): ConnectionID = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionID]
  }
}

