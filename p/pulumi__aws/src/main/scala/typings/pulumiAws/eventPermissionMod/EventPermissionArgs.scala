package typings.pulumiAws.eventPermissionMod

import typings.pulumiAws.inputMod.cloudwatch.EventPermissionCondition
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPermissionArgs extends js.Object {
  
  /**
    * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
    */
  val action: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
    */
  val condition: js.UndefOr[Input[EventPermissionCondition]] = js.native
  
  /**
    * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
    */
  val eventBusName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
    */
  val principal: Input[String] = js.native
  
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: Input[String] = js.native
}
object EventPermissionArgs {
  
  @scala.inline
  def apply(principal: Input[String], statementId: Input[String]): EventPermissionArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionArgs]
  }
  
  @scala.inline
  implicit class EventPermissionArgsOps[Self <: EventPermissionArgs] (val x: Self) extends AnyVal {
    
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
    def setPrincipal(value: Input[String]): Self = this.set("principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementId(value: Input[String]): Self = this.set("statementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: Input[String]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCondition(value: Input[EventPermissionCondition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setEventBusName(value: Input[String]): Self = this.set("eventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusName: Self = this.set("eventBusName", js.undefined)
  }
}
