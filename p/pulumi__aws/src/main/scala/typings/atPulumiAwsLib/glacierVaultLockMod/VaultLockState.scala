package typings
package atPulumiAwsLib.glacierVaultLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockState extends js.Object {
  val completeLock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val ignoreDeletionError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VaultLockState {
  @scala.inline
  def apply(
    completeLock: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ignoreDeletionError: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vaultName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VaultLockState = {
    val __obj = js.Dynamic.literal()
    if (completeLock != null) __obj.updateDynamic("completeLock")(completeLock.asInstanceOf[js.Any])
    if (ignoreDeletionError != null) __obj.updateDynamic("ignoreDeletionError")(ignoreDeletionError.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (vaultName != null) __obj.updateDynamic("vaultName")(vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockState]
  }
}

