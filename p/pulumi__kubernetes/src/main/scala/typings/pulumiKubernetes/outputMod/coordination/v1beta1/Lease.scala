package typings.pulumiKubernetes.outputMod.coordination.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lease defines a lease concept.
  */
@js.native
trait Lease extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: coordinationDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease = js.native
  /**
    * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: LeaseSpec = js.native
}

object Lease {
  @scala.inline
  def apply(
    apiVersion: coordinationDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease,
    metadata: ObjectMeta,
    spec: LeaseSpec
  ): Lease = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lease]
  }
  @scala.inline
  implicit class LeaseOps[Self <: Lease] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: coordinationDotk8sDotioSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: LeaseSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
  }
  
}

