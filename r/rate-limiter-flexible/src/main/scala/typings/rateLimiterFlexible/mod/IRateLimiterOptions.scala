package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterOptions extends StObject {
  
  var blockDuration: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var execEvenly: js.UndefOr[Boolean] = js.undefined
  
  var execEvenlyMinDelayMs: js.UndefOr[Double] = js.undefined
  
  var keyPrefix: js.UndefOr[String] = js.undefined
  
  var points: js.UndefOr[Double] = js.undefined
}
object IRateLimiterOptions {
  
  inline def apply(): IRateLimiterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRateLimiterOptions]
  }
  
  extension [Self <: IRateLimiterOptions](x: Self) {
    
    inline def setBlockDuration(value: Double): Self = StObject.set(x, "blockDuration", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationUndefined: Self = StObject.set(x, "blockDuration", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExecEvenly(value: Boolean): Self = StObject.set(x, "execEvenly", value.asInstanceOf[js.Any])
    
    inline def setExecEvenlyMinDelayMs(value: Double): Self = StObject.set(x, "execEvenlyMinDelayMs", value.asInstanceOf[js.Any])
    
    inline def setExecEvenlyMinDelayMsUndefined: Self = StObject.set(x, "execEvenlyMinDelayMs", js.undefined)
    
    inline def setExecEvenlyUndefined: Self = StObject.set(x, "execEvenly", js.undefined)
    
    inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
