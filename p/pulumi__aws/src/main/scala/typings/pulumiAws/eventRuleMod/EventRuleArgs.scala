package typings.pulumiAws.eventRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventRuleArgs extends js.Object {
  
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
    */
  val eventBusName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
    */
  val eventPattern: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the rule should be enabled (defaults to `true`).
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus.
    */
  val scheduleExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object EventRuleArgs {
  
  @scala.inline
  def apply(): EventRuleArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRuleArgs]
  }
  
  @scala.inline
  implicit class EventRuleArgsOps[Self <: EventRuleArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEventBusName(value: Input[String]): Self = this.set("eventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusName: Self = this.set("eventBusName", js.undefined)
    
    @scala.inline
    def setEventPattern(value: Input[String]): Self = this.set("eventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPattern: Self = this.set("eventPattern", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Input[Boolean]): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: Input[String]): Self = this.set("scheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleExpression: Self = this.set("scheduleExpression", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
