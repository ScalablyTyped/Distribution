package typings.pulumiAws.vaultPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultPolicyState extends js.Object {
  
  /**
    * The ARN of the vault.
    */
  val backupVaultArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the backup vault to add policy for.
    */
  val backupVaultName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The backup vault access policy document in JSON format.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}
object VaultPolicyState {
  
  @scala.inline
  def apply(): VaultPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultPolicyState]
  }
  
  @scala.inline
  implicit class VaultPolicyStateOps[Self <: VaultPolicyState] (val x: Self) extends AnyVal {
    
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
    def setBackupVaultArn(value: Input[String]): Self = this.set("backupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupVaultArn: Self = this.set("backupVaultArn", js.undefined)
    
    @scala.inline
    def setBackupVaultName(value: Input[String]): Self = this.set("backupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupVaultName: Self = this.set("backupVaultName", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
