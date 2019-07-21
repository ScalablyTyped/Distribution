package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentDocumentHashDocumentHashType extends js.Object {
  var comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var documentHash: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var documentHashType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var notificationConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_NotificationArnNotificationEvents]] = js.undefined
  var outputS3Bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var outputS3KeyPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValuesArray]]]
  ] = js.undefined
  var serviceRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var timeoutSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_CommentDocumentHashDocumentHashType {
  @scala.inline
  def apply(
    comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentHash: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentHashType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationConfig: atPulumiPulumiLib.outputMod.Input[Anon_NotificationArnNotificationEvents] = null,
    outputS3Bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    outputS3KeyPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValuesArray]]] = null,
    serviceRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    timeoutSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
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

