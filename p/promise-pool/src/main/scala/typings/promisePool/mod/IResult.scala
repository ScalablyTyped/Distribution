package typings.promisePool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var fulfilled: Double
  var rejected: Double
  var total: Double
}

object IResult {
  @scala.inline
  def apply(fulfilled: Double, rejected: Double, total: Double): IResult = {
    val __obj = js.Dynamic.literal(fulfilled = fulfilled.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
}

