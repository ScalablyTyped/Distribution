package typings.atPulumiAws.glacierVaultLockMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockArgs extends js.Object {
  val completeLock: Input[Boolean]
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

