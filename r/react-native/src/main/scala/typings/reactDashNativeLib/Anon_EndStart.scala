package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
}

object Anon_EndStart {
  @scala.inline
  def apply(start: scala.Double, end: scala.Int | scala.Double = null): Anon_EndStart = {
    val __obj = js.Dynamic.literal(start = start)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndStart]
  }
}

