package typings.atPulumiAws.s3S3MixinsMod

import typings.atPulumiAws.atPulumiAwsStrings.Delete
import typings.atPulumiAws.atPulumiAwsStrings.DeleteMarkerCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectRemovedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[typings.atPulumiAws.atPulumiAwsStrings.`*` | Delete | DeleteMarkerCreated] = js.undefined
}

object ObjectRemovedSubscriptionArgs {
  @scala.inline
  def apply(
    event: typings.atPulumiAws.atPulumiAwsStrings.`*` | Delete | DeleteMarkerCreated = null,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): ObjectRemovedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[ObjectRemovedSubscriptionArgs]
  }
}

