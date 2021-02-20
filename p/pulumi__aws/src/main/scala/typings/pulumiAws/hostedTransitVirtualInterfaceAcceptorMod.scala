package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID]): HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceAcceptorState,
      opts: CustomResourceOptions
    ): HostedTransitVirtualInterfaceAcceptor = js.native
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = js.native
  }
  
  @js.native
  trait HostedTransitVirtualInterfaceAcceptorArgs extends StObject {
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Input[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Input[String] = js.native
  }
  object HostedTransitVirtualInterfaceAcceptorArgs {
    
    @scala.inline
    def apply(dxGatewayId: Input[String], virtualInterfaceId: Input[String]): HostedTransitVirtualInterfaceAcceptorArgs = {
      val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorArgs]
    }
    
    @scala.inline
    implicit class HostedTransitVirtualInterfaceAcceptorArgsMutableBuilder[Self <: HostedTransitVirtualInterfaceAcceptorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostedTransitVirtualInterfaceAcceptorState extends StObject {
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: js.UndefOr[Input[String]] = js.native
  }
  object HostedTransitVirtualInterfaceAcceptorState {
    
    @scala.inline
    def apply(): HostedTransitVirtualInterfaceAcceptorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorState]
    }
    
    @scala.inline
    implicit class HostedTransitVirtualInterfaceAcceptorStateMutableBuilder[Self <: HostedTransitVirtualInterfaceAcceptorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    }
  }
}
