package typings.pulumiAws.planMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting
import typings.pulumiAws.inputMod.backup.PlanRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanArgs extends js.Object {
  
  /**
    * An object that specifies backup options for each resource type.
    */
  val advancedBackupSettings: js.UndefOr[Input[js.Array[Input[PlanAdvancedBackupSetting]]]] = js.native
  
  /**
    * The display name of a backup plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A rule object that specifies a scheduled task that is used to back up a selection of resources.
    */
  val rules: Input[js.Array[Input[PlanRule]]] = js.native
  
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object PlanArgs {
  
  @scala.inline
  def apply(rules: Input[js.Array[Input[PlanRule]]]): PlanArgs = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanArgs]
  }
  
  @scala.inline
  implicit class PlanArgsOps[Self <: PlanArgs] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: Input[PlanRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[PlanRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedBackupSettingsVarargs(value: Input[PlanAdvancedBackupSetting]*): Self = this.set("advancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedBackupSettings(value: Input[js.Array[Input[PlanAdvancedBackupSetting]]]): Self = this.set("advancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedBackupSettings: Self = this.set("advancedBackupSettings", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
