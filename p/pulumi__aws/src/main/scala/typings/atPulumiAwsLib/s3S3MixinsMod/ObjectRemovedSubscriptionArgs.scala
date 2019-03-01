package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectRemovedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[
    atPulumiAwsLib.atPulumiAwsLibStrings.`*` | atPulumiAwsLib.atPulumiAwsLibStrings.Delete | atPulumiAwsLib.atPulumiAwsLibStrings.DeleteMarkerCreated
  ] = js.undefined
}

object ObjectRemovedSubscriptionArgs {
  @scala.inline
  def apply(
    event: atPulumiAwsLib.atPulumiAwsLibStrings.`*` | atPulumiAwsLib.atPulumiAwsLibStrings.Delete | atPulumiAwsLib.atPulumiAwsLibStrings.DeleteMarkerCreated = null,
    filterPrefix: java.lang.String = null,
    filterSuffix: java.lang.String = null
  ): ObjectRemovedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[ObjectRemovedSubscriptionArgs]
  }
}

