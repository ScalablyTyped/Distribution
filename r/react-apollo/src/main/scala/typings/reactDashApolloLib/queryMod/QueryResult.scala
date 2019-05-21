package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables' ]: apollo-client.apollo-client.ObservableQuery<TData, TVariables>[P]} */ trait QueryResult[TData, TVariables]
  extends reactDashApolloLib.Anon_FetchMore[TVariables, TData] {
  var client: apolloDashClientLib.apolloDashClientMod.default[_]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    client: apolloDashClientLib.apolloDashClientMod.default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
      js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ reactDashApolloLib.Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
      js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
    ]),
    loading: scala.Boolean,
    networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus,
    data: TData = null,
    error: apolloDashClientLib.apolloDashClientMod.ApolloError = null
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(client = client, fetchMore = fetchMore, loading = loading, networkStatus = networkStatus)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
}

