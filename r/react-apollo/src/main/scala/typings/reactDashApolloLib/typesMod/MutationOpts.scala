package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOpts[TData, TGraphQLVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[_]] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var errorPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | RefetchQueriesProviderFn
  ] = js.undefined
  var update: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TGraphQLVariables] = js.undefined
}

object MutationOpts {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined,
    client: apolloDashClientLib.apolloDashClientMod.default[_] = null,
    context: Context = null,
    errorPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    onCompleted: js.Function1[/* data */ TData, scala.Unit] = null,
    onError: js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit] = null,
    optimisticResponse: TData = null,
    refetchQueries: (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | RefetchQueriesProviderFn = null,
    update: apolloDashClientLib.coreWatchQueryOptionsMod.MutationUpdaterFn[TData] = null,
    variables: TGraphQLVariables = null
  ): MutationOpts[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(onCompleted)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOpts[TData, TGraphQLVariables]]
  }
}

