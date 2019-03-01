package typings
package reactDashEasyDashChartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var value: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(key: java.lang.String, value: scala.Double, color: java.lang.String = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_Color]
  }
}

