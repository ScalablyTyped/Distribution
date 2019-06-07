package typings
package atPulumiAwsLib.elastictranscoderPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder/pipeline", "Pipeline")
@js.native
class Pipeline protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Pipeline resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PipelineArgs) = this()
  def this(name: java.lang.String, args: PipelineArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
    */
  val awsKmsKeyArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
    */
  val contentConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_BucketStorageClass] = js.native
  /**
    * The permissions for the `content_config` object. (documented below)
    */
  val contentConfigPermissions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Accesses]]] = js.native
  /**
    * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
    */
  val inputBucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the pipeline. Maximum 40 characters
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
    */
  val notifications: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Completed]] = js.native
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
    */
  val outputBucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
    */
  val role: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
    */
  val thumbnailConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_BucketStorageClass] = js.native
  /**
    * The permissions for the `thumbnail_config` object. (documented below)
    */
  val thumbnailConfigPermissions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Accesses]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elastictranscoder/pipeline", "Pipeline")
@js.native
object Pipeline extends js.Object {
  /**
    * Get an existing Pipeline resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elastictranscoderPipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPipelineMod.PipelineState
  ): atPulumiAwsLib.elastictranscoderPipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPipelineMod.PipelineState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elastictranscoderPipelineMod.Pipeline = js.native
  /**
    * Returns true if the given object is an instance of Pipeline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ scala.Boolean = js.native
}

