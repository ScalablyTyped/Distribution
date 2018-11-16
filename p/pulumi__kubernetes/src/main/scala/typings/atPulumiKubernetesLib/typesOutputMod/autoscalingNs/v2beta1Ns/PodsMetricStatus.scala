package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PodsMetricStatus indicates the current value of a metric describing each pod in the current
         * scale target (for example, transactions-processed-per-second).
         */

trait PodsMetricStatus extends js.Object {
  /**
               * currentAverageValue is the current value of the average of the metric across all relevant
               * pods (as a quantity)
               */
  val currentAverageValue: java.lang.String
  /**
               * metricName is the name of the metric in question
               */
  val metricName: java.lang.String
}

