package typings
package atPulumiAwsLib.glacierVaultLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockState extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the Terraform resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Allow Terraform to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via Terraform, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
    */
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

