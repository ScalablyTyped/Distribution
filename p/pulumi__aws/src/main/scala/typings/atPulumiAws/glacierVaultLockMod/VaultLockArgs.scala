package typings.atPulumiAws.glacierVaultLockMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockArgs extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: Input[Boolean]
  /**
    * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
    */
  val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: Input[String]
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: Input[String]
}

object VaultLockArgs {
  @scala.inline
  def apply(
    completeLock: Input[Boolean],
    policy: Input[String],
    vaultName: Input[String],
    ignoreDeletionError: Input[Boolean] = null
  ): VaultLockArgs = {
    val __obj = js.Dynamic.literal(completeLock = completeLock.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (ignoreDeletionError != null) __obj.updateDynamic("ignoreDeletionError")(ignoreDeletionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockArgs]
  }
}

