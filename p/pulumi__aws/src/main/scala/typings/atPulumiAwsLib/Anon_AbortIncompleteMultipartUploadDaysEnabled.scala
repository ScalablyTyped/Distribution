package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortIncompleteMultipartUploadDaysEnabled extends js.Object {
  var abortIncompleteMultipartUploadDays: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  var expiration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DateDaysExpiredObjectDeleteMarker]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var noncurrentVersionExpiration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DaysInput]] = js.undefined
  var noncurrentVersionTransitions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DaysStorageClassInput]]]
  ] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var transitions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DateDaysStorageClass]]]
  ] = js.undefined
}

object Anon_AbortIncompleteMultipartUploadDaysEnabled {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    abortIncompleteMultipartUploadDays: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    expiration: atPulumiPulumiLib.outputMod.Input[Anon_DateDaysExpiredObjectDeleteMarker] = null,
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    noncurrentVersionExpiration: atPulumiPulumiLib.outputMod.Input[Anon_DaysInput] = null,
    noncurrentVersionTransitions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DaysStorageClassInput]]] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    transitions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DateDaysStorageClass]]] = null
  ): Anon_AbortIncompleteMultipartUploadDaysEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
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

