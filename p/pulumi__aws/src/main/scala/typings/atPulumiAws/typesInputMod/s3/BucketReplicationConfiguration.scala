package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfiguration extends js.Object {
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: Input[String]
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]
}

object BucketReplicationConfiguration {
  @scala.inline
  def apply(role: Input[String], rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
}

