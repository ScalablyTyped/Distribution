package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOpts[TGraphQLVariables] extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[_]] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errorPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var partialRefetch: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[TGraphQLVariables] = js.undefined
}

object QueryOpts {
  @scala.inline
  def apply[TGraphQLVariables](
    client: apolloDashClientLib.apolloDashClientMod.default[_] = null,
    context: stdLib.Record[java.lang.String, _] = null,
    errorPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    partialRefetch: js.UndefOr[scala.Boolean] = js.undefined,
    pollInterval: scala.Int | scala.Double = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined,
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
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOpts[TGraphQLVariables]]
  }
}

