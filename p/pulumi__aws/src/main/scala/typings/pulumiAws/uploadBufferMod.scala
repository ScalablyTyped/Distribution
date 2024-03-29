package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadBufferMod {
  
  @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer")
  @js.native
  class UploadBuffer protected () extends CustomResource {
    /**
      * Create a UploadBuffer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UploadBufferArgs) = this()
    def this(name: String, args: UploadBufferArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Output_[String] = js.native
  }
  /* static members */
  object UploadBuffer {
    
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UploadBuffer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UploadBuffer]
    inline def get(name: String, id: Input[ID], state: UploadBufferState): UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UploadBuffer]
    inline def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): UploadBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UploadBuffer]
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean]
  }
  
  trait UploadBufferArgs extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String]
  }
  object UploadBufferArgs {
    
    inline def apply(diskId: Input[String], gatewayArn: Input[String]): UploadBufferArgs = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadBufferArgs]
    }
    
    extension [Self <: UploadBufferArgs](x: Self) {
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadBufferState extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.undefined
  }
  object UploadBufferState {
    
    inline def apply(): UploadBufferState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadBufferState]
    }
    
    extension [Self <: UploadBufferState](x: Self) {
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setDiskIdUndefined: Self = StObject.set(x, "diskId", js.undefined)
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
    }
  }
}
