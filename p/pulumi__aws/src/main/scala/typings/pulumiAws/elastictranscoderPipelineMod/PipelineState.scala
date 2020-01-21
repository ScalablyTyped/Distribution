package typings.pulumiAws.elastictranscoderPipelineMod

import typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig
import typings.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission
import typings.pulumiAws.inputMod.elastictranscoder.PipelineNotifications
import typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig
import typings.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
    */
  val awsKmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
    */
  val contentConfig: js.UndefOr[Input[PipelineContentConfig]] = js.native
  /**
    * The permissions for the `contentConfig` object. (documented below)
    */
  val contentConfigPermissions: js.UndefOr[Input[js.Array[Input[PipelineContentConfigPermission]]]] = js.native
  /**
    * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
    */
  val inputBucket: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the pipeline. Maximum 40 characters
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
    */
  val notifications: js.UndefOr[Input[PipelineNotifications]] = js.native
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
    */
  val outputBucket: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
    */
  val role: js.UndefOr[Input[String]] = js.native
  /**
    * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
    */
  val thumbnailConfig: js.UndefOr[Input[PipelineThumbnailConfig]] = js.native
  /**
    * The permissions for the `thumbnailConfig` object. (documented below)
    */
  val thumbnailConfigPermissions: js.UndefOr[Input[js.Array[Input[PipelineThumbnailConfigPermission]]]] = js.native
}

object PipelineState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    awsKmsKeyArn: Input[String] = null,
    contentConfig: Input[PipelineContentConfig] = null,
    contentConfigPermissions: Input[js.Array[Input[PipelineContentConfigPermission]]] = null,
    inputBucket: Input[String] = null,
    name: Input[String] = null,
    notifications: Input[PipelineNotifications] = null,
    outputBucket: Input[String] = null,
    role: Input[String] = null,
    thumbnailConfig: Input[PipelineThumbnailConfig] = null,
    thumbnailConfigPermissions: Input[js.Array[Input[PipelineThumbnailConfigPermission]]] = null
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

