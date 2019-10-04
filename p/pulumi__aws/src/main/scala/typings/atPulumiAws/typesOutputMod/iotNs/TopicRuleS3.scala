package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleS3 extends js.Object {
  /**
    * The Amazon S3 bucket name.
    */
  var bucketName: String
  /**
    * The object key.
    */
  var key: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
}

object TopicRuleS3 {
  @scala.inline
  def apply(bucketName: String, key: String, roleArn: String): TopicRuleS3 = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, key = key, roleArn = roleArn)
  
    __obj.asInstanceOf[TopicRuleS3]
  }
}

