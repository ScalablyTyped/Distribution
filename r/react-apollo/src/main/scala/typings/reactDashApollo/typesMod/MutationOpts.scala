package typings.reactDashApollo.typesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.MutationUpdaterFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOpts[TData, TGraphQLVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var client: js.UndefOr[default[_]] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesProviderFn] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TGraphQLVariables] = js.undefined
}

object MutationOpts {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: default[_] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: /* data */ TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    optimisticResponse: TData = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesProviderFn = null,
    update: MutationUpdaterFn[TData] = null,
    variables: TGraphQLVariables = null
  ): MutationOpts[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOpts[TData, TGraphQLVariables]]
  }
}

