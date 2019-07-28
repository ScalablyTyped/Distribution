package typings.reactDashApollo.queryMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.apolloDashClient.coreObservableQueryMod.FetchMoreOptions
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchMoreQueryOptions
import typings.reactDashApollo.Anon_FetchMore
import typings.reactDashApollo.Anon_QueryDocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables' ]: apollo-client.apollo-client.ObservableQuery<TData, TVariables>[P]} */ trait QueryResult[TData, TVariables] extends Anon_FetchMore[TVariables, TData] {
  var client: typings.apolloDashClient.apolloDashClientMod.default[_]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    client: typings.apolloDashClient.apolloDashClientMod.default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Anon_QueryDocumentNode with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    data: TData = null,
    error: ApolloError = null
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(client = client, fetchMore = fetchMore, loading = loading, networkStatus = networkStatus)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
}

