package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
         * example, hits-per-second on an Ingress object).
         */

trait ObjectMetricSource extends js.Object {
  /**
               * metricName is the name of the metric in question.
               */
  val metricName: java.lang.String
  /**
               * target is the described Kubernetes object.
               */
  val target: CrossVersionObjectReference
  /**
               * targetValue is the target value of the metric (as a quantity).
               */
  val targetValue: java.lang.String
}

