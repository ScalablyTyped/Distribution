package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleS3 extends js.Object {
  /**
    * The Amazon S3 bucket name.
    */
  var bucketName: String = js.native
  /**
    * The object key.
    */
  var key: String = js.native
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: String = js.native
}

object TopicRuleS3 {
  @scala.inline
  def apply(bucketName: String, key: String, roleArn: String): TopicRuleS3 = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRuleS3]
  }
}

