package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 2 members from Set(std.Pick<apollo-client.apollo-client.ObservableQuery<TData, TVariables>, 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables'>, react-apollo.react-apollo/Query.ObservableQueryFields<TData, TVariables>) */ trait QueryResult[TData, TVariables] extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[_]
  var data: js.UndefOr[TData]
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ reactDashApolloLib.Anon_Query with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
  ])
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
}

