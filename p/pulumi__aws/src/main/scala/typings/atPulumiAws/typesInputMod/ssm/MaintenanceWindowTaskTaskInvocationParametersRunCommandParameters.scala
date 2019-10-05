package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends js.Object {
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[Input[String]] = js.undefined
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[Input[String]] = js.undefined
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    Input[
      MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
    ]
  ] = js.undefined
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
      ]
    ]
  ] = js.undefined
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
  @scala.inline
  def apply(
    comment: Input[String] = null,
    documentHash: Input[String] = null,
    documentHashType: Input[String] = null,
    notificationConfig: Input[
      MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
    ] = null,
    outputS3Bucket: Input[String] = null,
    outputS3KeyPrefix: Input[String] = null,
    parameters: Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
      ]
    ] = null,
    serviceRoleArn: Input[String] = null,
    timeoutSeconds: Input[Double] = null
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

