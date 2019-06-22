package typings
package atPulumiAwsLib.ebsEncryptionByDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionByDefaultArgs extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object EncryptionByDefaultArgs {
  @scala.inline
  def apply(enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null): EncryptionByDefaultArgs = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionByDefaultArgs]
  }
}

