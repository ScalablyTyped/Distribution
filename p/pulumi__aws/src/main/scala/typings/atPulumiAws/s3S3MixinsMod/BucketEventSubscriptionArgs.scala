package typings.atPulumiAws.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketEventSubscriptionArgs extends CommonBucketSubscriptionArgs {
  /**
    * Events to subscribe to. For example: "[s3:ObjectCreated:*]".  Cannot be empty.
    */
  var events: js.Array[String]
}

object BucketEventSubscriptionArgs {
  @scala.inline
  def apply(events: js.Array[String], filterPrefix: String = null, filterSuffix: String = null): BucketEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(events = events)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[BucketEventSubscriptionArgs]
  }
}

