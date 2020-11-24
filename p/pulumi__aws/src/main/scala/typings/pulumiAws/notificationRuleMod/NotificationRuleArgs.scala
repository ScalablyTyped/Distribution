package typings.pulumiAws.notificationRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationRuleArgs extends js.Object {
  
  /**
    * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
    */
  val detailType: Input[String] = js.native
  
  /**
    * A list of event types associated with this notification rule.
    * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
    */
  val eventTypeIds: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The name of notification rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the resource to associate with the notification rule.
    */
  val resource: Input[String] = js.native
  
  /**
    * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
    */
  val targets: js.UndefOr[Input[js.Array[Input[NotificationRuleTarget]]]] = js.native
}
object NotificationRuleArgs {
  
  @scala.inline
  def apply(detailType: Input[String], eventTypeIds: Input[js.Array[Input[String]]], resource: Input[String]): NotificationRuleArgs = {
    val __obj = js.Dynamic.literal(detailType = detailType.asInstanceOf[js.Any], eventTypeIds = eventTypeIds.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleArgs]
  }
  
  @scala.inline
  implicit class NotificationRuleArgsOps[Self <: NotificationRuleArgs] (val x: Self) extends AnyVal {
    
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
    def setDetailType(value: Input[String]): Self = this.set("detailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIdsVarargs(value: Input[String]*): Self = this.set("eventTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeIds(value: Input[js.Array[Input[String]]]): Self = this.set("eventTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Input[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Input[NotificationRuleTarget]*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Input[js.Array[Input[NotificationRuleTarget]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
}
