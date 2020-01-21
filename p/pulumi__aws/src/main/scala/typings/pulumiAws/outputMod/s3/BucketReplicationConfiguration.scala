package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfiguration extends js.Object {
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: String = js.native
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: js.Array[BucketReplicationConfigurationRule] = js.native
}

object BucketReplicationConfiguration {
  @scala.inline
  def apply(role: String, rules: js.Array[BucketReplicationConfigurationRule]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
}

