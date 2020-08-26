package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleS3Action extends js.Object {
  /**
    * The name of the S3 bucket
    */
  var bucketName: String = js.native
  /**
    * The ARN of the KMS key
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
  /**
    * The key prefix of the S3 bucket
    */
  var objectKeyPrefix: js.UndefOr[String] = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleS3Action {
  @scala.inline
  def apply(bucketName: String, position: Double): ReceiptRuleS3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleS3Action]
  }
  @scala.inline
  implicit class ReceiptRuleS3ActionOps[Self <: ReceiptRuleS3Action] (val x: Self) extends AnyVal {
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setObjectKeyPrefix(value: String): Self = this.set("objectKeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectKeyPrefix: Self = this.set("objectKeyPrefix", js.undefined)
    @scala.inline
    def setTopicArn(value: String): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
  
}

