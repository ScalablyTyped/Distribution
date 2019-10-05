package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends js.Object {
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[String] = js.undefined
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[String] = js.undefined
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
  ] = js.undefined
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[String] = js.undefined
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[String] = js.undefined
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  ] = js.undefined
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
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
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (documentHash != null) __obj.updateDynamic("documentHash")(documentHash)
    if (documentHashType != null) __obj.updateDynamic("documentHashType")(documentHashType)
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig)
    if (outputS3Bucket != null) __obj.updateDynamic("outputS3Bucket")(outputS3Bucket)
    if (outputS3KeyPrefix != null) __obj.updateDynamic("outputS3KeyPrefix")(outputS3KeyPrefix)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn)
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]
  }
}

