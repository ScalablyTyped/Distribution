package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | reactDashApolloLib.typesMod.RefetchQueriesProviderFn
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object MutationOptions {
  @scala.inline
  def apply[TData, TVariables](
    awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined,
    context: stdLib.Record[java.lang.String, _] = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    optimisticResponse: TData = null,
    refetchQueries: (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | reactDashApolloLib.typesMod.RefetchQueriesProviderFn = null,
    update: MutationUpdaterFn[TData] = null,
    variables: TVariables = null
  ): MutationOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (context != null) __obj.updateDynamic("context")(context)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[TData, TVariables]]
  }
}

