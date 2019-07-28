package typings.atPulumiAws.elastictranscoderPipelineMod

import typings.atPulumiAws.Anon_AccessesGrantee
import typings.atPulumiAws.Anon_BucketStorageClassInput
import typings.atPulumiAws.Anon_CompletedError
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArgs extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
    */
  val awsKmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
    */
  val contentConfig: js.UndefOr[Input[Anon_BucketStorageClassInput]] = js.undefined
  /**
    * The permissions for the `content_config` object. (documented below)
    */
  val contentConfigPermissions: js.UndefOr[Input[js.Array[Input[Anon_AccessesGrantee]]]] = js.undefined
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
  val notifications: js.UndefOr[Input[Anon_CompletedError]] = js.undefined
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
  val thumbnailConfig: js.UndefOr[Input[Anon_BucketStorageClassInput]] = js.undefined
  /**
    * The permissions for the `thumbnail_config` object. (documented below)
    */
  val thumbnailConfigPermissions: js.UndefOr[Input[js.Array[Input[Anon_AccessesGrantee]]]] = js.undefined
}

object PipelineArgs {
  @scala.inline
  def apply(
    inputBucket: Input[String],
    role: Input[String],
    awsKmsKeyArn: Input[String] = null,
    contentConfig: Input[Anon_BucketStorageClassInput] = null,
    contentConfigPermissions: Input[js.Array[Input[Anon_AccessesGrantee]]] = null,
    name: Input[String] = null,
    notifications: Input[Anon_CompletedError] = null,
    outputBucket: Input[String] = null,
    thumbnailConfig: Input[Anon_BucketStorageClassInput] = null,
    thumbnailConfigPermissions: Input[js.Array[Input[Anon_AccessesGrantee]]] = null
  ): PipelineArgs = {
    val __obj = js.Dynamic.literal(inputBucket = inputBucket.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (awsKmsKeyArn != null) __obj.updateDynamic("awsKmsKeyArn")(awsKmsKeyArn.asInstanceOf[js.Any])
    if (contentConfig != null) __obj.updateDynamic("contentConfig")(contentConfig.asInstanceOf[js.Any])
    if (contentConfigPermissions != null) __obj.updateDynamic("contentConfigPermissions")(contentConfigPermissions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (outputBucket != null) __obj.updateDynamic("outputBucket")(outputBucket.asInstanceOf[js.Any])
    if (thumbnailConfig != null) __obj.updateDynamic("thumbnailConfig")(thumbnailConfig.asInstanceOf[js.Any])
    if (thumbnailConfigPermissions != null) __obj.updateDynamic("thumbnailConfigPermissions")(thumbnailConfigPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArgs]
  }
}

