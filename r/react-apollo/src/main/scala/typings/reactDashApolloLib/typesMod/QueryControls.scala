package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryControls[TData, TGraphQLVariables] extends js.Object {
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.native
  var loading: scala.Boolean = js.native
  var networkStatus: scala.Double = js.native
  var variables: TGraphQLVariables = js.native
  def fetchMore(
    fetchMoreOptions: (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TGraphQLVariables, _]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TGraphQLVariables])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def refetch(): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def refetch(variables: TGraphQLVariables): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def startPolling(pollInterval: scala.Double): scala.Unit = js.native
  def stopPolling(): scala.Unit = js.native
  def subscribeToMore(
    options: apolloDashClientLib.coreWatchQueryOptionsMod.SubscribeToMoreOptions[_, apolloDashClientLib.coreTypesMod.OperationVariables, _]
  ): js.Function0[scala.Unit] = js.native
  def updateQuery(
    mapFn: js.Function2[
      /* previousQueryResult */ js.Any, 
      /* options */ apolloDashClientLib.coreObservableQueryMod.UpdateQueryOptions[_], 
      _
    ]
  ): scala.Unit = js.native
}

