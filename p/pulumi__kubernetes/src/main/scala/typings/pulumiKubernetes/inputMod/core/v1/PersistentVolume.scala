package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
  * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
  */
trait PersistentVolume extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolume]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an
    * administrator. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
    */
  var spec: js.UndefOr[Input[PersistentVolumeSpec]] = js.undefined
}

object PersistentVolume {
  @scala.inline
  def apply(
    apiVersion: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolume] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[PersistentVolumeSpec] = null
  ): PersistentVolume = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolume]
  }
}

