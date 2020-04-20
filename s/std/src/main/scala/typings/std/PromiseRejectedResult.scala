package typings.std

import typings.std.stdStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejectedResult
  extends PromiseSettledResult[js.Any] {
  var reason: js.Any
  var status: rejected
}

object PromiseRejectedResult {
  @scala.inline
  def apply(reason: js.Any, status: rejected): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectedResult]
  }
}

