package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfiguration represents the configuration of a priority level.
  */
@js.native
trait PriorityLevelConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration = js.native
  /**
    * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: PriorityLevelConfigurationSpec = js.native
  /**
    * `status` is the current status of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: PriorityLevelConfigurationStatus = js.native
}

object PriorityLevelConfiguration {
  @scala.inline
  def apply(
    apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration,
    metadata: ObjectMeta,
    spec: PriorityLevelConfigurationSpec,
    status: PriorityLevelConfigurationStatus
  ): PriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfiguration]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationOps[Self <: PriorityLevelConfiguration] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: PriorityLevelConfigurationSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PriorityLevelConfigurationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

