package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkInterfaceSecurityGroupAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment", "NetworkInterfaceSecurityGroupAttachment")
  @js.native
  class NetworkInterfaceSecurityGroupAttachment protected () extends CustomResource {
    /**
      * Create a NetworkInterfaceSecurityGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkInterfaceSecurityGroupAttachmentArgs) = this()
    def this(name: String, args: NetworkInterfaceSecurityGroupAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the network interface to attach to.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The ID of the security group.
      */
    val securityGroupId: Output_[String] = js.native
  }
  /* static members */
  object NetworkInterfaceSecurityGroupAttachment {
    
    @JSImport("@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment", "NetworkInterfaceSecurityGroupAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkInterfaceSecurityGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NetworkInterfaceSecurityGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceSecurityGroupAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NetworkInterfaceSecurityGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceSecurityGroupAttachment]
    inline def get(name: String, id: Input[ID], state: NetworkInterfaceSecurityGroupAttachmentState): NetworkInterfaceSecurityGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceSecurityGroupAttachment]
    inline def get(
      name: String,
      id: Input[ID],
      state: NetworkInterfaceSecurityGroupAttachmentState,
      opts: CustomResourceOptions
    ): NetworkInterfaceSecurityGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceSecurityGroupAttachment]
    
    /**
      * Returns true if the given object is an instance of NetworkInterfaceSecurityGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment.NetworkInterfaceSecurityGroupAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment.NetworkInterfaceSecurityGroupAttachment */ Boolean]
  }
  
  trait NetworkInterfaceSecurityGroupAttachmentArgs extends StObject {
    
    /**
      * The ID of the network interface to attach to.
      */
    val networkInterfaceId: Input[String]
    
    /**
      * The ID of the security group.
      */
    val securityGroupId: Input[String]
  }
  object NetworkInterfaceSecurityGroupAttachmentArgs {
    
    inline def apply(networkInterfaceId: Input[String], securityGroupId: Input[String]): NetworkInterfaceSecurityGroupAttachmentArgs = {
      val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentArgs]
    }
    
    extension [Self <: NetworkInterfaceSecurityGroupAttachmentArgs](x: Self) {
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInterfaceSecurityGroupAttachmentState extends StObject {
    
    /**
      * The ID of the network interface to attach to.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the security group.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.undefined
  }
  object NetworkInterfaceSecurityGroupAttachmentState {
    
    inline def apply(): NetworkInterfaceSecurityGroupAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentState]
    }
    
    extension [Self <: NetworkInterfaceSecurityGroupAttachmentState](x: Self) {
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
    }
  }
}
