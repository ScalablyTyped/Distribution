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
    /* fetchMoreOptions */ Anon_Query with (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[_, java.lang.String]) with (apolloDashClientLib.coreObservableQueryMod.FetchMoreOptions[_, _]), 
    js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]
  ])
}

