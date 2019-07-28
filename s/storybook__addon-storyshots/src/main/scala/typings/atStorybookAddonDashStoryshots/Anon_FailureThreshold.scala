package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThreshold extends js.Object {
  var failureThreshold: Double
  var failureThresholdType: percent
}

object Anon_FailureThreshold {
  @scala.inline
  def apply(failureThreshold: Double, failureThresholdType: percent): Anon_FailureThreshold = {
    val __obj = js.Dynamic.literal(failureThreshold = failureThreshold, failureThresholdType = failureThresholdType)
  
    __obj.asInstanceOf[Anon_FailureThreshold]
  }
}

