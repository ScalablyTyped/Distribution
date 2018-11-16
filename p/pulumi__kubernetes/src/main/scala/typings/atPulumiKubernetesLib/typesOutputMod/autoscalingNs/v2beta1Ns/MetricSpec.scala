package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * MetricSpec specifies how to scale based on a single metric (only `type` and one other
         * matching field should be set at once).
         */

trait MetricSpec extends js.Object {
  /**
               * object refers to a metric describing a single kubernetes object (for example,
               * hits-per-second on an Ingress object).
               */
  val `object`: ObjectMetricSource
  /**
               * pods refers to a metric describing each pod in the current scale target (for example,
               * transactions-processed-per-second).  The values will be averaged together before being
               * compared to the target value.
               */
  val pods: PodsMetricSource
  /**
               * resource refers to a resource metric (such as those specified in requests and limits) known
               * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
               * metrics are built in to Kubernetes, and have special scaling options on top of those
               * available to normal per-pod metrics using the "pods" source.
               */
  val resource: ResourceMetricSource
  /**
               * type is the type of metric source.  It should match one of the fields below.
               */
  val `type`: java.lang.String
}

