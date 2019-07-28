package typings.reactDashApollo.typesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.coreObservableQueryMod.FetchMoreOptions
import typings.apolloDashClient.coreObservableQueryMod.UpdateQueryOptions
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchMoreQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.SubscribeToMoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryControls[TData, TGraphQLVariables] extends js.Object {
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var networkStatus: Double = js.native
  var variables: TGraphQLVariables = js.native
  def fetchMore(
    fetchMoreOptions: (FetchMoreQueryOptions[TGraphQLVariables, _]) with (FetchMoreOptions[TData, TGraphQLVariables])
  ): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(variables: TGraphQLVariables): js.Promise[ApolloQueryResult[TData]] = js.native
  def startPolling(pollInterval: Double): Unit = js.native
  def stopPolling(): Unit = js.native
  def subscribeToMore(options: SubscribeToMoreOptions[_, typings.apolloDashClient.coreTypesMod.OperationVariables, _]): js.Function0[Unit] = js.native
  def updateQuery(mapFn: js.Function2[/* previousQueryResult */ js.Any, /* options */ UpdateQueryOptions[_], _]): Unit = js.native
}

