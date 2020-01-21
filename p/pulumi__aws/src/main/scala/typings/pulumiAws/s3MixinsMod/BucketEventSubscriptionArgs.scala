package typings.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEventSubscriptionArgs extends CommonBucketSubscriptionArgs {
  /**
    * Events to subscribe to. For example: "[s3:ObjectCreated:*]".  Cannot be empty.
    */
  var events: js.Array[String] = js.native
}

object BucketEventSubscriptionArgs {
  @scala.inline
  def apply(events: js.Array[String], filterPrefix: String = null, filterSuffix: String = null): BucketEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEventSubscriptionArgs]
  }
}

