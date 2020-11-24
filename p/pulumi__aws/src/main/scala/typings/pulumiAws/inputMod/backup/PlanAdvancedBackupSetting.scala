package typings.pulumiAws.inputMod.backup

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanAdvancedBackupSetting extends js.Object {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Set to `{ WindowsVSS = "enabled" }` to enable Windows VSS backup option and create a VSS Windows backup.
    */
  var backupOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: `EC2`.
    */
  var resourceType: js.UndefOr[Input[String]] = js.native
}
object PlanAdvancedBackupSetting {
  
  @scala.inline
  def apply(): PlanAdvancedBackupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanAdvancedBackupSetting]
  }
  
  @scala.inline
  implicit class PlanAdvancedBackupSettingOps[Self <: PlanAdvancedBackupSetting] (val x: Self) extends AnyVal {
    
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
    def setBackupOptions(value: Input[StringDictionary[Input[String]]]): Self = this.set("backupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupOptions: Self = this.set("backupOptions", js.undefined)
    
    @scala.inline
    def setResourceType(value: Input[String]): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
