package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricStatus describes the last-read state of a single metric.
  */
trait MetricStatus extends js.Object {
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It
    * allows autoscaling based on information coming from components running outside of cluster
    * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
    * outside of cluster).
    */
  var external: js.UndefOr[Input[ExternalMetricStatus]] = js.undefined
  /**
    * object refers to a metric describing a single kubernetes object (for example,
    * hits-per-second on an Ingress object).
    */
  var `object`: js.UndefOr[Input[ObjectMetricStatus]] = js.undefined
  /**
    * pods refers to a metric describing each pod in the current scale target (for example,
    * transactions-processed-per-second).  The values will be averaged together before being
    * compared to the target value.
    */
  var pods: js.UndefOr[Input[PodsMetricStatus]] = js.undefined
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known
    * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
    * metrics are built in to Kubernetes, and have special scaling options on top of those
    * available to normal per-pod metrics using the "pods" source.
    */
  var resource: js.UndefOr[Input[ResourceMetricStatus]] = js.undefined
  /**
    * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each
    * corresponds to a matching field in the object.
    */
  var `type`: Input[String]
}

object MetricStatus {
  @scala.inline
  def apply(
    `type`: Input[String],
    external: Input[ExternalMetricStatus] = null,
    `object`: Input[ObjectMetricStatus] = null,
    pods: Input[PodsMetricStatus] = null,
    resource: Input[ResourceMetricStatus] = null
  ): MetricStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (pods != null) __obj.updateDynamic("pods")(pods.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStatus]
  }
}

