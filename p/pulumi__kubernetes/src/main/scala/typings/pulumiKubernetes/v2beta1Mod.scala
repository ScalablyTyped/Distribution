package typings.pulumiKubernetes

import typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2beta1Mod {
  
  @JSImport("@pulumi/kubernetes/autoscaling/v2beta1", "HorizontalPodAutoscaler")
  @js.native
  class HorizontalPodAutoscaler protected ()
    extends typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler {
    /**
      * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HorizontalPodAutoscaler {
    
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta1", "HorizontalPodAutoscaler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/autoscaling/v2beta1", "HorizontalPodAutoscalerList")
  @js.native
  class HorizontalPodAutoscalerList protected ()
    extends typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList {
    /**
      * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HorizontalPodAutoscalerList {
    
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta1", "HorizontalPodAutoscalerList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean]
  }
}
