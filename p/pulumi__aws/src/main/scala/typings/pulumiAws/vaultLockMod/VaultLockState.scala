package typings.pulumiAws.vaultLockMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultLockState extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
    */
  val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: js.UndefOr[Input[String]] = js.native
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

