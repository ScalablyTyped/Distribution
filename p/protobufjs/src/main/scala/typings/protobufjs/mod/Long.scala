package typings.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  /** High bits */
  var high: Double
  /** Low bits */
  var low: Double
  /** Whether unsigned or not */
  var unsigned: Boolean
}

object Long {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): Long = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
}

