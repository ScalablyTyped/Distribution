package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatedQuerySuccessResult[TResult]
  extends QueryResultBase[TResult]
     with PaginatedQueryResult[TResult] {
  @JSName("error")
  var error_PaginatedQuerySuccessResult: Null = js.native
  var latestData: TResult = js.native
  var resolvedData: TResult = js.native
  @JSName("status")
  var status_PaginatedQuerySuccessResult: success = js.native
}

