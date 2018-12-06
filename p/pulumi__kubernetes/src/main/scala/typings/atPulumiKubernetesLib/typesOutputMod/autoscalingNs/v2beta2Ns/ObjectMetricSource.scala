package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
         * example, hits-per-second on an Ingress object).
         */

trait ObjectMetricSource extends js.Object {
  val describedObject: CrossVersionObjectReference
  /**
               * metric identifies the target metric by name and selector
               */
  val metric: MetricIdentifier
  /**
               * target specifies the target value for the given metric
               */
  val target: MetricTarget
}

