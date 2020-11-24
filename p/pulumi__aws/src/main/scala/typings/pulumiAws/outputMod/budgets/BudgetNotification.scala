package typings.pulumiAws.outputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetNotification extends js.Object {
  
  /**
    * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
    */
  var comparisonOperator: String = js.native
  
  /**
    * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
    */
  var notificationType: String = js.native
  
  /**
    * (Optional) E-Mail addresses to notify. Either this or `subscriberSnsTopicArns` is required.
    */
  var subscriberEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Optional) SNS topics to notify. Either this or `subscriberEmailAddresses` is required.
    */
  var subscriberSnsTopicArns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Required) Threshold when the notification should be sent.
    */
  var threshold: Double = js.native
  
  /**
    * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
    */
  var thresholdType: String = js.native
}
object BudgetNotification {
  
  @scala.inline
  def apply(comparisonOperator: String, notificationType: String, threshold: Double, thresholdType: String): BudgetNotification = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetNotification]
  }
  
  @scala.inline
  implicit class BudgetNotificationOps[Self <: BudgetNotification] (val x: Self) extends AnyVal {
    
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
    def setComparisonOperator(value: String): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationType(value: String): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdType(value: String): Self = this.set("thresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberEmailAddressesVarargs(value: String*): Self = this.set("subscriberEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSubscriberEmailAddresses(value: js.Array[String]): Self = this.set("subscriberEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriberEmailAddresses: Self = this.set("subscriberEmailAddresses", js.undefined)
    
    @scala.inline
    def setSubscriberSnsTopicArnsVarargs(value: String*): Self = this.set("subscriberSnsTopicArns", js.Array(value :_*))
    
    @scala.inline
    def setSubscriberSnsTopicArns(value: js.Array[String]): Self = this.set("subscriberSnsTopicArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriberSnsTopicArns: Self = this.set("subscriberSnsTopicArns", js.undefined)
  }
}
