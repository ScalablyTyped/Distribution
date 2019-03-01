package typings
package protonDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HW extends js.Object {
  var h: scala.Double
  var w: scala.Double
}

object Anon_HW {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double): Anon_HW = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.asInstanceOf[Anon_HW]
  }
}

