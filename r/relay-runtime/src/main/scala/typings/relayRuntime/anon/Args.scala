package typings.relayRuntime.anon

import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayConnectionMod.PageInfo
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: typings.relayRuntime.relayConnectionMod.ConnectionID
  var edgeIDs: js.Array[String]
  var kind: String
  var pageInfo: PageInfo
  var request: RequestDescriptor
}

object Args {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: typings.relayRuntime.relayConnectionMod.ConnectionID,
    edgeIDs: js.Array[String],
    kind: String,
    pageInfo: PageInfo,
    request: RequestDescriptor
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeIDs = edgeIDs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

