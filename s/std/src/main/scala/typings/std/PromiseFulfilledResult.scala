package typings.std

import typings.std.stdStrings.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseFulfilledResult[T] extends PromiseSettledResult[T] {
  var status: fulfilled
  var value: T
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[T](status: fulfilled, value: T): PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[T]]
  }
}

