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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fulfilled")(fulfilled)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("rejected")(rejected)
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[IProgress]
  }
}

