package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatedQueryLoadingResult[TResult]
  extends QueryResultBase[TResult]
     with PaginatedQueryResult[TResult] {
   // even when error, data can have stale data
  @JSName("error")
  var error_PaginatedQueryLoadingResult: js.Any | Null = js.native
   // even when error, data can have stale data
  var latestData: js.UndefOr[TResult] = js.native
  var resolvedData: js.UndefOr[TResult] = js.native
  @JSName("status")
  var status_PaginatedQueryLoadingResult: loading = js.native
}

