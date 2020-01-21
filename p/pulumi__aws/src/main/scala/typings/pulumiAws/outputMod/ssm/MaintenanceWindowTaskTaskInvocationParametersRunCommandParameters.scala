package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends js.Object {
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[String] = js.native
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[String] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
  ] = js.native
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[String] = js.native
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[String] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  ] = js.native
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[String] = js.native
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
  @scala.inline
  def apply(
    comment: String = null,
    documentHash: String = null,
    documentHashType: String = null,
    notificationConfig: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = null,
    outputS3Bucket: String = null,
    outputS3KeyPrefix: String = null,
    parameters: js.Array[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter] = null,
    serviceRoleArn: String = null,
    timeoutSeconds: Int | Double = null
  ): MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (documentHash != null) __obj.updateDynamic("documentHash")(documentHash.asInstanceOf[js.Any])
    if (documentHashType != null) __obj.updateDynamic("documentHashType")(documentHashType.asInstanceOf[js.Any])
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig.asInstanceOf[js.Any])
    if (outputS3Bucket != null) __obj.updateDynamic("outputS3Bucket")(outputS3Bucket.asInstanceOf[js.Any])
    if (outputS3KeyPrefix != null) __obj.updateDynamic("outputS3KeyPrefix")(outputS3KeyPrefix.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]
  }
}

