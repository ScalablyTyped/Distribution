package typings.pulumiKubernetes

import typings.pulumiKubernetes.priorityClassListMod.PriorityClassListArgs
import typings.pulumiKubernetes.priorityClassMod.PriorityClassArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulingV1alpha1Mod {
  
  @JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClass")
  @js.native
  class PriorityClass protected ()
    extends typings.pulumiKubernetes.priorityClassMod.PriorityClass {
    /**
      * Create a PriorityClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityClassArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityClass {
    
    @JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClass")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityClassMod.PriorityClass]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityClassMod.PriorityClass]
    
    /**
      * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClassList")
  @js.native
  class PriorityClassList protected ()
    extends typings.pulumiKubernetes.priorityClassListMod.PriorityClassList {
    /**
      * Create a PriorityClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityClassListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityClassList {
    
    @JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClassList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityClassListMod.PriorityClassList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityClassListMod.PriorityClassList]
    
    /**
      * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean]
  }
}
