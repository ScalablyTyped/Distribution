package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStepAdjustment extends js.Object {
  /**
    * The lower bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity.
    */
  var metricIntervalLowerBound: js.UndefOr[String] = js.undefined
  /**
    * The upper bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity. The upper bound
    * must be greater than the lower bound.
    */
  var metricIntervalUpperBound: js.UndefOr[String] = js.undefined
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  var scalingAdjustment: Double
}

object PolicyStepAdjustment {
  @scala.inline
  def apply(
    scalingAdjustment: Double,
    metricIntervalLowerBound: String = null,
    metricIntervalUpperBound: String = null
  ): PolicyStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment)
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound)
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound)
    __obj.asInstanceOf[PolicyStepAdjustment]
  }
}

