package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortIncompleteMultipartUploadDays extends js.Object {
  var abortIncompleteMultipartUploadDays: js.UndefOr[Double] = js.undefined
  var enabled: Boolean
  var expiration: js.UndefOr[Anon_Date] = js.undefined
  var id: String
  var noncurrentVersionExpiration: js.UndefOr[Anon_Days] = js.undefined
  var noncurrentVersionTransitions: js.UndefOr[js.Array[Anon_DaysStorageClass]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var transitions: js.UndefOr[js.Array[Anon_DateDays]] = js.undefined
}

object Anon_AbortIncompleteMultipartUploadDays {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: String,
    abortIncompleteMultipartUploadDays: Int | Double = null,
    expiration: Anon_Date = null,
    noncurrentVersionExpiration: Anon_Days = null,
    noncurrentVersionTransitions: js.Array[Anon_DaysStorageClass] = null,
    prefix: String = null,
    tags: StringDictionary[js.Any] = null,
    transitions: js.Array[Anon_DateDays] = null
  ): Anon_AbortIncompleteMultipartUploadDays = {
    val __obj = js.Dynamic.literal(enabled = enabled, id = id)
    if (abortIncompleteMultipartUploadDays != null) __obj.updateDynamic("abortIncompleteMultipartUploadDays")(abortIncompleteMultipartUploadDays.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (noncurrentVersionExpiration != null) __obj.updateDynamic("noncurrentVersionExpiration")(noncurrentVersionExpiration)
    if (noncurrentVersionTransitions != null) __obj.updateDynamic("noncurrentVersionTransitions")(noncurrentVersionTransitions)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[Anon_AbortIncompleteMultipartUploadDays]
  }
}

