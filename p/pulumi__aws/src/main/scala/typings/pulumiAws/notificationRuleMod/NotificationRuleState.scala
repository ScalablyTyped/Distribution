package typings.pulumiAws.notificationRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationRuleState extends js.Object {
  
  /**
    * The codestar notification rule ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
    */
  val detailType: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of event types associated with this notification rule.
    * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
    */
  val eventTypeIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of notification rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the resource to associate with the notification rule.
    */
  val resource: js.UndefOr[Input[String]] = js.native
  
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
object NotificationRuleState {
  
  @scala.inline
  def apply(): NotificationRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationRuleState]
  }
  
  @scala.inline
  implicit class NotificationRuleStateOps[Self <: NotificationRuleState] (val x: Self) extends AnyVal {
    
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
    def setDetailType(value: Input[String]): Self = this.set("detailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailType: Self = this.set("detailType", js.undefined)
    
    @scala.inline
    def setEventTypeIdsVarargs(value: Input[String]*): Self = this.set("eventTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeIds(value: Input[js.Array[Input[String]]]): Self = this.set("eventTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypeIds: Self = this.set("eventTypeIds", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResource(value: Input[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
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
