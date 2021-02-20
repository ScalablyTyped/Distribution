package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.outputMod.policy.v1beta1.PodDisruptionBudget
import typings.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object podDisruptionBudgetListMod {
  
  @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList", "PodDisruptionBudgetList")
  @js.native
  class PodDisruptionBudgetList protected () extends CustomResource {
    /**
      * Create a PodDisruptionBudgetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodDisruptionBudgetListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PodDisruptionBudgetListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[policySlashv1beta1] = js.native
    
    val items: Output_[js.Array[PodDisruptionBudget]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudgetList] = js.native
    
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object PodDisruptionBudgetList {
    
    /**
      * Get an existing PodDisruptionBudgetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList", "PodDisruptionBudgetList.get")
    @js.native
    def get(name: String, id: Input[ID]): PodDisruptionBudgetList = js.native
    @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList", "PodDisruptionBudgetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudgetList = js.native
    
    /**
      * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList", "PodDisruptionBudgetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = js.native
  }
  
  @js.native
  trait PodDisruptionBudgetListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[policySlashv1beta1]] = js.native
    
    val items: Input[
        js.Array[Input[typings.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget]]
      ] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudgetList]] = js.native
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.native
  }
  object PodDisruptionBudgetListArgs {
    
    @scala.inline
    def apply(
      items: Input[
          js.Array[Input[typings.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget]]
        ]
    ): PodDisruptionBudgetListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudgetListArgs]
    }
    
    @scala.inline
    implicit class PodDisruptionBudgetListArgsMutableBuilder[Self <: PodDisruptionBudgetListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[policySlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(
        value: Input[
              js.Array[Input[typings.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typings.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudgetList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
