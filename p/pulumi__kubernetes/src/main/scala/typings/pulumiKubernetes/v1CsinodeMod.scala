package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.storage.v1.CSINodeSpec
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1CsinodeMod {
  
  @JSImport("@pulumi/kubernetes/storage/v1/csinode", "CSINode")
  @js.native
  class CSINode protected () extends CustomResource {
    /**
      * Create a CSINode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSINodeArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CSINodeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[storageDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode] = js.native
    
    /**
      * metadata.name must be the Kubernetes node name.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * spec is the specification of CSINode
      */
    val spec: Output_[CSINodeSpec] = js.native
  }
  /* static members */
  object CSINode {
    
    @JSImport("@pulumi/kubernetes/storage/v1/csinode", "CSINode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CSINode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CSINode]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CSINode]
    
    /**
      * Returns true if the given object is an instance of CSINode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinode.CSINode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinode.CSINode */ Boolean]
  }
  
  trait CSINodeArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode]] = js.undefined
    
    /**
      * metadata.name must be the Kubernetes node name.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * spec is the specification of CSINode
      */
    val spec: Input[typings.pulumiKubernetes.inputMod.storage.v1.CSINodeSpec]
  }
  object CSINodeArgs {
    
    @scala.inline
    def apply(spec: Input[typings.pulumiKubernetes.inputMod.storage.v1.CSINodeSpec]): CSINodeArgs = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINodeArgs]
    }
    
    @scala.inline
    implicit class CSINodeArgsMutableBuilder[Self <: CSINodeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiKubernetes.inputMod.storage.v1.CSINodeSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
