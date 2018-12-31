package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoncurrentVersionTransitionsPrefix extends js.Object {
  var abortIncompleteMultipartUploadDays: js.UndefOr[scala.Double] = js.undefined
  var enabled: scala.Boolean
  var expirations: js.UndefOr[js.Array[Anon_DateDaysExpiredObjectDeleteMarker]] = js.undefined
  var id: java.lang.String
  var noncurrentVersionExpirations: js.UndefOr[js.Array[Anon_DaysNumber]] = js.undefined
  var noncurrentVersionTransitions: js.UndefOr[js.Array[Anon_DaysStorageClass]] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var transitions: js.UndefOr[js.Array[Anon_DateDaysStorageClass]] = js.undefined
}

