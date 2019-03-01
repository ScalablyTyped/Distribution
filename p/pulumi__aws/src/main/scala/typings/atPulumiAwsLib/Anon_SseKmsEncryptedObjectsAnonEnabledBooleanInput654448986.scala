package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986 extends js.Object {
  var sseKmsEncryptedObjects: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledBooleanInput_654448986]] = js.undefined
}

object Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986 {
  @scala.inline
  def apply(
    sseKmsEncryptedObjects: atPulumiPulumiLib.outputMod.Input[Anon_EnabledBooleanInput_654448986] = null
  ): Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986 = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986]
  }
}

