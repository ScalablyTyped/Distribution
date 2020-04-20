package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricIdentifier defines the name and optionally selector for a metric
  */
trait MetricIdentifier extends js.Object {
  /**
    * name is the name of the given metric
    */
  val name: String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  val selector: LabelSelector
}

object MetricIdentifier {
  @scala.inline
  def apply(name: String, selector: LabelSelector): MetricIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricIdentifier]
  }
}

