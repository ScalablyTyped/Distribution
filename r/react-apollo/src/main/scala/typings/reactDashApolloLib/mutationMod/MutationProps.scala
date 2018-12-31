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
  def children(mutateFn: MutationFn[TData, TVariables], result: MutationResult[TData]): reactLib.reactMod.ReactNs.ReactNode
}

