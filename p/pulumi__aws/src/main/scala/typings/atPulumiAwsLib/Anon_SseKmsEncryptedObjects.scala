package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKmsEncryptedObjects extends js.Object {
  var sseKmsEncryptedObjects: js.UndefOr[Anon_EnabledBoolean_1082978225] = js.undefined
}

object Anon_SseKmsEncryptedObjects {
  @scala.inline
  def apply(sseKmsEncryptedObjects: Anon_EnabledBoolean_1082978225 = null): Anon_SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects)
    __obj.asInstanceOf[Anon_SseKmsEncryptedObjects]
  }
}

