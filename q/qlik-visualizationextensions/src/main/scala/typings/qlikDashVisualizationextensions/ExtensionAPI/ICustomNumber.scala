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
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, label = label, max = max, min = min, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomNumber]
  }
}

