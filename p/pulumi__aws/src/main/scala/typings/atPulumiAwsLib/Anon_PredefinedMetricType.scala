package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PredefinedMetricType extends js.Object {
  var predefinedMetricType: java.lang.String
  var resourceLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PredefinedMetricType {
  @scala.inline
  def apply(predefinedMetricType: java.lang.String, resourceLabel: java.lang.String = null): Anon_PredefinedMetricType = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType)
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel)
    __obj.asInstanceOf[Anon_PredefinedMetricType]
  }
}

