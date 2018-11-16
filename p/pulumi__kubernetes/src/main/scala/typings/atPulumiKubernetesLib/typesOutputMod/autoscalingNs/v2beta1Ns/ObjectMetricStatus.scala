package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
         * (for example, hits-per-second on an Ingress object).
         */

trait ObjectMetricStatus extends js.Object {
  /**
               * currentValue is the current value of the metric (as a quantity).
               */
  val currentValue: java.lang.String
  /**
               * metricName is the name of the metric in question.
               */
  val metricName: java.lang.String
  /**
               * target is the described Kubernetes object.
               */
  val target: CrossVersionObjectReference
}

