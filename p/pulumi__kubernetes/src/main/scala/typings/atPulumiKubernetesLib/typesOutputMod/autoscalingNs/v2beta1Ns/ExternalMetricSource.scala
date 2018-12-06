package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
         * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
         * running outside of cluster). Exactly one "target" type should be set.
         */

trait ExternalMetricSource extends js.Object {
  /**
               * metricName is the name of the metric in question.
               */
  val metricName: java.lang.String
  /**
               * metricSelector is used to identify a specific time series within a given metric.
               */
  val metricSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
               * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually
               * exclusive with TargetValue.
               */
  val targetAverageValue: java.lang.String
  /**
               * targetValue is the target value of the metric (as a quantity). Mutually exclusive with
               * TargetAverageValue.
               */
  val targetValue: java.lang.String
}

