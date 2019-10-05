package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleS3Action extends js.Object {
  /**
    * The name of the S3 bucket
    */
  var bucketName: String
  /**
    * The ARN of the KMS key
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  /**
    * The key prefix of the S3 bucket
    */
  var objectKeyPrefix: js.UndefOr[String] = js.undefined
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.undefined
}

object ReceiptRuleS3Action {
  @scala.inline
  def apply(
    bucketName: String,
    position: Double,
    kmsKeyArn: String = null,
    objectKeyPrefix: String = null,
    topicArn: String = null
  ): ReceiptRuleS3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, position = position)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[ReceiptRuleS3Action]
  }
}

