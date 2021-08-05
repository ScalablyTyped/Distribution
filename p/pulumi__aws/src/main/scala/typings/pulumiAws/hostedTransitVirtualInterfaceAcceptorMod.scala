package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedTransitVirtualInterfaceAcceptorMod {
  
  @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor")
  @js.native
  class HostedTransitVirtualInterfaceAcceptor protected () extends CustomResource {
    /**
      * Create a HostedTransitVirtualInterfaceAcceptor resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs) = this()
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Output_[String] = js.native
  }
  /* static members */
  object HostedTransitVirtualInterfaceAcceptor {
    
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HostedTransitVirtualInterfaceAcceptor]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedTransitVirtualInterfaceAcceptor]
    inline def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[HostedTransitVirtualInterfaceAcceptor]
    inline def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceAcceptorState,
      opts: CustomResourceOptions
    ): HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedTransitVirtualInterfaceAcceptor]
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean]
  }
  
  trait HostedTransitVirtualInterfaceAcceptorArgs extends StObject {
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Input[String]
  }
  object HostedTransitVirtualInterfaceAcceptorArgs {
    
    inline def apply(dxGatewayId: Input[String], virtualInterfaceId: Input[String]): HostedTransitVirtualInterfaceAcceptorArgs = {
      val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorArgs]
    }
    
    extension [Self <: HostedTransitVirtualInterfaceAcceptorArgs](x: Self) {
      
      inline def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedTransitVirtualInterfaceAcceptorState extends StObject {
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
  }
  object HostedTransitVirtualInterfaceAcceptorState {
    
    inline def apply(): HostedTransitVirtualInterfaceAcceptorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorState]
    }
    
    extension [Self <: HostedTransitVirtualInterfaceAcceptorState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      inline def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    }
  }
}
