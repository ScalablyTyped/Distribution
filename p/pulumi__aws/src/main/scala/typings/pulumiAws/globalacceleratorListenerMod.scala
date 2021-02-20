package typings.pulumiAws

import typings.pulumiAws.outputMod.globalaccelerator.ListenerPortRange
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalacceleratorListenerMod {
  
  @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
  @js.native
  class Listener protected () extends CustomResource {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of your accelerator.
      */
    val acceleratorArn: Output_[String] = js.native
    
    /**
      * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
      */
    val clientAffinity: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
      */
    val portRanges: Output_[js.Array[ListenerPortRange]] = js.native
    
    /**
      * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
      */
    val protocol: Output_[String] = js.native
  }
  /* static members */
  object Listener {
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): Listener = js.native
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Listener = js.native
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): Listener = js.native
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
  }
  
  @js.native
  trait ListenerArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of your accelerator.
      */
    val acceleratorArn: Input[String] = js.native
    
    /**
      * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
      */
    val clientAffinity: js.UndefOr[Input[String]] = js.native
    
    /**
      * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
      */
    val portRanges: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]] = js.native
    
    /**
      * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
      */
    val protocol: Input[String] = js.native
  }
  object ListenerArgs {
    
    @scala.inline
    def apply(
      acceleratorArn: Input[String],
      portRanges: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]],
      protocol: Input[String]
    ): ListenerArgs = {
      val __obj = js.Dynamic.literal(acceleratorArn = acceleratorArn.asInstanceOf[js.Any], portRanges = portRanges.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerArgs]
    }
    
    @scala.inline
    implicit class ListenerArgsMutableBuilder[Self <: ListenerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleratorArn(value: Input[String]): Self = StObject.set(x, "acceleratorArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAffinity(value: Input[String]): Self = StObject.set(x, "clientAffinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAffinityUndefined: Self = StObject.set(x, "clientAffinity", js.undefined)
      
      @scala.inline
      def setPortRanges(value: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]): Self = StObject.set(x, "portRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortRangesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]*): Self = StObject.set(x, "portRanges", js.Array(value :_*))
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListenerState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of your accelerator.
      */
    val acceleratorArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
      */
    val clientAffinity: js.UndefOr[Input[String]] = js.native
    
    /**
      * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
      */
    val portRanges: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]
      ] = js.native
    
    /**
      * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
      */
    val protocol: js.UndefOr[Input[String]] = js.native
  }
  object ListenerState {
    
    @scala.inline
    def apply(): ListenerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerState]
    }
    
    @scala.inline
    implicit class ListenerStateMutableBuilder[Self <: ListenerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleratorArn(value: Input[String]): Self = StObject.set(x, "acceleratorArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorArnUndefined: Self = StObject.set(x, "acceleratorArn", js.undefined)
      
      @scala.inline
      def setClientAffinity(value: Input[String]): Self = StObject.set(x, "clientAffinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAffinityUndefined: Self = StObject.set(x, "clientAffinity", js.undefined)
      
      @scala.inline
      def setPortRanges(value: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]): Self = StObject.set(x, "portRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortRangesUndefined: Self = StObject.set(x, "portRanges", js.undefined)
      
      @scala.inline
      def setPortRangesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]*): Self = StObject.set(x, "portRanges", js.Array(value :_*))
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
}
