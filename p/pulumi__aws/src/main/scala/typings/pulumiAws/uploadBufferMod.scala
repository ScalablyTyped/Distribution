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
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID]): UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): UploadBuffer = js.native
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway/uploadBuffer", "UploadBuffer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  @js.native
  trait UploadBufferArgs extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Input[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String] = js.native
  }
  object UploadBufferArgs {
    
    @scala.inline
    def apply(diskId: Input[String], gatewayArn: Input[String]): UploadBufferArgs = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadBufferArgs]
    }
    
    @scala.inline
    implicit class UploadBufferArgsMutableBuilder[Self <: UploadBufferArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadBufferState extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.native
  }
  object UploadBufferState {
    
    @scala.inline
    def apply(): UploadBufferState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadBufferState]
    }
    
    @scala.inline
    implicit class UploadBufferStateMutableBuilder[Self <: UploadBufferState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskIdUndefined: Self = StObject.set(x, "diskId", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
    }
  }
}
