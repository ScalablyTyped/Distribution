package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current
  * scale target (for example, transactions-processed-per-second).
  */
trait PodsMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  val current: MetricValueStatus
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
}

object PodsMetricStatus {
  @scala.inline
  def apply(current: MetricValueStatus, metric: MetricIdentifier): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(current = current, metric = metric)
  
    __obj.asInstanceOf[PodsMetricStatus]
  }
}

