package typings.pulumiAws.outputMod.codecommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerTrigger extends js.Object {
  
  /**
    * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
    */
  var branches: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
    */
  var destinationArn: String = js.native
  
  /**
    * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
    */
  var events: js.Array[String] = js.native
  
  /**
    * The name of the trigger.
    */
  var name: String = js.native
}
object TriggerTrigger {
  
  @scala.inline
  def apply(destinationArn: String, events: js.Array[String], name: String): TriggerTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerTrigger]
  }
  
  @scala.inline
  implicit class TriggerTriggerOps[Self <: TriggerTrigger] (val x: Self) extends AnyVal {
    
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
    def setDestinationArn(value: String): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: String*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
}
