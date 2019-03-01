package typings
package atPulumiAwsLib.elastictranscoderPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineState extends js.Object {
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
    */
  val awsKmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
    */
  val contentConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketStorageClassInput]] = js.undefined
  /**
    * The permissions for the `content_config` object. (documented below)
    */
  val contentConfigPermissions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccessesGrantee]]]
  ] = js.undefined
  /**
    * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
    */
  val inputBucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the pipeline. Maximum 40 characters
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
    */
  val notifications: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CompletedError]] = js.undefined
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
    */
  val outputBucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
    */
  val role: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
    */
  val thumbnailConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketStorageClassInput]] = js.undefined
  /**
    * The permissions for the `thumbnail_config` object. (documented below)
    */
  val thumbnailConfigPermissions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccessesGrantee]]]
  ] = js.undefined
}

object PipelineState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    awsKmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    contentConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketStorageClassInput] = null,
    contentConfigPermissions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccessesGrantee]]] = null,
    inputBucket: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notifications: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CompletedError] = null,
    outputBucket: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    role: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    thumbnailConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketStorageClassInput] = null,
    thumbnailConfigPermissions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AccessesGrantee]]] = null
  ): PipelineState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsKmsKeyArn != null) __obj.updateDynamic("awsKmsKeyArn")(awsKmsKeyArn.asInstanceOf[js.Any])
    if (contentConfig != null) __obj.updateDynamic("contentConfig")(contentConfig.asInstanceOf[js.Any])
    if (contentConfigPermissions != null) __obj.updateDynamic("contentConfigPermissions")(contentConfigPermissions.asInstanceOf[js.Any])
    if (inputBucket != null) __obj.updateDynamic("inputBucket")(inputBucket.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (outputBucket != null) __obj.updateDynamic("outputBucket")(outputBucket.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (thumbnailConfig != null) __obj.updateDynamic("thumbnailConfig")(thumbnailConfig.asInstanceOf[js.Any])
    if (thumbnailConfigPermissions != null) __obj.updateDynamic("thumbnailConfigPermissions")(thumbnailConfigPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineState]
  }
}

