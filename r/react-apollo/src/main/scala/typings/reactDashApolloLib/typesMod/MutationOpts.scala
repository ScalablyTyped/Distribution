package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationOpts[TData, TGraphQLVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[_]] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errorPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy] = js.undefined
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

