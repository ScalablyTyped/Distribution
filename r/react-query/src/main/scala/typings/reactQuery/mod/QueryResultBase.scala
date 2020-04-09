package typings.reactQuery.mod

import typings.reactQuery.AnonForce
import typings.reactQuery.reactQueryStrings.error
import typings.reactQuery.reactQueryStrings.loading
import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultBase[TResult] extends js.Object {
  var error: Null | js.Any = js.native
  var failureCount: Double = js.native
  var isFetching: Boolean = js.native
  var status: loading | error | success = js.native
  def refetch(): js.Promise[TResult] = js.native
  def refetch(hasForceThrowOnError: AnonForce): js.Promise[TResult] = js.native
}

