package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpnGatewayAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment")
  @js.native
  class VpnGatewayAttachment protected () extends CustomResource {
    /**
      * Create a VpnGatewayAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpnGatewayAttachmentArgs) = this()
    def this(name: String, args: VpnGatewayAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the VPC.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: Output_[String] = js.native
  }
  /* static members */
  object VpnGatewayAttachment {
    
    /**
      * Get an existing VpnGatewayAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): VpnGatewayAttachment = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnGatewayAttachment = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayAttachmentState): VpnGatewayAttachment = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayAttachmentState, opts: CustomResourceOptions): VpnGatewayAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VpnGatewayAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayAttachment.VpnGatewayAttachment */ Boolean = js.native
  }
  
  @js.native
  trait VpnGatewayAttachmentArgs extends StObject {
    
    /**
      * The ID of the VPC.
      */
    val vpcId: Input[String] = js.native
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: Input[String] = js.native
  }
  object VpnGatewayAttachmentArgs {
    
    @scala.inline
    def apply(vpcId: Input[String], vpnGatewayId: Input[String]): VpnGatewayAttachmentArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpnGatewayAttachmentArgs]
    }
    
    @scala.inline
    implicit class VpnGatewayAttachmentArgsMutableBuilder[Self <: VpnGatewayAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpnGatewayAttachmentState extends StObject {
    
    /**
      * The ID of the VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object VpnGatewayAttachmentState {
    
    @scala.inline
    def apply(): VpnGatewayAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnGatewayAttachmentState]
    }
    
    @scala.inline
    implicit class VpnGatewayAttachmentStateMutableBuilder[Self <: VpnGatewayAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
}
