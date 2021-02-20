package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1PriorityClassMod {
  
  @JSImport("@pulumi/kubernetes/scheduling/v1beta1/priorityClass", "PriorityClass")
  @js.native
  class PriorityClass protected () extends CustomResource {
    /**
      * Create a PriorityClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityClassArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[schedulingDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
      */
    val description: Output_[String] = js.native
    
    /**
      * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
      */
    val globalDefault: Output_[Boolean] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
      */
    val preemptionPolicy: Output_[String] = js.native
    
    /**
      * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
      */
    val value: Output_[Double] = js.native
  }
  /* static members */
  object PriorityClass {
    
    /**
      * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/scheduling/v1beta1/priorityClass", "PriorityClass.get")
    @js.native
    def get(name: String, id: Input[ID]): PriorityClass = js.native
    @JSImport("@pulumi/kubernetes/scheduling/v1beta1/priorityClass", "PriorityClass.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PriorityClass = js.native
    
    /**
      * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/scheduling/v1beta1/priorityClass", "PriorityClass.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1beta1/priorityClass.PriorityClass */ Boolean = js.native
  }
  
  @js.native
  trait PriorityClassArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1beta1]] = js.native
    
    /**
      * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
      */
    val globalDefault: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
      */
    val preemptionPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
      */
    val value: Input[Double] = js.native
  }
  object PriorityClassArgs {
    
    @scala.inline
    def apply(value: Input[Double]): PriorityClassArgs = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriorityClassArgs]
    }
    
    @scala.inline
    implicit class PriorityClassArgsMutableBuilder[Self <: PriorityClassArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlobalDefault(value: Input[Boolean]): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalDefaultUndefined: Self = StObject.set(x, "globalDefault", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPreemptionPolicy(value: Input[String]): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreemptionPolicyUndefined: Self = StObject.set(x, "preemptionPolicy", js.undefined)
      
      @scala.inline
      def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
