package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectLockConfigurationRule extends js.Object {
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention
}

object BucketObjectLockConfigurationRule {
  @scala.inline
  def apply(defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention)
  
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
}

