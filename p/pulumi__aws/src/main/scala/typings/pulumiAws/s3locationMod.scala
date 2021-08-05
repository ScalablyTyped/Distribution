package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.outputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3locationMod {
  
  @JSImport("@pulumi/aws/datasync/s3location", "S3Location")
  @js.native
  class S3Location protected () extends CustomResource {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3LocationArgs) = this()
    def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: Output_[ARN] = js.native
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: Output_[S3LocationS3Config] = js.native
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: Output_[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val uri: Output_[String] = js.native
  }
  /* static members */
  object S3Location {
    
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[S3Location]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[S3Location]
    inline def get(name: String, id: Input[ID], state: S3LocationState): S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[S3Location]
    inline def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[S3Location]
    
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean]
  }
  
  trait S3LocationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: Input[ARN]
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: Input[typings.pulumiAws.inputMod.datasync.S3LocationS3Config]
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: Input[String]
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object S3LocationArgs {
    
    extension [Self <: S3LocationArgs](x: Self) {
      
      inline def setS3BucketArn(value: Input[ARN]): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
      
      inline def setS3Config(value: Input[typings.pulumiAws.inputMod.datasync.S3LocationS3Config]): Self = StObject.set(x, "s3Config", value.asInstanceOf[js.Any])
      
      inline def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait S3LocationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.S3LocationS3Config]] = js.undefined
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val uri: js.UndefOr[Input[String]] = js.undefined
  }
  object S3LocationState {
    
    inline def apply(): S3LocationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3LocationState]
    }
    
    extension [Self <: S3LocationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setS3BucketArn(value: Input[ARN]): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
      
      inline def setS3BucketArnUndefined: Self = StObject.set(x, "s3BucketArn", js.undefined)
      
      inline def setS3Config(value: Input[typings.pulumiAws.inputMod.datasync.S3LocationS3Config]): Self = StObject.set(x, "s3Config", value.asInstanceOf[js.Any])
      
      inline def setS3ConfigUndefined: Self = StObject.set(x, "s3Config", js.undefined)
      
      inline def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      inline def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
