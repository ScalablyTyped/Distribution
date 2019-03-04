package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingArgs extends js.Object {
  var category: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: scala.Double
  var variable: java.lang.String
}

object TimingArgs {
  @scala.inline
  def apply(
    category: java.lang.String,
    value: scala.Double,
    variable: java.lang.String,
    label: java.lang.String = null
  ): TimingArgs = {
    val __obj = js.Dynamic.literal(category = category, value = value, variable = variable)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[TimingArgs]
  }
}

