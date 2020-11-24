package typings.pulumiAws.triggerMod

import typings.pulumiAws.inputMod.codecommit.TriggerTrigger
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerArgs extends js.Object {
  
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Input[String] = js.native
  
  val triggers: Input[js.Array[Input[TriggerTrigger]]] = js.native
}
object TriggerArgs {
  
  @scala.inline
  def apply(repositoryName: Input[String], triggers: Input[js.Array[Input[TriggerTrigger]]]): TriggerArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerArgs]
  }
  
  @scala.inline
  implicit class TriggerArgsOps[Self <: TriggerArgs] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: Input[String]): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersVarargs(value: Input[TriggerTrigger]*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: Input[js.Array[Input[TriggerTrigger]]]): Self = this.set("triggers", value.asInstanceOf[js.Any])
  }
}
