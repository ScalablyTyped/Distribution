package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionID
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionInternalEvent
import typings.relayDashRuntime.libStoreRelayConnectionMod.PageInfo
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: ConnectionID
  var edgeIDs: js.Array[String]
  var kind: String
  var pageInfo: PageInfo
  var request: RequestDescriptor
}

object Anon_Args {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: ConnectionID,
    edgeIDs: js.Array[String],
    kind: String,
    pageInfo: PageInfo,
    request: RequestDescriptor
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeIDs = edgeIDs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

