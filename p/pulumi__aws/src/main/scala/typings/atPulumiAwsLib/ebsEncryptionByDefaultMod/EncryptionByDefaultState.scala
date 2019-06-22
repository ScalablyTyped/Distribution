package typings
package atPulumiAwsLib.ebsEncryptionByDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionByDefaultState extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object EncryptionByDefaultState {
  @scala.inline
  def apply(enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null): EncryptionByDefaultState = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionByDefaultState]
  }
}

