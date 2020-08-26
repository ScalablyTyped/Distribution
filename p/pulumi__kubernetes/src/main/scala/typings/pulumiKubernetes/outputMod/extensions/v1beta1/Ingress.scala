package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1.  Ingress object exists.
  * 2.  Endpoint objects exist with matching names for each Ingress path (except when Service
  *     type is ExternalName).
  * 3.  Ingress entry exists for '.status.loadBalancer.ingress'.
  *
  * If the Ingress has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
@js.native
trait Ingress extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: extensionsSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: IngressSpec = js.native
  /**
    * Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: IngressStatus = js.native
}

object Ingress {
  @scala.inline
  def apply(
    apiVersion: extensionsSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress,
    metadata: ObjectMeta,
    spec: IngressSpec,
    status: IngressStatus
  ): Ingress = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingress]
  }
  @scala.inline
  implicit class IngressOps[Self <: Ingress] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: extensionsSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: IngressSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IngressStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

