package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.outputMod.node.v1beta1.RuntimeClass
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1RuntimeClassListMod {
  
  @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClassList", "RuntimeClassList")
  @js.native
  class RuntimeClassList protected () extends CustomResource {
    /**
      * Create a RuntimeClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RuntimeClassListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RuntimeClassListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[nodeDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Items is a list of schema objects.
      */
    val items: Output_[js.Array[RuntimeClass]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList] = js.native
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object RuntimeClassList {
    
    @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClassList", "RuntimeClassList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassList]
    
    /**
      * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClassList.RuntimeClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClassList.RuntimeClassList */ Boolean]
  }
  
  trait RuntimeClassListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Items is a list of schema objects.
      */
    val items: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass]]]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList]] = js.undefined
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.undefined
  }
  object RuntimeClassListArgs {
    
    @scala.inline
    def apply(items: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass]]]): RuntimeClassListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeClassListArgs]
    }
    
    @scala.inline
    implicit class RuntimeClassListArgsMutableBuilder[Self <: RuntimeClassListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[nodeDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(value: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typings.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
