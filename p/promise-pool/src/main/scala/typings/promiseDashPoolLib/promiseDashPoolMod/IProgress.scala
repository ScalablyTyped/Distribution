package typings
package promiseDashPoolLib.promiseDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgress extends js.Object {
  var error: js.Any
  var fulfilled: scala.Double
  var index: scala.Double
  var pending: scala.Double
  var rejected: scala.Double
  var retries: scala.Double
  var success: scala.Boolean
  var total: scala.Double
}

object IProgress {
  @scala.inline
  def apply(
    error: js.Any,
    fulfilled: scala.Double,
    index: scala.Double,
    pending: scala.Double,
    rejected: scala.Double,
    retries: scala.Double,
    success: scala.Boolean,
    total: scala.Double
  ): IProgress = {
    val __obj = js.Dynamic.literal(error = error, fulfilled = fulfilled, index = index, pending = pending, rejected = rejected, retries = retries, success = success, total = total)
  
    __obj.asInstanceOf[IProgress]
  }
}

