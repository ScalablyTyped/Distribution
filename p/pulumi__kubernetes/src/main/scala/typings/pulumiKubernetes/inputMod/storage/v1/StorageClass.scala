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
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
  *
  * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
  */
@js.native
trait StorageClass extends js.Object {
  /**
    * AllowVolumeExpansion shows whether the storage class allow volume expand
    */
  var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.UndefOr[Input[js.Array[Input[TopologySelectorTerm]]]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: Input[String] = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var volumeBindingMode: js.UndefOr[Input[String]] = js.native
}

object StorageClass {
  @scala.inline
  def apply(provisioner: Input[String]): StorageClass = {
    val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
  @scala.inline
  implicit class StorageClassOps[Self <: StorageClass] (val x: Self) extends AnyVal {
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
    def setProvisioner(value: Input[String]): Self = this.set("provisioner", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowVolumeExpansion(value: Input[Boolean]): Self = this.set("allowVolumeExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVolumeExpansion: Self = this.set("allowVolumeExpansion", js.undefined)
    @scala.inline
    def setAllowedTopologiesVarargs(value: Input[TopologySelectorTerm]*): Self = this.set("allowedTopologies", js.Array(value :_*))
    @scala.inline
    def setAllowedTopologies(value: Input[js.Array[Input[TopologySelectorTerm]]]): Self = this.set("allowedTopologies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedTopologies: Self = this.set("allowedTopologies", js.undefined)
    @scala.inline
    def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMountOptionsVarargs(value: Input[String]*): Self = this.set("mountOptions", js.Array(value :_*))
    @scala.inline
    def setMountOptions(value: Input[js.Array[Input[String]]]): Self = this.set("mountOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOptions: Self = this.set("mountOptions", js.undefined)
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setReclaimPolicy(value: Input[String]): Self = this.set("reclaimPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReclaimPolicy: Self = this.set("reclaimPolicy", js.undefined)
    @scala.inline
    def setVolumeBindingMode(value: Input[String]): Self = this.set("volumeBindingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeBindingMode: Self = this.set("volumeBindingMode", js.undefined)
  }
  
}

