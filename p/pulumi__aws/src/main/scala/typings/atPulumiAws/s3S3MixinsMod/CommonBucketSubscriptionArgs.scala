package typings.atPulumiAws.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonBucketSubscriptionArgs extends js.Object {
  /**
    * An optional prefix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterPrefix: js.UndefOr[String] = js.undefined
  /**
    * An optional suffix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterSuffix: js.UndefOr[String] = js.undefined
}

object CommonBucketSubscriptionArgs {
  @scala.inline
  def apply(filterPrefix: String = null, filterSuffix: String = null): CommonBucketSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[CommonBucketSubscriptionArgs]
  }
}

