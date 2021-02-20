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

object workingStorageMod {
  
  @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage")
  @js.native
  class WorkingStorage protected () extends CustomResource {
    /**
      * Create a WorkingStorage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkingStorageArgs) = this()
    def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
    
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
  object WorkingStorage {
    
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID]): WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): WorkingStorage = js.native
    
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
  
  @js.native
  trait WorkingStorageArgs extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Input[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String] = js.native
  }
  object WorkingStorageArgs {
    
    @scala.inline
    def apply(diskId: Input[String], gatewayArn: Input[String]): WorkingStorageArgs = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkingStorageArgs]
    }
    
    @scala.inline
    implicit class WorkingStorageArgsMutableBuilder[Self <: WorkingStorageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkingStorageState extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.native
  }
  object WorkingStorageState {
    
    @scala.inline
    def apply(): WorkingStorageState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkingStorageState]
    }
    
    @scala.inline
    implicit class WorkingStorageStateMutableBuilder[Self <: WorkingStorageState] (val x: Self) extends AnyVal {
      
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
