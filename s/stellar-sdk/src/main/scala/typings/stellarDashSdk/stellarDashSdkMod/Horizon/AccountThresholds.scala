package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountThresholds extends js.Object {
  var high_threshold: Double
  var low_threshold: Double
  var med_threshold: Double
}

object AccountThresholds {
  @scala.inline
  def apply(high_threshold: Double, low_threshold: Double, med_threshold: Double): AccountThresholds = {
    val __obj = js.Dynamic.literal(high_threshold = high_threshold, low_threshold = low_threshold, med_threshold = med_threshold)
  
    __obj.asInstanceOf[AccountThresholds]
  }
}

