package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentDocumentHash extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var documentHash: js.UndefOr[String] = js.undefined
  var documentHashType: js.UndefOr[String] = js.undefined
  var notificationConfig: js.UndefOr[Anon_NotificationArn] = js.undefined
  var outputS3Bucket: js.UndefOr[String] = js.undefined
  var outputS3KeyPrefix: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}

object Anon_CommentDocumentHash {
  @scala.inline
  def apply(
    comment: String = null,
    documentHash: String = null,
    documentHashType: String = null,
    notificationConfig: Anon_NotificationArn = null,
    outputS3Bucket: String = null,
    outputS3KeyPrefix: String = null,
    parameters: js.Array[Anon_NameValues] = null,
    serviceRoleArn: String = null,
    timeoutSeconds: Int | Double = null
  ): Anon_CommentDocumentHash = {
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
    __obj.asInstanceOf[Anon_CommentDocumentHash]
  }
}

