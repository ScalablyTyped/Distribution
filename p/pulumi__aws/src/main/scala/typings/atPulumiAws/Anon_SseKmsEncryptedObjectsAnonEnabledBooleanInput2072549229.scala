package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229 extends js.Object {
  var sseKmsEncryptedObjects: js.UndefOr[Input[Anon_EnabledBooleanInput_2072549229]] = js.undefined
}

object Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229 {
  @scala.inline
  def apply(sseKmsEncryptedObjects: Input[Anon_EnabledBooleanInput_2072549229] = null): Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229 = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput2072549229]
  }
}

