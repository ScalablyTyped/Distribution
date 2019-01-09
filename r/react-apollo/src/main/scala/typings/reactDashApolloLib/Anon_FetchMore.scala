package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FetchMore[TVariables, TData] extends js.Object {
  @JSName("fetchMore")
  var fetchMore_Original: (js.Function1[
    /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
  ]) = js.native
  def fetchMore[K /* <: java.lang.String */](
    fetchMoreOptions: (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, K]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def fetchMore[TData2, TVariables2, K /* <: java.lang.String */](
    fetchMoreOptions: Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables2, K]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData2, TVariables2])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData2]] = js.native
}

