package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables' ]: apollo-client.apollo-client.ObservableQuery<TData, TVariables>[P]} */ @js.native
trait QueryResult[TData, TVariables]
  extends reactDashApolloLib.Anon_FetchMore[TVariables, TData] {
  var client: apolloDashClientLib.apolloDashClientMod.default[_] = js.native
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.native
  var loading: scala.Boolean = js.native
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus = js.native
}

