package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
         * (for example, hits-per-second on an Ingress object).
         */

trait ObjectMetricStatus extends js.Object {
  /**
               * current contains the current value for the given metric
               */
  val current: MetricValueStatus
  val describedObject: CrossVersionObjectReference
  /**
               * metric identifies the target metric by name and selector
               */
  val metric: MetricIdentifier
}

