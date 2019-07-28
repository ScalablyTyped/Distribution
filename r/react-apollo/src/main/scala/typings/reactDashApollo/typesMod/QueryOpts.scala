package typings.reactDashApollo.typesMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOpts[TGraphQLVariables] extends js.Object {
  var client: js.UndefOr[default[_]] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined
  var partialRefetch: js.UndefOr[Boolean] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var returnPartialData: js.UndefOr[Boolean] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
  var variables: js.UndefOr[TGraphQLVariables] = js.undefined
}

object QueryOpts {
  @scala.inline
  def apply[TGraphQLVariables](
    client: default[_] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    partialRefetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: TGraphQLVariables = null
  ): QueryOpts[TGraphQLVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (!js.isUndefined(partialRefetch)) __obj.updateDynamic("partialRefetch")(partialRefetch)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOpts[TGraphQLVariables]]
  }
}

