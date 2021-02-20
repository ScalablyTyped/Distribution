package typings.pulumiAws

import typings.pulumiAws.outputMod.ssm.ResourceDataSyncS3Destination
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceDataSyncMod {
  
  @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync")
  @js.native
  class ResourceDataSync protected () extends CustomResource {
    /**
      * Create a ResourceDataSync resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceDataSyncArgs) = this()
    def this(name: String, args: ResourceDataSyncArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name for the configuration.
      */
    val name: Output_[String] = js.native
    
    /**
      * Amazon S3 configuration details for the sync.
      */
    val s3Destination: Output_[ResourceDataSyncS3Destination] = js.native
  }
  /* static members */
  object ResourceDataSync {
    
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState): ResourceDataSync = js.native
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): ResourceDataSync = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = js.native
  }
  
  @js.native
  trait ResourceDataSyncArgs extends StObject {
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon S3 configuration details for the sync.
      */
    val s3Destination: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination] = js.native
  }
  object ResourceDataSyncArgs {
    
    @scala.inline
    def apply(s3Destination: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): ResourceDataSyncArgs = {
      val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDataSyncArgs]
    }
    
    @scala.inline
    implicit class ResourceDataSyncArgsMutableBuilder[Self <: ResourceDataSyncArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3Destination(value: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceDataSyncState extends StObject {
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon S3 configuration details for the sync.
      */
    val s3Destination: js.UndefOr[Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]] = js.native
  }
  object ResourceDataSyncState {
    
    @scala.inline
    def apply(): ResourceDataSyncState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceDataSyncState]
    }
    
    @scala.inline
    implicit class ResourceDataSyncStateMutableBuilder[Self <: ResourceDataSyncState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3Destination(value: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
    }
  }
}
