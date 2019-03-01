package typings
package atPulumiAwsLib.glacierVaultLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockArgs extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the Terraform resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * Allow Terraform to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via Terraform, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
    */
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completeLock")(completeLock.asInstanceOf[js.Any])
    __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.updateDynamic("vaultName")(vaultName.asInstanceOf[js.Any])
    if (ignoreDeletionError != null) __obj.updateDynamic("ignoreDeletionError")(ignoreDeletionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockArgs]
  }
}

