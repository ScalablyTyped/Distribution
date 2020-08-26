package typings.pulumiAws.vaultLockMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultLockArgs extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: Input[Boolean] = js.native
  /**
    * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
    */
  val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: Input[String] = js.native
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: Input[String] = js.native
}

object VaultLockArgs {
  @scala.inline
  def apply(completeLock: Input[Boolean], policy: Input[String], vaultName: Input[String]): VaultLockArgs = {
    val __obj = js.Dynamic.literal(completeLock = completeLock.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultLockArgs]
  }
  @scala.inline
  implicit class VaultLockArgsOps[Self <: VaultLockArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompleteLock(value: Input[Boolean]): Self = this.set("completeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultName(value: Input[String]): Self = this.set("vaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreDeletionError(value: Input[Boolean]): Self = this.set("ignoreDeletionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDeletionError: Self = this.set("ignoreDeletionError", js.undefined)
  }
  
}

