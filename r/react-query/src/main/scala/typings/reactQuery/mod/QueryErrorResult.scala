package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryErrorResult[TResult]
  extends QueryResultBase[TResult]
     with QueryResult[TResult] {
  var data: js.UndefOr[TResult] = js.native
  @JSName("status")
  var status_QueryErrorResult: error = js.native
}

