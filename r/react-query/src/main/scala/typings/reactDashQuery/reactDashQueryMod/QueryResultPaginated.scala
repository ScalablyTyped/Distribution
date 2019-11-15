package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultPaginated[TResult, TVariables]
  extends QueryResult[js.Array[TResult], TVariables] {
  var canFetchMore: Boolean = js.native
  var isFetchingMore: Boolean = js.native
  def fetchMore(): js.Promise[TResult] = js.native
  def fetchMore(variables: TVariables): js.Promise[TResult] = js.native
}

