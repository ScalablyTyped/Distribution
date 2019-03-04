package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountId extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var bucketArn: java.lang.String
  var encryption: js.UndefOr[Anon_SseKms] = js.undefined
  var format: java.lang.String
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccountId {
  @scala.inline
  def apply(
    bucketArn: java.lang.String,
    format: java.lang.String,
    accountId: java.lang.String = null,
    encryption: Anon_SseKms = null,
    prefix: java.lang.String = null
  ): Anon_AccountId = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, format = format)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (encryption != null) __obj.updateDynamic("encryption")(encryption)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_AccountId]
  }
}

