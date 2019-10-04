package typings.relayDashRuntime.libStoreRelayConnectionMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInternalEvent extends js.Object {
  var args: js.UndefOr[Variables] = js.undefined
  var connectionID: js.UndefOr[ConnectionID] = js.undefined
  var edgeID: js.UndefOr[String] = js.undefined
  var edgeIDs: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var request: js.UndefOr[RequestDescriptor] = js.undefined
}

object ConnectionInternalEvent {
  @scala.inline
  def apply(
    args: Variables = null,
    connectionID: ConnectionID = null,
    edgeID: String = null,
    edgeIDs: js.Array[String] = null,
    kind: String = null,
    pageInfo: PageInfo = null,
    request: RequestDescriptor = null
  ): ConnectionInternalEvent = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (connectionID != null) __obj.updateDynamic("connectionID")(connectionID)
    if (edgeID != null) __obj.updateDynamic("edgeID")(edgeID)
    if (edgeIDs != null) __obj.updateDynamic("edgeIDs")(edgeIDs)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[ConnectionInternalEvent]
  }
}

