package typings.pulumiAws.vaultNotificationsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultNotificationsState extends js.Object {
  
  /**
    * The ARN of the vault.
    */
  val backupVaultArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  val backupVaultEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Name of the backup vault to add notifications for.
    */
  val backupVaultName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
}
object VaultNotificationsState {
  
  @scala.inline
  def apply(): VaultNotificationsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultNotificationsState]
  }
  
  @scala.inline
  implicit class VaultNotificationsStateOps[Self <: VaultNotificationsState] (val x: Self) extends AnyVal {
    
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
    def setBackupVaultEventsVarargs(value: Input[String]*): Self = this.set("backupVaultEvents", js.Array(value :_*))
    
    @scala.inline
    def setBackupVaultEvents(value: Input[js.Array[Input[String]]]): Self = this.set("backupVaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupVaultEvents: Self = this.set("backupVaultEvents", js.undefined)
    
    @scala.inline
    def setBackupVaultName(value: Input[String]): Self = this.set("backupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupVaultName: Self = this.set("backupVaultName", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
  }
}
