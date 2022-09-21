package typings.redisClient.anon

import typings.redisClient.redisClientStrings.Equalssign
import typings.redisClient.redisClientStrings.MAXLEN
import typings.redisClient.redisClientStrings.MINID
import typings.redisClient.redisClientStrings.Tilde
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[MAXLEN | MINID] = js.undefined
  
  var strategyModifier: js.UndefOr[Equalssign | Tilde] = js.undefined
  
  var threshold: Double
}
object Limit {
  
  inline def apply(threshold: Double): Limit = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setStrategy(value: MAXLEN | MINID): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyModifier(value: Equalssign | Tilde): Self = StObject.set(x, "strategyModifier", value.asInstanceOf[js.Any])
    
    inline def setStrategyModifierUndefined: Self = StObject.set(x, "strategyModifier", js.undefined)
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
