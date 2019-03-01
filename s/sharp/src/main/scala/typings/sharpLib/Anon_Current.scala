package typings
package sharpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var high: scala.Double
  var max: scala.Double
}

object Anon_Current {
  @scala.inline
  def apply(current: scala.Double, high: scala.Double, max: scala.Double): Anon_Current = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("high")(high)
    __obj.updateDynamic("max")(max)
    __obj.asInstanceOf[Anon_Current]
  }
}

