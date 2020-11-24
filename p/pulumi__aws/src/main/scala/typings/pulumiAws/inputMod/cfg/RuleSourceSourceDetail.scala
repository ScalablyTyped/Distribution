package typings.pulumiAws.inputMod.cfg

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSourceSourceDetail extends js.Object {
  
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
    */
  var eventSource: js.UndefOr[Input[String]] = js.native
  
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  var maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
    */
  var messageType: js.UndefOr[Input[String]] = js.native
}
object RuleSourceSourceDetail {
  
  @scala.inline
  def apply(): RuleSourceSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSourceSourceDetail]
  }
  
  @scala.inline
  implicit class RuleSourceSourceDetailOps[Self <: RuleSourceSourceDetail] (val x: Self) extends AnyVal {
    
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
    def setEventSource(value: Input[String]): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSource: Self = this.set("eventSource", js.undefined)
    
    @scala.inline
    def setMaximumExecutionFrequency(value: Input[String]): Self = this.set("maximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumExecutionFrequency: Self = this.set("maximumExecutionFrequency", js.undefined)
    
    @scala.inline
    def setMessageType(value: Input[String]): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
  }
}
