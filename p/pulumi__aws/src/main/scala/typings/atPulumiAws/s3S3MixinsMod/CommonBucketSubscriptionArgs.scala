package typings.atPulumiAws.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonBucketSubscriptionArgs extends js.Object {
  /**
    * An optional prefix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterPrefix: js.UndefOr[String] = js.native
  /**
    * An optional suffix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterSuffix: js.UndefOr[String] = js.native
}

object CommonBucketSubscriptionArgs {
  @scala.inline
  def apply(filterPrefix: String = null, filterSuffix: String = null): CommonBucketSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonBucketSubscriptionArgs]
  }
}

