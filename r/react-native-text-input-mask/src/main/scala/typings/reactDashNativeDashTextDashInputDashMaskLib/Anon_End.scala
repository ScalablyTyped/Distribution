package typings
package reactDashNativeDashTextDashInputDashMaskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
}

object Anon_End {
  @scala.inline
  def apply(start: scala.Double, end: scala.Int | scala.Double = null): Anon_End = {
    val __obj = js.Dynamic.literal(start = start)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

