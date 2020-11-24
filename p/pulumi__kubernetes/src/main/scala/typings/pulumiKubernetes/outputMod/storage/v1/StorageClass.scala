package typings.pulumiKubernetes.outputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.TopologySelectorTerm
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var allowVolumeExpansion: Boolean = js.native
  
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.Array[TopologySelectorTerm] = js.native
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: storageDotk8sDotioSlashv1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
    */
  var mountOptions: js.Array[String] = js.native
  
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
    */
  var parameters: StringDictionary[String] = js.native
  
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: String = js.native
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: String = js.native
  
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var volumeBindingMode: String = js.native
}
object StorageClass {
  
  @scala.inline
  def apply(
    allowVolumeExpansion: Boolean,
    allowedTopologies: js.Array[TopologySelectorTerm],
    apiVersion: storageDotk8sDotioSlashv1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass,
    metadata: ObjectMeta,
    mountOptions: js.Array[String],
    parameters: StringDictionary[String],
    provisioner: String,
    reclaimPolicy: String,
    volumeBindingMode: String
  ): StorageClass = {
    val __obj = js.Dynamic.literal(allowVolumeExpansion = allowVolumeExpansion.asInstanceOf[js.Any], allowedTopologies = allowedTopologies.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], provisioner = provisioner.asInstanceOf[js.Any], reclaimPolicy = reclaimPolicy.asInstanceOf[js.Any], volumeBindingMode = volumeBindingMode.asInstanceOf[js.Any])
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
    def setAllowVolumeExpansion(value: Boolean): Self = this.set("allowVolumeExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedTopologiesVarargs(value: TopologySelectorTerm*): Self = this.set("allowedTopologies", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTopologies(value: js.Array[TopologySelectorTerm]): Self = this.set("allowedTopologies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: storageDotk8sDotioSlashv1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsVarargs(value: String*): Self = this.set("mountOptions", js.Array(value :_*))
    
    @scala.inline
    def setMountOptions(value: js.Array[String]): Self = this.set("mountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioner(value: String): Self = this.set("provisioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReclaimPolicy(value: String): Self = this.set("reclaimPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeBindingMode(value: String): Self = this.set("volumeBindingMode", value.asInstanceOf[js.Any])
  }
}
