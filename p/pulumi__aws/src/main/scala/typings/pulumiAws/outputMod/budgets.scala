package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object budgets {
  
  trait BudgetCostTypes extends StObject {
    
    /**
      * A boolean value whether to include credits in the cost budget. Defaults to `true`
      */
    var includeCredit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a budget includes discounts. Defaults to `true`
      */
    var includeDiscount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
      */
    var includeOtherSubscription: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
      */
    var includeRecurring: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include refunds in the cost budget. Defaults to `true`
      */
    var includeRefund: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
      */
    var includeSubscription: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include support costs in the cost budget. Defaults to `true`
      */
    var includeSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include tax in the cost budget. Defaults to `true`
      */
    var includeTax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
      */
    var includeUpfront: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a budget uses the amortized rate. Defaults to `false`
      */
    var useAmortized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
      */
    var useBlended: js.UndefOr[Boolean] = js.undefined
  }
  object BudgetCostTypes {
    
    inline def apply(): BudgetCostTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BudgetCostTypes]
    }
    
    extension [Self <: BudgetCostTypes](x: Self) {
      
      inline def setIncludeCredit(value: Boolean): Self = StObject.set(x, "includeCredit", value.asInstanceOf[js.Any])
      
      inline def setIncludeCreditUndefined: Self = StObject.set(x, "includeCredit", js.undefined)
      
      inline def setIncludeDiscount(value: Boolean): Self = StObject.set(x, "includeDiscount", value.asInstanceOf[js.Any])
      
      inline def setIncludeDiscountUndefined: Self = StObject.set(x, "includeDiscount", js.undefined)
      
      inline def setIncludeOtherSubscription(value: Boolean): Self = StObject.set(x, "includeOtherSubscription", value.asInstanceOf[js.Any])
      
      inline def setIncludeOtherSubscriptionUndefined: Self = StObject.set(x, "includeOtherSubscription", js.undefined)
      
      inline def setIncludeRecurring(value: Boolean): Self = StObject.set(x, "includeRecurring", value.asInstanceOf[js.Any])
      
      inline def setIncludeRecurringUndefined: Self = StObject.set(x, "includeRecurring", js.undefined)
      
      inline def setIncludeRefund(value: Boolean): Self = StObject.set(x, "includeRefund", value.asInstanceOf[js.Any])
      
      inline def setIncludeRefundUndefined: Self = StObject.set(x, "includeRefund", js.undefined)
      
      inline def setIncludeSubscription(value: Boolean): Self = StObject.set(x, "includeSubscription", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubscriptionUndefined: Self = StObject.set(x, "includeSubscription", js.undefined)
      
      inline def setIncludeSupport(value: Boolean): Self = StObject.set(x, "includeSupport", value.asInstanceOf[js.Any])
      
      inline def setIncludeSupportUndefined: Self = StObject.set(x, "includeSupport", js.undefined)
      
      inline def setIncludeTax(value: Boolean): Self = StObject.set(x, "includeTax", value.asInstanceOf[js.Any])
      
      inline def setIncludeTaxUndefined: Self = StObject.set(x, "includeTax", js.undefined)
      
      inline def setIncludeUpfront(value: Boolean): Self = StObject.set(x, "includeUpfront", value.asInstanceOf[js.Any])
      
      inline def setIncludeUpfrontUndefined: Self = StObject.set(x, "includeUpfront", js.undefined)
      
      inline def setUseAmortized(value: Boolean): Self = StObject.set(x, "useAmortized", value.asInstanceOf[js.Any])
      
      inline def setUseAmortizedUndefined: Self = StObject.set(x, "useAmortized", js.undefined)
      
      inline def setUseBlended(value: Boolean): Self = StObject.set(x, "useBlended", value.asInstanceOf[js.Any])
      
      inline def setUseBlendedUndefined: Self = StObject.set(x, "useBlended", js.undefined)
    }
  }
  
  trait BudgetNotification extends StObject {
    
    /**
      * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
      */
    var comparisonOperator: String
    
    /**
      * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
      */
    var notificationType: String
    
    /**
      * (Optional) E-Mail addresses to notify. Either this or `subscriberSnsTopicArns` is required.
      */
    var subscriberEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * (Optional) SNS topics to notify. Either this or `subscriberEmailAddresses` is required.
      */
    var subscriberSnsTopicArns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * (Required) Threshold when the notification should be sent.
      */
    var threshold: Double
    
    /**
      * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
      */
    var thresholdType: String
  }
  object BudgetNotification {
    
    inline def apply(comparisonOperator: String, notificationType: String, threshold: Double, thresholdType: String): BudgetNotification = {
      val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BudgetNotification]
    }
    
    extension [Self <: BudgetNotification](x: Self) {
      
      inline def setComparisonOperator(value: String): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      inline def setSubscriberEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "subscriberEmailAddresses", value.asInstanceOf[js.Any])
      
      inline def setSubscriberEmailAddressesUndefined: Self = StObject.set(x, "subscriberEmailAddresses", js.undefined)
      
      inline def setSubscriberEmailAddressesVarargs(value: String*): Self = StObject.set(x, "subscriberEmailAddresses", js.Array(value :_*))
      
      inline def setSubscriberSnsTopicArns(value: js.Array[String]): Self = StObject.set(x, "subscriberSnsTopicArns", value.asInstanceOf[js.Any])
      
      inline def setSubscriberSnsTopicArnsUndefined: Self = StObject.set(x, "subscriberSnsTopicArns", js.undefined)
      
      inline def setSubscriberSnsTopicArnsVarargs(value: String*): Self = StObject.set(x, "subscriberSnsTopicArns", js.Array(value :_*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdType(value: String): Self = StObject.set(x, "thresholdType", value.asInstanceOf[js.Any])
    }
  }
}
