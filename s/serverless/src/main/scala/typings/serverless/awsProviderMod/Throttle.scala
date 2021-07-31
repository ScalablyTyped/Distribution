package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Throttle extends StObject {
  
  var burstLimit: js.UndefOr[Double | String] = js.undefined
  
  var rateLimit: js.UndefOr[Double | String] = js.undefined
}
object Throttle {
  
  @scala.inline
  def apply(): Throttle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Throttle]
  }
  
  @scala.inline
  implicit class ThrottleMutableBuilder[Self <: Throttle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBurstLimit(value: Double | String): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double | String): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
  }
}
