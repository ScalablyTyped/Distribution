package typings.pulumiAws.vaultPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultPolicyArgs extends js.Object {
  
  /**
    * Name of the backup vault to add policy for.
    */
  val backupVaultName: Input[String] = js.native
  
  /**
    * The backup vault access policy document in JSON format.
    */
  val policy: Input[String] = js.native
}
object VaultPolicyArgs {
  
  @scala.inline
  def apply(backupVaultName: Input[String], policy: Input[String]): VaultPolicyArgs = {
    val __obj = js.Dynamic.literal(backupVaultName = backupVaultName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultPolicyArgs]
  }
  
  @scala.inline
  implicit class VaultPolicyArgsOps[Self <: VaultPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setBackupVaultName(value: Input[String]): Self = this.set("backupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
