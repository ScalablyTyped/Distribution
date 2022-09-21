package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterRes extends StObject {
  
  var consumedPoints: js.UndefOr[Double] = js.undefined
  
  var isFirstInDuration: js.UndefOr[Boolean] = js.undefined
  
  var msBeforeNext: js.UndefOr[Double] = js.undefined
  
  var remainingPoints: js.UndefOr[Double] = js.undefined
}
object IRateLimiterRes {
  
  inline def apply(): IRateLimiterRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRateLimiterRes]
  }
  
  extension [Self <: IRateLimiterRes](x: Self) {
    
    inline def setConsumedPoints(value: Double): Self = StObject.set(x, "consumedPoints", value.asInstanceOf[js.Any])
    
    inline def setConsumedPointsUndefined: Self = StObject.set(x, "consumedPoints", js.undefined)
    
    inline def setIsFirstInDuration(value: Boolean): Self = StObject.set(x, "isFirstInDuration", value.asInstanceOf[js.Any])
    
    inline def setIsFirstInDurationUndefined: Self = StObject.set(x, "isFirstInDuration", js.undefined)
    
    inline def setMsBeforeNext(value: Double): Self = StObject.set(x, "msBeforeNext", value.asInstanceOf[js.Any])
    
    inline def setMsBeforeNextUndefined: Self = StObject.set(x, "msBeforeNext", js.undefined)
    
    inline def setRemainingPoints(value: Double): Self = StObject.set(x, "remainingPoints", value.asInstanceOf[js.Any])
    
    inline def setRemainingPointsUndefined: Self = StObject.set(x, "remainingPoints", js.undefined)
  }
}
