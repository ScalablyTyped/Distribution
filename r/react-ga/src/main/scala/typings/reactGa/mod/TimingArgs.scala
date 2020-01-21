package typings.reactGa.mod

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
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingArgs]
  }
}

