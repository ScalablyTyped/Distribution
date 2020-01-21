package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var name: Input[String]
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
}

object MetricIdentifier {
  @scala.inline
  def apply(name: Input[String], selector: Input[LabelSelector] = null): MetricIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricIdentifier]
  }
}

