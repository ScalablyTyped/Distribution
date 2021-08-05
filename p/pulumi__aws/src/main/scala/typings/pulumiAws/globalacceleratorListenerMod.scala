package typings.pulumiAws

import typings.pulumiAws.outputMod.globalaccelerator.ListenerPortRange
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
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
    inline def get(name: String, id: Input[ID]): Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Listener]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Listener]
    inline def get(name: String, id: Input[ID], state: ListenerState): Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Listener]
    inline def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Listener]
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean]
  }
  
  trait ListenerArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of your accelerator.
      */
    val acceleratorArn: Input[String]
    
    /**
      * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
      */
    val clientAffinity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
      */
    val portRanges: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]
    
    /**
      * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
      */
    val protocol: Input[String]
  }
  object ListenerArgs {
    
    inline def apply(
      acceleratorArn: Input[String],
      portRanges: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]],
      protocol: Input[String]
    ): ListenerArgs = {
      val __obj = js.Dynamic.literal(acceleratorArn = acceleratorArn.asInstanceOf[js.Any], portRanges = portRanges.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerArgs]
    }
    
    extension [Self <: ListenerArgs](x: Self) {
      
      inline def setAcceleratorArn(value: Input[String]): Self = StObject.set(x, "acceleratorArn", value.asInstanceOf[js.Any])
      
      inline def setClientAffinity(value: Input[String]): Self = StObject.set(x, "clientAffinity", value.asInstanceOf[js.Any])
      
      inline def setClientAffinityUndefined: Self = StObject.set(x, "clientAffinity", js.undefined)
      
      inline def setPortRanges(value: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]): Self = StObject.set(x, "portRanges", value.asInstanceOf[js.Any])
      
      inline def setPortRangesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]*): Self = StObject.set(x, "portRanges", js.Array(value :_*))
      
      inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenerState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of your accelerator.
      */
    val acceleratorArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
      */
    val clientAffinity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
      */
    val portRanges: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]
      ] = js.undefined
    
    /**
      * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
      */
    val protocol: js.UndefOr[Input[String]] = js.undefined
  }
  object ListenerState {
    
    inline def apply(): ListenerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerState]
    }
    
    extension [Self <: ListenerState](x: Self) {
      
      inline def setAcceleratorArn(value: Input[String]): Self = StObject.set(x, "acceleratorArn", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorArnUndefined: Self = StObject.set(x, "acceleratorArn", js.undefined)
      
      inline def setClientAffinity(value: Input[String]): Self = StObject.set(x, "clientAffinity", value.asInstanceOf[js.Any])
      
      inline def setClientAffinityUndefined: Self = StObject.set(x, "clientAffinity", js.undefined)
      
      inline def setPortRanges(value: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]]]): Self = StObject.set(x, "portRanges", value.asInstanceOf[js.Any])
      
      inline def setPortRangesUndefined: Self = StObject.set(x, "portRanges", js.undefined)
      
      inline def setPortRangesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.ListenerPortRange]*): Self = StObject.set(x, "portRanges", js.Array(value :_*))
      
      inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
}
