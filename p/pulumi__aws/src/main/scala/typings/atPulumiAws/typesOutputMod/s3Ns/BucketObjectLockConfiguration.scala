package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
    */
  var objectLockEnabled: String
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: js.UndefOr[BucketObjectLockConfigurationRule] = js.undefined
}

object BucketObjectLockConfiguration {
  @scala.inline
  def apply(objectLockEnabled: String, rule: BucketObjectLockConfigurationRule = null): BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[BucketObjectLockConfiguration]
  }
}

