package typings.pulumiKubernetes

import typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2", JSImport.Namespace)
@js.native
object v2beta2Mod extends js.Object {
  @js.native
  class HorizontalPodAutoscaler protected ()
    extends typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler {
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
  
  @js.native
  class HorizontalPodAutoscalerList protected ()
    extends typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList {
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
  @js.native
  object HorizontalPodAutoscaler extends js.Object {
    /**
      * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HorizontalPodAutoscalerList extends js.Object {
    /**
      * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
  }
  
}

