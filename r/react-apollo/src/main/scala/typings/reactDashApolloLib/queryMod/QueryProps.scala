package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryProps[TData, TVariables]
  extends reactDashApolloLib.typesMod.QueryOpts[TVariables] {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData | js.Object, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  def children(result: QueryResult[TData, TVariables]): reactLib.reactMod.ReactNs.ReactNode
}

object QueryProps {
  @scala.inline
  def apply[TData, TVariables](
    children: js.Function1[QueryResult[TData, TVariables], reactLib.reactMod.ReactNs.ReactNode],
    query: graphqlLib.languageAstMod.DocumentNode,
    client: apolloDashClientLib.apolloDashClientMod.default[_] = null,
    context: stdLib.Record[java.lang.String, _] = null,
    displayName: java.lang.String = null,
    errorPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    onCompleted: js.Function1[/* data */ TData | js.Object, scala.Unit] = null,
    onError: js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit] = null,
    partialRefetch: js.UndefOr[scala.Boolean] = js.undefined,
    pollInterval: scala.Int | scala.Double = null,
    skip: js.UndefOr[scala.Boolean] = js.undefined,
    ssr: js.UndefOr[scala.Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryProps[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("query")(query)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(onCompleted)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (!js.isUndefined(partialRefetch)) __obj.updateDynamic("partialRefetch")(partialRefetch)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryProps[TData, TVariables]]
  }
}

