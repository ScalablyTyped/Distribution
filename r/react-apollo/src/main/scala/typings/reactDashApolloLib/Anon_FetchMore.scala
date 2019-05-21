package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchMore[TVariables, TData] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
  ])
}

object Anon_FetchMore {
  @scala.inline
  def apply[TVariables, TData](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[TData, TVariables]), 
      js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Anon_QueryDocumentNode with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
      js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
    ])
  ): Anon_FetchMore[TVariables, TData] = {
    val __obj = js.Dynamic.literal(fetchMore = fetchMore)
  
    __obj.asInstanceOf[Anon_FetchMore[TVariables, TData]]
  }
}

