package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.v1PriorityClassListMod.PriorityClassListArgs
import typings.pulumiKubernetes.v1PriorityClassMod.PriorityClassArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduling {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClass")
    @js.native
    class PriorityClass protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1.PriorityClass {
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
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1PriorityClassMod.PriorityClass = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1PriorityClassMod.PriorityClass = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClass.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1/priorityClass.PriorityClass */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClassList")
    @js.native
    class PriorityClassList protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1.PriorityClassList {
      /**
        * Create a PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PriorityClassList {
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1PriorityClassListMod.PriorityClassList = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1PriorityClassListMod.PriorityClassList = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1.PriorityClassList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1/priorityClassList.PriorityClassList */ Boolean = js.native
    }
  }
  
  object v1alpha1 {
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClass")
    @js.native
    class PriorityClass protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1alpha1.PriorityClass {
      /**
        * Create a PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.priorityClassMod.PriorityClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.priorityClassMod.PriorityClassArgs,
        opts: CustomResourceOptions
      ) = this()
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
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityClassMod.PriorityClass = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityClassMod.PriorityClass = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClass.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClassList")
    @js.native
    class PriorityClassList protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1alpha1.PriorityClassList {
      /**
        * Create a PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.priorityClassListMod.PriorityClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.priorityClassListMod.PriorityClassListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object PriorityClassList {
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityClassListMod.PriorityClassList = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityClassListMod.PriorityClassList = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1alpha1.PriorityClassList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClass")
    @js.native
    class PriorityClass protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1beta1.PriorityClass {
      /**
        * Create a PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v1beta1PriorityClassMod.PriorityClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1PriorityClassMod.PriorityClassArgs,
        opts: CustomResourceOptions
      ) = this()
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
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PriorityClassMod.PriorityClass = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClass.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PriorityClassMod.PriorityClass = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClass.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1beta1/priorityClass.PriorityClass */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClassList")
    @js.native
    class PriorityClassList protected ()
      extends typings.pulumiKubernetes.schedulingMod.v1beta1.PriorityClassList {
      /**
        * Create a PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v1beta1PriorityClassListMod.PriorityClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1PriorityClassListMod.PriorityClassListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object PriorityClassList {
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PriorityClassListMod.PriorityClassList = js.native
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClassList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PriorityClassListMod.PriorityClassList = js.native
      
      /**
        * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "scheduling.v1beta1.PriorityClassList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1beta1/priorityClassList.PriorityClassList */ Boolean = js.native
    }
  }
}
