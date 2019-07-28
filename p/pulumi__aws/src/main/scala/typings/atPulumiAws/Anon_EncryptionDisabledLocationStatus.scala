package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionDisabledLocationStatus extends js.Object {
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.undefined
  var location: js.UndefOr[Input[String]] = js.undefined
  var status: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EncryptionDisabledLocationStatus {
  @scala.inline
  def apply(
    encryptionDisabled: Input[Boolean] = null,
    location: Input[String] = null,
    status: Input[String] = null
  ): Anon_EncryptionDisabledLocationStatus = {
    val __obj = js.Dynamic.literal()
    if (encryptionDisabled != null) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionDisabledLocationStatus]
  }
}

