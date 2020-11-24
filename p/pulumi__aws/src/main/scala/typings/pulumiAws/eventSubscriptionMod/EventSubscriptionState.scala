package typings.pulumiAws.eventSubscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscriptionState extends js.Object {
  
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the event subscription should be enabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
    */
  val eventCategories: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Name of event subscription.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * SNS topic arn to send events on.
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Ids of sources to listen to.
    */
  val sourceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Type of source for events. Valid values: `replication-instance` or `replication-task`
    */
  val sourceType: js.UndefOr[Input[String]] = js.native
  
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object EventSubscriptionState {
  
  @scala.inline
  def apply(): EventSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscriptionState]
  }
  
  @scala.inline
  implicit class EventSubscriptionStateOps[Self <: EventSubscriptionState] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: Input[String]*): Self = this.set("eventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventCategories(value: Input[js.Array[Input[String]]]): Self = this.set("eventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCategories: Self = this.set("eventCategories", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
    
    @scala.inline
    def setSourceIdsVarargs(value: Input[String]*): Self = this.set("sourceIds", js.Array(value :_*))
    
    @scala.inline
    def setSourceIds(value: Input[js.Array[Input[String]]]): Self = this.set("sourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIds: Self = this.set("sourceIds", js.undefined)
    
    @scala.inline
    def setSourceType(value: Input[String]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
