package typings
package atPulumiAwsLib.glacierVaultLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockArgs extends js.Object {
  val completeLock: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  val ignoreDeletionError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VaultLockArgs {
  @scala.inline
  def apply(
    completeLock: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vaultName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ignoreDeletionError: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): VaultLockArgs = {
    val __obj = js.Dynamic.literal(completeLock = completeLock.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (ignoreDeletionError != null) __obj.updateDynamic("ignoreDeletionError")(ignoreDeletionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockArgs]
  }
}

