package typings.pulumiAws

import typings.pulumiAws.outputMod.ssm.ResourceDataSyncS3Destination
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: ResourceDataSyncState): ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceDataSync]
    
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean]
  }
  
  trait ResourceDataSyncArgs extends StObject {
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon S3 configuration details for the sync.
      */
    val s3Destination: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]
  }
  object ResourceDataSyncArgs {
    
    inline def apply(s3Destination: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): ResourceDataSyncArgs = {
      val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDataSyncArgs]
    }
    
    extension [Self <: ResourceDataSyncArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setS3Destination(value: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceDataSyncState extends StObject {
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon S3 configuration details for the sync.
      */
    val s3Destination: js.UndefOr[Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]] = js.undefined
  }
  object ResourceDataSyncState {
    
    inline def apply(): ResourceDataSyncState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceDataSyncState]
    }
    
    extension [Self <: ResourceDataSyncState](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setS3Destination(value: Input[typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination]): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
      
      inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
    }
  }
}
