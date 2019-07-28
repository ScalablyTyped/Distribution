package typings.reactDashGa.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingArgs extends js.Object {
  var category: String
  var label: js.UndefOr[String] = js.undefined
  var value: Double
  var variable: String
}

object TimingArgs {
  @scala.inline
  def apply(category: String, value: Double, variable: String, label: String = null): TimingArgs = {
    val __obj = js.Dynamic.literal(category = category, value = value, variable = variable)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[TimingArgs]
  }
}

