package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated extensions/v1beta1/ReplicaSet is deprecated by apps/v1/ReplicaSet and not
  * supported by Kubernetes v1.16+ clusters.
  *
  * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
  */
trait ReplicaSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[extensionsSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ReplicaSet]] = js.undefined
  /**
    * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
    * that the ReplicaSet manages. Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: js.UndefOr[Input[ReplicaSetSpec]] = js.undefined
}

object ReplicaSet {
  @scala.inline
  def apply(
    apiVersion: Input[extensionsSlashv1beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ReplicaSet] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[ReplicaSetSpec] = null
  ): ReplicaSet = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSet]
  }
}

