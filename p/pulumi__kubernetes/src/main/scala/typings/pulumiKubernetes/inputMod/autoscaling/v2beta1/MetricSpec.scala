package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
  */
@js.native
trait MetricSpec extends js.Object {
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
    */
  var external: js.UndefOr[Input[ExternalMetricSource]] = js.native
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: js.UndefOr[Input[ObjectMetricSource]] = js.native
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: js.UndefOr[Input[PodsMetricSource]] = js.native
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: js.UndefOr[Input[ResourceMetricSource]] = js.native
  /**
    * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource", each mapping to a matching field in the object.
    */
  var `type`: Input[String] = js.native
}

object MetricSpec {
  @scala.inline
  def apply(`type`: Input[String]): MetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricSpec]
  }
  @scala.inline
  implicit class MetricSpecOps[Self <: MetricSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal(value: Input[ExternalMetricSource]): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    @scala.inline
    def setObject(value: Input[ObjectMetricSource]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setPods(value: Input[PodsMetricSource]): Self = this.set("pods", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePods: Self = this.set("pods", js.undefined)
    @scala.inline
    def setResource(value: Input[ResourceMetricSource]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

