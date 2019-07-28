package typings.reactDashApollo.mutationMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchPolicy
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.ReactNode
import typings.reactDashApollo.typesMod.RefetchQueriesProviderFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationProps[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var client: js.UndefOr[typings.apolloDashClient.apolloDashClientMod.default[js.Object]] = js.undefined
  var context: js.UndefOr[Record[String, _]] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var ignoreResults: js.UndefOr[Boolean] = js.undefined
  var mutation: DocumentNode
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesProviderFn] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
  def children(mutateFn: MutationFn[TData, TVariables], result: MutationResult[TData]): ReactNode
}

object MutationProps {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFn[TData, TVariables], MutationResult[TData]) => ReactNode,
    mutation: DocumentNode,
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: typings.apolloDashClient.apolloDashClientMod.default[js.Object] = null,
    context: Record[String, _] = null,
    fetchPolicy: FetchPolicy = null,
    ignoreResults: js.UndefOr[Boolean] = js.undefined,
    onCompleted: /* data */ TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    optimisticResponse: TData = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesProviderFn = null,
    update: MutationUpdaterFn[TData] = null,
    variables: TVariables = null
  ): MutationProps[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation)
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(ignoreResults)) __obj.updateDynamic("ignoreResults")(ignoreResults)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationProps[TData, TVariables]]
  }
}

