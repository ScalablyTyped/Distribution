package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLoadingResult[TResult]
  extends QueryResultBase[TResult]
     with QueryResult[TResult] {
  var data: js.UndefOr[TResult] = js.native
   // even when error, data can have stale data
  @JSName("error")
  var error_QueryLoadingResult: js.Any | Null = js.native
  @JSName("status")
  var status_QueryLoadingResult: loading = js.native
}

