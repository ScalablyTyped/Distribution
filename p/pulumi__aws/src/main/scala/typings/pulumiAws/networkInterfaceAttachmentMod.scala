package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkInterfaceAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment")
  @js.native
  class NetworkInterfaceAttachment protected () extends CustomResource {
    /**
      * Create a NetworkInterfaceAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkInterfaceAttachmentArgs) = this()
    def this(name: String, args: NetworkInterfaceAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ENI Attachment ID.
      */
    val attachmentId: Output_[String] = js.native
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: Output_[Double] = js.native
    
    /**
      * Instance ID to attach.
      */
    val instanceId: Output_[String] = js.native
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The status of the Network Interface Attachment.
      */
    val status: Output_[String] = js.native
  }
  /* static members */
  object NetworkInterfaceAttachment {
    
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkInterfaceAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NetworkInterfaceAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NetworkInterfaceAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceAttachment]
    inline def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState): NetworkInterfaceAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceAttachment]
    inline def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState, opts: CustomResourceOptions): NetworkInterfaceAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterfaceAttachment]
    
    /**
      * Returns true if the given object is an instance of NetworkInterfaceAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceAttachment.NetworkInterfaceAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceAttachment.NetworkInterfaceAttachment */ Boolean]
  }
  
  trait NetworkInterfaceAttachmentArgs extends StObject {
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: Input[Double]
    
    /**
      * Instance ID to attach.
      */
    val instanceId: Input[String]
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: Input[String]
  }
  object NetworkInterfaceAttachmentArgs {
    
    inline def apply(deviceIndex: Input[Double], instanceId: Input[String], networkInterfaceId: Input[String]): NetworkInterfaceAttachmentArgs = {
      val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
    }
    
    extension [Self <: NetworkInterfaceAttachmentArgs](x: Self) {
      
      inline def setDeviceIndex(value: Input[Double]): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInterfaceAttachmentState extends StObject {
    
    /**
      * The ENI Attachment ID.
      */
    val attachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Instance ID to attach.
      */
    val instanceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the Network Interface Attachment.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
  }
  object NetworkInterfaceAttachmentState {
    
    inline def apply(): NetworkInterfaceAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterfaceAttachmentState]
    }
    
    extension [Self <: NetworkInterfaceAttachmentState](x: Self) {
      
      inline def setAttachmentId(value: Input[String]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      inline def setDeviceIndex(value: Input[Double]): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
      
      inline def setDeviceIndexUndefined: Self = StObject.set(x, "deviceIndex", js.undefined)
      
      inline def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
