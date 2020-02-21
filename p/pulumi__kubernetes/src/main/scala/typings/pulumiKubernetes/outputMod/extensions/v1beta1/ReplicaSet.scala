package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
  *
  * @deprecated extensions/v1beta1/ReplicaSet is deprecated by apps/v1/ReplicaSet and not
  * supported by Kubernetes v1.16+ clusters.
  */
trait ReplicaSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: extensionsSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ReplicaSet
  /**
    * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
    * that the ReplicaSet manages. Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: ReplicaSetSpec
  /**
    * Status is the most recently observed status of the ReplicaSet. This data may be out of date
    * by some window of time. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val status: ReplicaSetStatus
}

object ReplicaSet {
  @scala.inline
  def apply(
    apiVersion: extensionsSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ReplicaSet,
    metadata: ObjectMeta,
    spec: ReplicaSetSpec,
    status: ReplicaSetStatus
  ): ReplicaSet = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicaSet]
  }
}

