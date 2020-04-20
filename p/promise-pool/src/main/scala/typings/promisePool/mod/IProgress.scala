package typings.promisePool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgress extends js.Object {
  var error: js.Any
  var fulfilled: Double
  var index: Double
  var pending: Double
  var rejected: Double
  var retries: Double
  var success: Boolean
  var total: Double
}

object IProgress {
  @scala.inline
  def apply(
    error: js.Any,
    fulfilled: Double,
    index: Double,
    pending: Double,
    rejected: Double,
    retries: Double,
    success: Boolean,
    total: Double
  ): IProgress = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fulfilled = fulfilled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgress]
  }
}

