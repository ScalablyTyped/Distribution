package typings.pulumiAws.s3MixinsMod

import typings.pulumiAws.pulumiAwsStrings.Asterisk
import typings.pulumiAws.pulumiAwsStrings.Delete
import typings.pulumiAws.pulumiAwsStrings.DeleteMarkerCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectRemovedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[Asterisk | Delete | DeleteMarkerCreated] = js.native
}

object ObjectRemovedSubscriptionArgs {
  @scala.inline
  def apply(
    event: Asterisk | Delete | DeleteMarkerCreated = null,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): ObjectRemovedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectRemovedSubscriptionArgs]
  }
}

