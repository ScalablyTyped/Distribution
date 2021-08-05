package typings.pulumiAws

import typings.pulumiAws.acceleratorMod.AcceleratorArgs
import typings.pulumiAws.acceleratorMod.AcceleratorState
import typings.pulumiAws.endpointGroupMod.EndpointGroupArgs
import typings.pulumiAws.endpointGroupMod.EndpointGroupState
import typings.pulumiAws.globalacceleratorListenerMod.ListenerArgs
import typings.pulumiAws.globalacceleratorListenerMod.ListenerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalacceleratorMod {
  
  @JSImport("@pulumi/aws/globalaccelerator", "Accelerator")
  @js.native
  class Accelerator protected ()
    extends typings.pulumiAws.acceleratorMod.Accelerator {
    /**
      * Create a Accelerator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AcceleratorArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Accelerator {
    
    @JSImport("@pulumi/aws/globalaccelerator", "Accelerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.acceleratorMod.Accelerator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.acceleratorMod.Accelerator]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.acceleratorMod.Accelerator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.acceleratorMod.Accelerator]
    inline def get(name: String, id: Input[ID], state: AcceleratorState): typings.pulumiAws.acceleratorMod.Accelerator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.acceleratorMod.Accelerator]
    inline def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): typings.pulumiAws.acceleratorMod.Accelerator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.acceleratorMod.Accelerator]
    
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean]
  }
  
  @JSImport("@pulumi/aws/globalaccelerator", "EndpointGroup")
  @js.native
  class EndpointGroup protected ()
    extends typings.pulumiAws.endpointGroupMod.EndpointGroup {
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
  /* static members */
  object EndpointGroup {
    
    @JSImport("@pulumi/aws/globalaccelerator", "EndpointGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.endpointGroupMod.EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointGroupMod.EndpointGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.endpointGroupMod.EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointGroupMod.EndpointGroup]
    inline def get(name: String, id: Input[ID], state: EndpointGroupState): typings.pulumiAws.endpointGroupMod.EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointGroupMod.EndpointGroup]
    inline def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): typings.pulumiAws.endpointGroupMod.EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointGroupMod.EndpointGroup]
    
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/globalaccelerator", "Listener")
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.globalacceleratorListenerMod.Listener {
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
  object Listener {
    
    @JSImport("@pulumi/aws/globalaccelerator", "Listener")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.globalacceleratorListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalacceleratorListenerMod.Listener]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.globalacceleratorListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalacceleratorListenerMod.Listener]
    inline def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.globalacceleratorListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalacceleratorListenerMod.Listener]
    inline def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.globalacceleratorListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalacceleratorListenerMod.Listener]
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean]
  }
}
