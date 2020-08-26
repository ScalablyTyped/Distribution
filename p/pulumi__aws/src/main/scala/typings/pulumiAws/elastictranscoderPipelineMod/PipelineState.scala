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
  def apply(): PipelineState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineState]
  }
  @scala.inline
  implicit class PipelineStateOps[Self <: PipelineState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAwsKmsKeyArn(value: Input[String]): Self = this.set("awsKmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsKmsKeyArn: Self = this.set("awsKmsKeyArn", js.undefined)
    @scala.inline
    def setContentConfig(value: Input[PipelineContentConfig]): Self = this.set("contentConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentConfig: Self = this.set("contentConfig", js.undefined)
    @scala.inline
    def setContentConfigPermissionsVarargs(value: Input[PipelineContentConfigPermission]*): Self = this.set("contentConfigPermissions", js.Array(value :_*))
    @scala.inline
    def setContentConfigPermissions(value: Input[js.Array[Input[PipelineContentConfigPermission]]]): Self = this.set("contentConfigPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentConfigPermissions: Self = this.set("contentConfigPermissions", js.undefined)
    @scala.inline
    def setInputBucket(value: Input[String]): Self = this.set("inputBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBucket: Self = this.set("inputBucket", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotifications(value: Input[PipelineNotifications]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    @scala.inline
    def setOutputBucket(value: Input[String]): Self = this.set("outputBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputBucket: Self = this.set("outputBucket", js.undefined)
    @scala.inline
    def setRole(value: Input[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setThumbnailConfig(value: Input[PipelineThumbnailConfig]): Self = this.set("thumbnailConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailConfig: Self = this.set("thumbnailConfig", js.undefined)
    @scala.inline
    def setThumbnailConfigPermissionsVarargs(value: Input[PipelineThumbnailConfigPermission]*): Self = this.set("thumbnailConfigPermissions", js.Array(value :_*))
    @scala.inline
    def setThumbnailConfigPermissions(value: Input[js.Array[Input[PipelineThumbnailConfigPermission]]]): Self = this.set("thumbnailConfigPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailConfigPermissions: Self = this.set("thumbnailConfigPermissions", js.undefined)
  }
  
}

