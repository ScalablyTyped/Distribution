package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables' ]: apollo-client.apollo-client.ObservableQuery<TData, TVariables>[P]}
- Lifted 3 members from Set(react-apollo.react-apollo/Query.ObservableQueryFields<TData, TVariables>) */ @js.native
trait QueryResult[TData, TVariables] extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[_] = js.native
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.native
  @JSName("fetchMore")
  var fetchMore_Original: (js.Function1[
    /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ reactDashApolloLib.Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
  ]) = js.native
  var loading: scala.Boolean = js.native
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus = js.native
  def fetchMore[K /* <: java.lang.String */](
    fetchMoreOptions: (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, K]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def fetchMore[TData2, TVariables2, K /* <: java.lang.String */](
    fetchMoreOptions: reactDashApolloLib.Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables2, K]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData2, TVariables2])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData2]] = js.native
}

