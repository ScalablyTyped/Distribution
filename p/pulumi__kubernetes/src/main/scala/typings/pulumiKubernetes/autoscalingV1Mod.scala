package typings.pulumiKubernetes

import typings.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typings.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingV1Mod {
  
  @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscaler")
  @js.native
  class HorizontalPodAutoscaler protected ()
    extends typings.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler {
    /**
      * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HorizontalPodAutoscaler {
    
    /**
      * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscaler.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscaler.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscaler.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscalerList")
  @js.native
  class HorizontalPodAutoscalerList protected ()
    extends typings.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList {
    /**
      * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HorizontalPodAutoscalerList {
    
    /**
      * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscalerList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscalerList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/autoscaling/v1", "HorizontalPodAutoscalerList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
  }
}
