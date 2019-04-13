package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationProps[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var ignoreResults: js.UndefOr[scala.Boolean] = js.undefined
  var mutation: graphqlLib.languageAstMod.DocumentNode
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | reactDashApolloLib.typesMod.RefetchQueriesProviderFn
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
  def children(mutateFn: MutationFn[TData, TVariables], result: MutationResult[TData]): reactLib.reactMod.ReactNode
}

object MutationProps {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFn[TData, TVariables], MutationResult[TData]) => reactLib.reactMod.ReactNode,
    mutation: graphqlLib.languageAstMod.DocumentNode,
    awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined,
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null,
    context: stdLib.Record[java.lang.String, _] = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    ignoreResults: js.UndefOr[scala.Boolean] = js.undefined,
    onCompleted: /* data */ TData => scala.Unit = null,
    onError: /* error */ apolloDashClientLib.apolloDashClientMod.ApolloError => scala.Unit = null,
    optimisticResponse: TData = null,
    refetchQueries: (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | reactDashApolloLib.typesMod.RefetchQueriesProviderFn = null,
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

