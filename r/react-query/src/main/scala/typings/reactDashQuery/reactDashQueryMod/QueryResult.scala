package typings.reactDashQuery.reactDashQueryMod

import typings.reactDashQuery.Anon_Args
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[TResult, TVariables] extends js.Object {
  var data: Null | TResult = js.native
  var error: Null | Error = js.native
  var failureCount: Double = js.native
  var isCached: Boolean = js.native
  var isFetching: Boolean = js.native
  var isLoading: Boolean = js.native
  def refetch(): js.Promise[Unit] = js.native
  def refetch(arg: Anon_Args[TVariables]): js.Promise[Unit] = js.native
}

