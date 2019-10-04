package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfiguration extends js.Object {
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: String
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: js.Array[BucketReplicationConfigurationRule]
}

object BucketReplicationConfiguration {
  @scala.inline
  def apply(role: String, rules: js.Array[BucketReplicationConfigurationRule]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role, rules = rules)
  
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
}

