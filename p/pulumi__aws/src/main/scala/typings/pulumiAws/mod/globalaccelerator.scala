package typings.pulumiAws.mod

import typings.pulumiAws.acceleratorMod.AcceleratorArgs
import typings.pulumiAws.acceleratorMod.AcceleratorState
import typings.pulumiAws.endpointGroupMod.EndpointGroupArgs
import typings.pulumiAws.endpointGroupMod.EndpointGroupState
import typings.pulumiAws.globalacceleratorListenerMod.ListenerArgs
import typings.pulumiAws.globalacceleratorListenerMod.ListenerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "globalaccelerator")
@js.native
object globalaccelerator extends js.Object {
  @js.native
  class Accelerator protected ()
    extends typings.pulumiAws.globalacceleratorMod.Accelerator {
    /**
      * Create a Accelerator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AcceleratorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EndpointGroup protected ()
    extends typings.pulumiAws.globalacceleratorMod.EndpointGroup {
    /**
      * Create a EndpointGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointGroupArgs) = this()
    def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.globalacceleratorMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Accelerator extends js.Object {
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState): typings.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): typings.pulumiAws.acceleratorMod.Accelerator = js.native
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EndpointGroup extends js.Object {
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState): typings.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): typings.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
  }
  
}

