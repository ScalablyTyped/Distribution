package typings.qlikDashVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNumber extends ICustomControl {
  var defaultValue: Double
  var max: Double
  var min: Double
}

object ICustomNumber {
  @scala.inline
  def apply(defaultValue: Double, label: String, max: Double, min: Double, ref: String, `type`: String): ICustomNumber = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomNumber]
  }
}

