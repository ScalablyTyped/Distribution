package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortIncompleteMultipartUploadDaysEnabled extends js.Object {
  var abortIncompleteMultipartUploadDays: js.UndefOr[Input[Double]] = js.undefined
  var enabled: Input[Boolean]
  var expiration: js.UndefOr[Input[Anon_DateDaysExpiredObjectDeleteMarker]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var noncurrentVersionExpiration: js.UndefOr[Input[Anon_DaysInput]] = js.undefined
  var noncurrentVersionTransitions: js.UndefOr[Input[js.Array[Input[Anon_DaysStorageClassInput]]]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var transitions: js.UndefOr[Input[js.Array[Input[Anon_DateDaysStorageClass]]]] = js.undefined
}

object Anon_AbortIncompleteMultipartUploadDaysEnabled {
  @scala.inline
  def apply(
    enabled: Input[Boolean],
    abortIncompleteMultipartUploadDays: Input[Double] = null,
    expiration: Input[Anon_DateDaysExpiredObjectDeleteMarker] = null,
    id: Input[String] = null,
    noncurrentVersionExpiration: Input[Anon_DaysInput] = null,
    noncurrentVersionTransitions: Input[js.Array[Input[Anon_DaysStorageClassInput]]] = null,
    prefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    transitions: Input[js.Array[Input[Anon_DateDaysStorageClass]]] = null
  ): Anon_AbortIncompleteMultipartUploadDaysEnabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (abortIncompleteMultipartUploadDays != null) __obj.updateDynamic("abortIncompleteMultipartUploadDays")(abortIncompleteMultipartUploadDays.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (noncurrentVersionExpiration != null) __obj.updateDynamic("noncurrentVersionExpiration")(noncurrentVersionExpiration.asInstanceOf[js.Any])
    if (noncurrentVersionTransitions != null) __obj.updateDynamic("noncurrentVersionTransitions")(noncurrentVersionTransitions.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AbortIncompleteMultipartUploadDaysEnabled]
  }
}

