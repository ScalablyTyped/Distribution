package typings.promiseDashPool.promiseDashPoolMod

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
    val __obj = js.Dynamic.literal(error = error, fulfilled = fulfilled, index = index, pending = pending, rejected = rejected, retries = retries, success = success, total = total)
  
    __obj.asInstanceOf[IProgress]
  }
}

