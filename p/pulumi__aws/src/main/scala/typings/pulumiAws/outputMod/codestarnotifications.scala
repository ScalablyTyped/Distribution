package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codestarnotifications {
  
  trait NotificationRuleTarget extends StObject {
    
    /**
      * The ARN of notification rule target. For example, a SNS Topic ARN.
      */
    var address: String
    
    /**
      * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
      */
    var status: String
    
    /**
      * The type of the notification target. Default value is `SNS`.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NotificationRuleTarget {
    
    @scala.inline
    def apply(address: String, status: String): NotificationRuleTarget = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationRuleTarget]
    }
    
    @scala.inline
    implicit class NotificationRuleTargetMutableBuilder[Self <: NotificationRuleTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
