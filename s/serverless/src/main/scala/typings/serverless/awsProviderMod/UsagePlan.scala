package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsagePlan extends StObject {
  
  var quota: js.UndefOr[Quota] = js.undefined
  
  var throttle: js.UndefOr[Throttle] = js.undefined
}
object UsagePlan {
  
  @scala.inline
  def apply(): UsagePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlan]
  }
  
  @scala.inline
  implicit class UsagePlanMutableBuilder[Self <: UsagePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuota(value: Quota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setThrottle(value: Throttle): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
