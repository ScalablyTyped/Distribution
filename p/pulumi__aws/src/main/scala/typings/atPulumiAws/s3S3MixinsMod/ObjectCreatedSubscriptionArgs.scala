package typings.atPulumiAws.s3S3MixinsMod

import typings.atPulumiAws.atPulumiAwsStrings.CompleteMultipartUpload
import typings.atPulumiAws.atPulumiAwsStrings.Copy
import typings.atPulumiAws.atPulumiAwsStrings.Post
import typings.atPulumiAws.atPulumiAwsStrings.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[
    typings.atPulumiAws.atPulumiAwsStrings.`*` | Put | Post | Copy | CompleteMultipartUpload
  ] = js.undefined
}

object ObjectCreatedSubscriptionArgs {
  @scala.inline
  def apply(
    event: typings.atPulumiAws.atPulumiAwsStrings.`*` | Put | Post | Copy | CompleteMultipartUpload = null,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
}

