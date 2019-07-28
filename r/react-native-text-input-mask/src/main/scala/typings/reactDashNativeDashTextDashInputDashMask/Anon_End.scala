package typings.reactDashNativeDashTextDashInputDashMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object Anon_End {
  @scala.inline
  def apply(start: Double, end: Int | Double = null): Anon_End = {
    val __obj = js.Dynamic.literal(start = start)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

