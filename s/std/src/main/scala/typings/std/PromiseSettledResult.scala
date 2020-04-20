package typings.std

import typings.std.stdStrings.fulfilled
import typings.std.stdStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.PromiseFulfilledResult[T]
  - typings.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends js.Object

object PromiseSettledResult {
  @scala.inline
  def PromiseFulfilledResult[T](status: fulfilled, value: T): PromiseSettledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseSettledResult[T]]
  }
  @scala.inline
  def PromiseRejectedResult[T](reason: js.Any, status: rejected): PromiseSettledResult[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseSettledResult[T]]
  }
}

