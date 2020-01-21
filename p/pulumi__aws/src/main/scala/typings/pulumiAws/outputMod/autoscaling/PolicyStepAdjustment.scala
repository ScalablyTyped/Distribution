package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepAdjustment extends js.Object {
  /**
    * The lower bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity.
    */
  var metricIntervalLowerBound: js.UndefOr[String] = js.native
  /**
    * The upper bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity. The upper bound
    * must be greater than the lower bound.
    */
  var metricIntervalUpperBound: js.UndefOr[String] = js.native
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  var scalingAdjustment: Double = js.native
}

object PolicyStepAdjustment {
  @scala.inline
  def apply(
    scalingAdjustment: Double,
    metricIntervalLowerBound: String = null,
    metricIntervalUpperBound: String = null
  ): PolicyStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound.asInstanceOf[js.Any])
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepAdjustment]
  }
}

