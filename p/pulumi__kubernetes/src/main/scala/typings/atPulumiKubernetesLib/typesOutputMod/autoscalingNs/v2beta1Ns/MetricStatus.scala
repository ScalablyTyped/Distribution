package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * MetricStatus describes the last-read state of a single metric.
         */

trait MetricStatus extends js.Object {
  /**
               * object refers to a metric describing a single kubernetes object (for example,
               * hits-per-second on an Ingress object).
               */
  val `object`: ObjectMetricStatus
  /**
               * pods refers to a metric describing each pod in the current scale target (for example,
               * transactions-processed-per-second).  The values will be averaged together before being
               * compared to the target value.
               */
  val pods: PodsMetricStatus
  /**
               * resource refers to a resource metric (such as those specified in requests and limits) known
               * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
               * metrics are built in to Kubernetes, and have special scaling options on top of those
               * available to normal per-pod metrics using the "pods" source.
               */
  val resource: ResourceMetricStatus
  /**
               * type is the type of metric source.  It will match one of the fields below.
               */
  val `type`: java.lang.String
}

