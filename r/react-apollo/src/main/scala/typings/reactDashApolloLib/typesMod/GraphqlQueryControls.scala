package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlQueryControls[TGraphQLVariables] extends js.Object {
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.native
  var loading: scala.Boolean = js.native
  var networkStatus: scala.Double = js.native
  var variables: TGraphQLVariables = js.native
  def fetchMore(
    fetchMoreOptions: (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, _]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, apolloDashClientLib.coreTypesMod.OperationVariables])
  ): stdLib.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]] = js.native
  def refetch(): stdLib.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]] = js.native
  def refetch(variables: TGraphQLVariables): stdLib.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]] = js.native
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

