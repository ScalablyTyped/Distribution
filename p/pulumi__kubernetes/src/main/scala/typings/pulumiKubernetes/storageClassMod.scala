package typings.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.TopologySelectorTerm
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageClassMod {
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1/storageClass", "StorageClass")
  @js.native
  class StorageClass protected () extends CustomResource {
    /**
      * Create a StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    val allowVolumeExpansion: Output_[Boolean] = js.native
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val allowedTopologies: Output_[js.Array[TopologySelectorTerm]] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[storageDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    val mountOptions: Output_[js.Array[String]] = js.native
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    val parameters: Output_[StringDictionary[String]] = js.native
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    val provisioner: Output_[String] = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    val reclaimPolicy: Output_[String] = js.native
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val volumeBindingMode: Output_[String] = js.native
  }
  /* static members */
  object StorageClass {
    
    @JSImport("@pulumi/kubernetes/storage/v1beta1/storageClass", "StorageClass")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StorageClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StorageClass]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StorageClass]
    
    /**
      * Returns true if the given object is an instance of StorageClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean]
  }
  
  trait StorageClassArgs extends StObject {
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    val allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val allowedTopologies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm]]]
      ] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    val mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    val provisioner: Input[String]
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    val reclaimPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val volumeBindingMode: js.UndefOr[Input[String]] = js.undefined
  }
  object StorageClassArgs {
    
    inline def apply(provisioner: Input[String]): StorageClassArgs = {
      val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClassArgs]
    }
    
    extension [Self <: StorageClassArgs](x: Self) {
      
      inline def setAllowVolumeExpansion(value: Input[Boolean]): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowVolumeExpansionUndefined: Self = StObject.set(x, "allowVolumeExpansion", js.undefined)
      
      inline def setAllowedTopologies(value: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm]]]): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
      
      inline def setAllowedTopologiesUndefined: Self = StObject.set(x, "allowedTopologies", js.undefined)
      
      inline def setAllowedTopologiesVarargs(value: Input[typings.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm]*): Self = StObject.set(x, "allowedTopologies", js.Array(value :_*))
      
      inline def setApiVersion(value: Input[storageDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      inline def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
      
      inline def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setProvisioner(value: Input[String]): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
      
      inline def setReclaimPolicy(value: Input[String]): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
      
      inline def setReclaimPolicyUndefined: Self = StObject.set(x, "reclaimPolicy", js.undefined)
      
      inline def setVolumeBindingMode(value: Input[String]): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
      
      inline def setVolumeBindingModeUndefined: Self = StObject.set(x, "volumeBindingMode", js.undefined)
    }
  }
}
