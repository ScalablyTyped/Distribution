package typings.pulumiAws.triggerMod

import typings.pulumiAws.inputMod.codecommit.TriggerTrigger
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerState extends js.Object {
  
  val configurationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  
  val triggers: js.UndefOr[Input[js.Array[Input[TriggerTrigger]]]] = js.native
}
object TriggerState {
  
  @scala.inline
  def apply(): TriggerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerState]
  }
  
  @scala.inline
  implicit class TriggerStateOps[Self <: TriggerState] (val x: Self) extends AnyVal {
    
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
    def setConfigurationId(value: Input[String]): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: Input[String]): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: Input[TriggerTrigger]*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: Input[js.Array[Input[TriggerTrigger]]]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
}
