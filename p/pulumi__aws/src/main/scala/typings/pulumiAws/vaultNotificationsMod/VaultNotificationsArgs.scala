package typings.pulumiAws.vaultNotificationsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultNotificationsArgs extends js.Object {
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  val backupVaultEvents: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Name of the backup vault to add notifications for.
    */
  val backupVaultName: Input[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
    */
  val snsTopicArn: Input[String] = js.native
}
object VaultNotificationsArgs {
  
  @scala.inline
  def apply(
    backupVaultEvents: Input[js.Array[Input[String]]],
    backupVaultName: Input[String],
    snsTopicArn: Input[String]
  ): VaultNotificationsArgs = {
    val __obj = js.Dynamic.literal(backupVaultEvents = backupVaultEvents.asInstanceOf[js.Any], backupVaultName = backupVaultName.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultNotificationsArgs]
  }
  
  @scala.inline
  implicit class VaultNotificationsArgsOps[Self <: VaultNotificationsArgs] (val x: Self) extends AnyVal {
    
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
    def setBackupVaultEventsVarargs(value: Input[String]*): Self = this.set("backupVaultEvents", js.Array(value :_*))
    
    @scala.inline
    def setBackupVaultEvents(value: Input[js.Array[Input[String]]]): Self = this.set("backupVaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupVaultName(value: Input[String]): Self = this.set("backupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
  }
}
