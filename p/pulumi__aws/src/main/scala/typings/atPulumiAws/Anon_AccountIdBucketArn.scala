package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdBucketArn extends js.Object {
  var accountId: js.UndefOr[Input[String]] = js.undefined
  var bucketArn: Input[String]
  var encryption: js.UndefOr[Input[Anon_SseKmsSseS3]] = js.undefined
  var format: Input[String]
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AccountIdBucketArn {
  @scala.inline
  def apply(
    bucketArn: Input[String],
    format: Input[String],
    accountId: Input[String] = null,
    encryption: Input[Anon_SseKmsSseS3] = null,
    prefix: Input[String] = null
  ): Anon_AccountIdBucketArn = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountIdBucketArn]
  }
}

