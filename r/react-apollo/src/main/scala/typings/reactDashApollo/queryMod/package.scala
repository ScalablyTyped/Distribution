package typings.reactDashApollo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryMod {
  import typings.apolloDashClient.apolloDashClientMod.ObservableQuery
  import typings.reactDashApollo.Anon_FetchMore
  import typings.reactDashApollo.reactDashApolloStrings.refetch
  import typings.reactDashApollo.reactDashApolloStrings.startPolling
  import typings.reactDashApollo.reactDashApolloStrings.stopPolling
  import typings.reactDashApollo.reactDashApolloStrings.subscribeToMore
  import typings.reactDashApollo.reactDashApolloStrings.updateQuery
  import typings.reactDashApollo.reactDashApolloStrings.variables
  import typings.std.Pick

  type ObservableQueryFields[TData, TVariables] = (Pick[
    ObservableQuery[TData, TVariables], 
    startPolling | stopPolling | subscribeToMore | updateQuery | refetch | variables
  ]) with (Anon_FetchMore[TVariables, TData])
}
