package typings.pulumiKubernetes.inputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
  * be dynamically provisioned.
  *
  * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
  * ObjectMeta.Name.
  */
trait StorageClass extends js.Object {
  /**
    * AllowVolumeExpansion shows whether the storage class allow volume expand
    */
  var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
    * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
    * list means there is no topology restriction. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.UndefOr[Input[js.Array[Input[TopologySelectorTerm]]]] = js.undefined
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these
    * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
    * is invalid.
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this
    * storage class.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: Input[String]
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this
    * reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
    * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  var volumeBindingMode: js.UndefOr[Input[String]] = js.undefined
}

object StorageClass {
  @scala.inline
  def apply(
    provisioner: Input[String],
    allowVolumeExpansion: Input[Boolean] = null,
    allowedTopologies: Input[js.Array[Input[TopologySelectorTerm]]] = null,
    apiVersion: Input[storageDotk8sDotioSlashv1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass] = null,
    metadata: Input[ObjectMeta] = null,
    mountOptions: Input[js.Array[Input[String]]] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    reclaimPolicy: Input[String] = null,
    volumeBindingMode: Input[String] = null
  ): StorageClass = {
    val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
    if (allowVolumeExpansion != null) __obj.updateDynamic("allowVolumeExpansion")(allowVolumeExpansion.asInstanceOf[js.Any])
    if (allowedTopologies != null) __obj.updateDynamic("allowedTopologies")(allowedTopologies.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (reclaimPolicy != null) __obj.updateDynamic("reclaimPolicy")(reclaimPolicy.asInstanceOf[js.Any])
    if (volumeBindingMode != null) __obj.updateDynamic("volumeBindingMode")(volumeBindingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
}

