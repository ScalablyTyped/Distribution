package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentDocumentHashDocumentHashType extends js.Object {
  var comment: js.UndefOr[Input[String]] = js.undefined
  var documentHash: js.UndefOr[Input[String]] = js.undefined
  var documentHashType: js.UndefOr[Input[String]] = js.undefined
  var notificationConfig: js.UndefOr[Input[Anon_NotificationArnNotificationEvents]] = js.undefined
  var outputS3Bucket: js.UndefOr[Input[String]] = js.undefined
  var outputS3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
  var parameters: js.UndefOr[Input[js.Array[Input[Anon_NameValuesArray]]]] = js.undefined
  var serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_CommentDocumentHashDocumentHashType {
  @scala.inline
  def apply(
    comment: Input[String] = null,
    documentHash: Input[String] = null,
    documentHashType: Input[String] = null,
    notificationConfig: Input[Anon_NotificationArnNotificationEvents] = null,
    outputS3Bucket: Input[String] = null,
    outputS3KeyPrefix: Input[String] = null,
    parameters: Input[js.Array[Input[Anon_NameValuesArray]]] = null,
    serviceRoleArn: Input[String] = null,
    timeoutSeconds: Input[Double] = null
  ): Anon_CommentDocumentHashDocumentHashType = {
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
    __obj.asInstanceOf[Anon_CommentDocumentHashDocumentHashType]
  }
}

