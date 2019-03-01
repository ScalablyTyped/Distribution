package typings
package scryptsyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var percent: scala.Double
  var total: scala.Double
}

object Anon_Current {
  @scala.inline
  def apply(current: scala.Double, percent: scala.Double, total: scala.Double): Anon_Current = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_Current]
  }
}

