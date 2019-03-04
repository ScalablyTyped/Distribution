package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomNumber extends ICustomControl {
  var defaultValue: scala.Double
  var max: scala.Double
  var min: scala.Double
}

object ICustomNumber {
  @scala.inline
  def apply(
    defaultValue: scala.Double,
    label: java.lang.String,
    max: scala.Double,
    min: scala.Double,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomNumber = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, label = label, max = max, min = min, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomNumber]
  }
}

