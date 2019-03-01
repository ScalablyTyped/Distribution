package typings
package reactDashEasyDashChartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[java.lang.String] = js.undefined
  var y: js.UndefOr[java.lang.String] = js.undefined
  var y2: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: java.lang.String = null, y: java.lang.String = null, y2: java.lang.String = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    if (y2 != null) __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Anon_X]
  }
}

