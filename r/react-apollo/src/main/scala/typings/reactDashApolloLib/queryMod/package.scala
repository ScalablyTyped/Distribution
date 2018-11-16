package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryMod {
  type ObservableQueryFields[TData, TVariables] = (stdLib.Pick[
    apolloDashClientLib.apolloDashClientMod.ObservableQuery[TData, TVariables], 
    reactDashApolloLib.reactDashApolloLibStrings.startPolling | reactDashApolloLib.reactDashApolloLibStrings.stopPolling | reactDashApolloLib.reactDashApolloLibStrings.subscribeToMore | reactDashApolloLib.reactDashApolloLibStrings.updateQuery | reactDashApolloLib.reactDashApolloLibStrings.refetch | reactDashApolloLib.reactDashApolloLibStrings.variables
  ]) with (reactDashApolloLib.Anon_FetchMore[TVariables, TData])
}
