package typings.atPulumiAws.glacierVaultLockMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockState extends js.Object {
  val completeLock: js.UndefOr[Input[Boolean]] = js.undefined
  val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: js.UndefOr[Input[String]] = js.undefined
}

object VaultLockState {
  @scala.inline
  def apply(
    completeLock: Input[Boolean] = null,
    ignoreDeletionError: Input[Boolean] = null,
    policy: Input[String] = null,
    vaultName: Input[String] = null
  ): VaultLockState = {
    val __obj = js.Dynamic.literal()
    if (completeLock != null) __obj.updateDynamic("completeLock")(completeLock.asInstanceOf[js.Any])
    if (ignoreDeletionError != null) __obj.updateDynamic("ignoreDeletionError")(ignoreDeletionError.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (vaultName != null) __obj.updateDynamic("vaultName")(vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockState]
  }
}

