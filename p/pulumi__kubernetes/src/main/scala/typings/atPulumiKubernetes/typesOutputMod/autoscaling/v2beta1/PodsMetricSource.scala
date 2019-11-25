package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
  * target (for example, transactions-processed-per-second). The values will be averaged together
  * before being compared to the target value.
  */
trait PodsMetricSource extends js.Object {
  /**
    * metricName is the name of the metric in question
    */
  val metricName: String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  val selector: LabelSelector
  /**
    * targetAverageValue is the target value of the average of the metric across all relevant
    * pods (as a quantity)
    */
  val targetAverageValue: String
}

object PodsMetricSource {
  @scala.inline
  def apply(metricName: String, selector: LabelSelector, targetAverageValue: String): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodsMetricSource]
  }
}

