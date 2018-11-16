package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
         * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
         * or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top
         * of those available to normal per-pod metrics using the "pods" source.
         */

trait ResourceMetricStatus extends js.Object {
  /**
               * currentAverageUtilization is the current value of the average of the resource metric across
               * all relevant pods, represented as a percentage of the requested value of the resource for
               * the pods.  It will only be present if `targetAverageValue` was set in the corresponding
               * metric specification.
               */
  val currentAverageUtilization: scala.Double
  /**
               * currentAverageValue is the current value of the average of the resource metric across all
               * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
               * "pods" metric source type. It will always be set, regardless of the corresponding metric
               * specification.
               */
  val currentAverageValue: java.lang.String
  /**
               * name is the name of the resource in question.
               */
  val name: java.lang.String
}

