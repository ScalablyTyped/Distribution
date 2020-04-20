package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfiguration extends js.Object {
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: Input[String] = js.native
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]] = js.native
}

object BucketReplicationConfiguration {
  @scala.inline
  def apply(role: Input[String], rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
}

