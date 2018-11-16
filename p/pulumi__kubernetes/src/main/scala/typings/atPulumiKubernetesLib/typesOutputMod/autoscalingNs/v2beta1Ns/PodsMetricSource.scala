package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
         * target (for example, transactions-processed-per-second). The values will be averaged together
         * before being compared to the target value.
         */

trait PodsMetricSource extends js.Object {
  /**
               * metricName is the name of the metric in question
               */
  val metricName: java.lang.String
  /**
               * targetAverageValue is the target value of the average of the metric across all relevant
               * pods (as a quantity)
               */
  val targetAverageValue: java.lang.String
}

