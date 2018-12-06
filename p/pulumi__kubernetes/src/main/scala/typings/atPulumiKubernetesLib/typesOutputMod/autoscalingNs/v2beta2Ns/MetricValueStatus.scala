package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * MetricValueStatus holds the current value for a metric
         */

trait MetricValueStatus extends js.Object {
  /**
               * currentAverageUtilization is the current value of the average of the resource metric across
               * all relevant pods, represented as a percentage of the requested value of the resource for
               * the pods.
               */
  val averageUtilization: scala.Double
  /**
               * averageValue is the current value of the average of the metric across all relevant pods (as
               * a quantity)
               */
  val averageValue: java.lang.String
  /**
               * value is the current value of the metric (as a quantity).
               */
  val value: java.lang.String
}

