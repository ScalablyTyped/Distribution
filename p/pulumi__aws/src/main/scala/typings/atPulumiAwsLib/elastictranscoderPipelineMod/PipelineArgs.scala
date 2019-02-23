package typings
package atPulumiAwsLib.elastictranscoderPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArgs extends js.Object {
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
  val inputBucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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
  val role: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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

