package typings.relayRuntime

import typings.relayRuntime.relayConnectionMod.ConnectionID
import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayConnectionMod.PageInfo
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: ConnectionID
  var edgeIDs: js.Array[String]
  var kind: String
  var pageInfo: PageInfo
  var request: RequestDescriptor
}

object AnonArgs {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: ConnectionID,
    edgeIDs: js.Array[String],
    kind: String,
    pageInfo: PageInfo,
    request: RequestDescriptor
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeIDs = edgeIDs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

