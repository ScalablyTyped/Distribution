package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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
  val name: java.lang.String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
}

object MetricIdentifier {
  @scala.inline
  def apply(name: java.lang.String, selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector): MetricIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[MetricIdentifier]
  }
}

