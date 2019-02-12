package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortIncompleteMultipartUploadDaysEnabled extends js.Object {
  var abortIncompleteMultipartUploadDays: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var expiration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_DateDaysExpiredObjectDeleteMarker]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var noncurrentVersionExpiration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_DaysInput]] = js.undefined
  var noncurrentVersionTransitions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_DaysStorageClassInput]]]
  ] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var transitions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_DateDaysStorageClass]]]
  ] = js.undefined
}

