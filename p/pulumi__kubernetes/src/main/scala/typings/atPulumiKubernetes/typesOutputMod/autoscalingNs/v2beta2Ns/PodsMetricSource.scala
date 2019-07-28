package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v2beta2Ns

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
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
  /**
    * target specifies the target value for the given metric
    */
  val target: MetricTarget
}

object PodsMetricSource {
  @scala.inline
  def apply(metric: MetricIdentifier, target: MetricTarget): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric, target = target)
  
    __obj.asInstanceOf[PodsMetricSource]
  }
}

