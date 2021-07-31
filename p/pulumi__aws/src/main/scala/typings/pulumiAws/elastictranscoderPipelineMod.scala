package typings.pulumiAws

import typings.pulumiAws.outputMod.elastictranscoder.PipelineContentConfig
import typings.pulumiAws.outputMod.elastictranscoder.PipelineContentConfigPermission
import typings.pulumiAws.outputMod.elastictranscoder.PipelineNotifications
import typings.pulumiAws.outputMod.elastictranscoder.PipelineThumbnailConfig
import typings.pulumiAws.outputMod.elastictranscoder.PipelineThumbnailConfigPermission
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elastictranscoderPipelineMod {
  
  @JSImport("@pulumi/aws/elastictranscoder/pipeline", "Pipeline")
  @js.native
  class Pipeline protected () extends CustomResource {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: PipelineArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
      */
    val awsKmsKeyArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
      */
    val contentConfig: Output_[PipelineContentConfig] = js.native
    
    /**
      * The permissions for the `contentConfig` object. (documented below)
      */
    val contentConfigPermissions: Output_[js.UndefOr[js.Array[PipelineContentConfigPermission]]] = js.native
    
    /**
      * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
      */
    val inputBucket: Output_[String] = js.native
    
    /**
      * The name of the pipeline. Maximum 40 characters
      */
    val name: Output_[String] = js.native
    
    /**
      * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
      */
    val notifications: Output_[js.UndefOr[PipelineNotifications]] = js.native
    
    /**
      * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
      */
    val outputBucket: Output_[String] = js.native
    
    /**
      * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
      */
    val role: Output_[String] = js.native
    
    /**
      * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
      */
    val thumbnailConfig: Output_[PipelineThumbnailConfig] = js.native
    
    /**
      * The permissions for the `thumbnailConfig` object. (documented below)
      */
    val thumbnailConfigPermissions: Output_[js.UndefOr[js.Array[PipelineThumbnailConfigPermission]]] = js.native
  }
  /* static members */
  object Pipeline {
    
    @JSImport("@pulumi/aws/elastictranscoder/pipeline", "Pipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    @scala.inline
    def get(name: String, id: Input[ID], state: PipelineState): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    @scala.inline
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ Boolean]
  }
  
  trait PipelineArgs extends StObject {
    
    /**
      * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
      */
    val awsKmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
      */
    val contentConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig]] = js.undefined
    
    /**
      * The permissions for the `contentConfig` object. (documented below)
      */
    val contentConfigPermissions: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]
          ]
        ]
      ] = js.undefined
    
    /**
      * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
      */
    val inputBucket: Input[String]
    
    /**
      * The name of the pipeline. Maximum 40 characters
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
      */
    val notifications: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineNotifications]] = js.undefined
    
    /**
      * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
      */
    val outputBucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
      */
    val role: Input[String]
    
    /**
      * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
      */
    val thumbnailConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig]] = js.undefined
    
    /**
      * The permissions for the `thumbnailConfig` object. (documented below)
      */
    val thumbnailConfigPermissions: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]
          ]
        ]
      ] = js.undefined
  }
  object PipelineArgs {
    
    @scala.inline
    def apply(inputBucket: Input[String], role: Input[String]): PipelineArgs = {
      val __obj = js.Dynamic.literal(inputBucket = inputBucket.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArgs]
    }
    
    @scala.inline
    implicit class PipelineArgsMutableBuilder[Self <: PipelineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsKmsKeyArn(value: Input[String]): Self = StObject.set(x, "awsKmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "awsKmsKeyArn", js.undefined)
      
      @scala.inline
      def setContentConfig(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig]): Self = StObject.set(x, "contentConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentConfigPermissions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]
              ]
            ]
      ): Self = StObject.set(x, "contentConfigPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentConfigPermissionsUndefined: Self = StObject.set(x, "contentConfigPermissions", js.undefined)
      
      @scala.inline
      def setContentConfigPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]*): Self = StObject.set(x, "contentConfigPermissions", js.Array(value :_*))
      
      @scala.inline
      def setContentConfigUndefined: Self = StObject.set(x, "contentConfig", js.undefined)
      
      @scala.inline
      def setInputBucket(value: Input[String]): Self = StObject.set(x, "inputBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineNotifications]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setOutputBucket(value: Input[String]): Self = StObject.set(x, "outputBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputBucketUndefined: Self = StObject.set(x, "outputBucket", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailConfig(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig]): Self = StObject.set(x, "thumbnailConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailConfigPermissions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]
              ]
            ]
      ): Self = StObject.set(x, "thumbnailConfigPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailConfigPermissionsUndefined: Self = StObject.set(x, "thumbnailConfigPermissions", js.undefined)
      
      @scala.inline
      def setThumbnailConfigPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]*): Self = StObject.set(x, "thumbnailConfigPermissions", js.Array(value :_*))
      
      @scala.inline
      def setThumbnailConfigUndefined: Self = StObject.set(x, "thumbnailConfig", js.undefined)
    }
  }
  
  trait PipelineState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
      */
    val awsKmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
      */
    val contentConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig]] = js.undefined
    
    /**
      * The permissions for the `contentConfig` object. (documented below)
      */
    val contentConfigPermissions: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]
          ]
        ]
      ] = js.undefined
    
    /**
      * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
      */
    val inputBucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the pipeline. Maximum 40 characters
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
      */
    val notifications: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineNotifications]] = js.undefined
    
    /**
      * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
      */
    val outputBucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
      */
    val role: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
      */
    val thumbnailConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig]] = js.undefined
    
    /**
      * The permissions for the `thumbnailConfig` object. (documented below)
      */
    val thumbnailConfigPermissions: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]
          ]
        ]
      ] = js.undefined
  }
  object PipelineState {
    
    @scala.inline
    def apply(): PipelineState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineState]
    }
    
    @scala.inline
    implicit class PipelineStateMutableBuilder[Self <: PipelineState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAwsKmsKeyArn(value: Input[String]): Self = StObject.set(x, "awsKmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "awsKmsKeyArn", js.undefined)
      
      @scala.inline
      def setContentConfig(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig]): Self = StObject.set(x, "contentConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentConfigPermissions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]
              ]
            ]
      ): Self = StObject.set(x, "contentConfigPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentConfigPermissionsUndefined: Self = StObject.set(x, "contentConfigPermissions", js.undefined)
      
      @scala.inline
      def setContentConfigPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission]*): Self = StObject.set(x, "contentConfigPermissions", js.Array(value :_*))
      
      @scala.inline
      def setContentConfigUndefined: Self = StObject.set(x, "contentConfig", js.undefined)
      
      @scala.inline
      def setInputBucket(value: Input[String]): Self = StObject.set(x, "inputBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBucketUndefined: Self = StObject.set(x, "inputBucket", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineNotifications]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setOutputBucket(value: Input[String]): Self = StObject.set(x, "outputBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputBucketUndefined: Self = StObject.set(x, "outputBucket", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setThumbnailConfig(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig]): Self = StObject.set(x, "thumbnailConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailConfigPermissions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]
              ]
            ]
      ): Self = StObject.set(x, "thumbnailConfigPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailConfigPermissionsUndefined: Self = StObject.set(x, "thumbnailConfigPermissions", js.undefined)
      
      @scala.inline
      def setThumbnailConfigPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission]*): Self = StObject.set(x, "thumbnailConfigPermissions", js.Array(value :_*))
      
      @scala.inline
      def setThumbnailConfigUndefined: Self = StObject.set(x, "thumbnailConfig", js.undefined)
    }
  }
}
