package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleNoncurrentVersionExpiration extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent object versions expire.
    */
  var days: js.UndefOr[Double] = js.native
}

object BucketLifecycleRuleNoncurrentVersionExpiration {
  @scala.inline
  def apply(days: js.UndefOr[Double] = js.undefined): BucketLifecycleRuleNoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionExpiration]
  }
}

