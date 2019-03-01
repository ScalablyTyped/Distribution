package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[
    atPulumiAwsLib.atPulumiAwsLibStrings.`*` | atPulumiAwsLib.atPulumiAwsLibStrings.Put | atPulumiAwsLib.atPulumiAwsLibStrings.Post | atPulumiAwsLib.atPulumiAwsLibStrings.Copy | atPulumiAwsLib.atPulumiAwsLibStrings.CompleteMultipartUpload
  ] = js.undefined
}

object ObjectCreatedSubscriptionArgs {
  @scala.inline
  def apply(
    event: atPulumiAwsLib.atPulumiAwsLibStrings.`*` | atPulumiAwsLib.atPulumiAwsLibStrings.Put | atPulumiAwsLib.atPulumiAwsLibStrings.Post | atPulumiAwsLib.atPulumiAwsLibStrings.Copy | atPulumiAwsLib.atPulumiAwsLibStrings.CompleteMultipartUpload = null,
    filterPrefix: java.lang.String = null,
    filterSuffix: java.lang.String = null
  ): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
}

