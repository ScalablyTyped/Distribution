package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.outputMod.datasync.EfsLocationEc2Config
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efsLocationMod {
  
  @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
  @js.native
  class EfsLocation protected () extends CustomResource {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EfsLocationArgs) = this()
    def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: Output_[EfsLocationEc2Config] = js.native
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: Output_[ARN] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val uri: Output_[String] = js.native
  }
  /* static members */
  object EfsLocation {
    
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EfsLocation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EfsLocation]
    inline def get(name: String, id: Input[ID], state: EfsLocationState): EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EfsLocation]
    inline def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EfsLocation]
    
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean]
  }
  
  trait EfsLocationArgs extends StObject {
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: Input[typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config]
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: Input[ARN]
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EfsLocationArgs {
    
    extension [Self <: EfsLocationArgs](x: Self) {
      
      inline def setEc2Config(value: Input[typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config]): Self = StObject.set(x, "ec2Config", value.asInstanceOf[js.Any])
      
      inline def setEfsFileSystemArn(value: Input[ARN]): Self = StObject.set(x, "efsFileSystemArn", value.asInstanceOf[js.Any])
      
      inline def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      inline def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait EfsLocationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val uri: js.UndefOr[Input[String]] = js.undefined
  }
  object EfsLocationState {
    
    inline def apply(): EfsLocationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EfsLocationState]
    }
    
    extension [Self <: EfsLocationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEc2Config(value: Input[typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config]): Self = StObject.set(x, "ec2Config", value.asInstanceOf[js.Any])
      
      inline def setEc2ConfigUndefined: Self = StObject.set(x, "ec2Config", js.undefined)
      
      inline def setEfsFileSystemArn(value: Input[ARN]): Self = StObject.set(x, "efsFileSystemArn", value.asInstanceOf[js.Any])
      
      inline def setEfsFileSystemArnUndefined: Self = StObject.set(x, "efsFileSystemArn", js.undefined)
      
      inline def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      inline def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
