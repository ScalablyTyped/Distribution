package typings.protobufjs.protobufjsMod

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
    val __obj = js.Dynamic.literal(high = high, low = low, unsigned = unsigned)
  
    __obj.asInstanceOf[Long]
  }
}

