package typings.pulumiAws.actionTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionTargetState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the Security Hub custom action target.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the custom action target.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID for the custom action target.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description for the custom action target.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object ActionTargetState {
  
  @scala.inline
  def apply(): ActionTargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTargetState]
  }
  
  @scala.inline
  implicit class ActionTargetStateOps[Self <: ActionTargetState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Input[String]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
