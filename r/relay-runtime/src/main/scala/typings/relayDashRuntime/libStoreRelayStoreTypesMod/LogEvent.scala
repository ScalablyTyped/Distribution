package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEvent extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var info: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[RequestParameters] = js.undefined
  var response: js.UndefOr[GraphQLResponse] = js.undefined
  var transactionID: js.UndefOr[Double] = js.undefined
  var variables: js.UndefOr[Variables] = js.undefined
}

object LogEvent {
  @scala.inline
  def apply(
    error: Error = null,
    info: js.Any = null,
    name: String = null,
    params: RequestParameters = null,
    response: GraphQLResponse = null,
    transactionID: Int | Double = null,
    variables: Variables = null
  ): LogEvent = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    if (response != null) __obj.updateDynamic("response")(response)
    if (transactionID != null) __obj.updateDynamic("transactionID")(transactionID.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[LogEvent]
  }
}

