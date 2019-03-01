package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThreshold extends js.Object {
  var failureThreshold: scala.Double
  var failureThresholdType: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsLibStrings.percent
}

object Anon_FailureThreshold {
  @scala.inline
  def apply(
    failureThreshold: scala.Double,
    failureThresholdType: atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsLibStrings.percent
  ): Anon_FailureThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failureThreshold")(failureThreshold)
    __obj.updateDynamic("failureThresholdType")(failureThresholdType)
    __obj.asInstanceOf[Anon_FailureThreshold]
  }
}

