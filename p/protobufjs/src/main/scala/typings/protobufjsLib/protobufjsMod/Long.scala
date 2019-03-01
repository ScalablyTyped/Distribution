package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  /** High bits */
  var high: scala.Double
  /** Low bits */
  var low: scala.Double
  /** Whether unsigned or not */
  var unsigned: scala.Boolean
}

object Long {
  @scala.inline
  def apply(high: scala.Double, low: scala.Double, unsigned: scala.Boolean): Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("high")(high)
    __obj.updateDynamic("low")(low)
    __obj.updateDynamic("unsigned")(unsigned)
    __obj.asInstanceOf[Long]
  }
}

