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

object hostedPrivateVirtualInterfaceAccepterMod {
  
  @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter")
  @js.native
  class HostedPrivateVirtualInterfaceAccepter protected () extends CustomResource {
    /**
      * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Output_[String] = js.native
    
    /**
      * The ID of the virtual private gateway to which to connect the virtual interface.
      */
    val vpnGatewayId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object HostedPrivateVirtualInterfaceAccepter {
    
    /**
      * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): HostedPrivateVirtualInterfaceAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = js.native
  }
  
  @js.native
  trait HostedPrivateVirtualInterfaceAccepterArgs extends StObject {
    
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
    val virtualInterfaceId: Input[String] = js.native
    
    /**
      * The ID of the virtual private gateway to which to connect the virtual interface.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object HostedPrivateVirtualInterfaceAccepterArgs {
    
    @scala.inline
    def apply(virtualInterfaceId: Input[String]): HostedPrivateVirtualInterfaceAccepterArgs = {
      val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedPrivateVirtualInterfaceAccepterArgs]
    }
    
    @scala.inline
    implicit class HostedPrivateVirtualInterfaceAccepterArgsMutableBuilder[Self <: HostedPrivateVirtualInterfaceAccepterArgs] (val x: Self) extends AnyVal {
      
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
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
  
  @js.native
  trait HostedPrivateVirtualInterfaceAccepterState extends StObject {
    
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
    
    /**
      * The ID of the virtual private gateway to which to connect the virtual interface.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object HostedPrivateVirtualInterfaceAccepterState {
    
    @scala.inline
    def apply(): HostedPrivateVirtualInterfaceAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedPrivateVirtualInterfaceAccepterState]
    }
    
    @scala.inline
    implicit class HostedPrivateVirtualInterfaceAccepterStateMutableBuilder[Self <: HostedPrivateVirtualInterfaceAccepterState] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
}
