package typings.rateLimiterFlexible

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConsumedPoints extends StObject {
    
    var consumedPoints: Double
    
    var isFirstInDuration: Boolean
    
    var msBeforeNext: Double
    
    var remainingPoints: Double
  }
  object ConsumedPoints {
    
    inline def apply(consumedPoints: Double, isFirstInDuration: Boolean, msBeforeNext: Double, remainingPoints: Double): ConsumedPoints = {
      val __obj = js.Dynamic.literal(consumedPoints = consumedPoints.asInstanceOf[js.Any], isFirstInDuration = isFirstInDuration.asInstanceOf[js.Any], msBeforeNext = msBeforeNext.asInstanceOf[js.Any], remainingPoints = remainingPoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumedPoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsumedPoints] (val x: Self) extends AnyVal {
      
      inline def setConsumedPoints(value: Double): Self = StObject.set(x, "consumedPoints", value.asInstanceOf[js.Any])
      
      inline def setIsFirstInDuration(value: Boolean): Self = StObject.set(x, "isFirstInDuration", value.asInstanceOf[js.Any])
      
      inline def setMsBeforeNext(value: Double): Self = StObject.set(x, "msBeforeNext", value.asInstanceOf[js.Any])
      
      inline def setRemainingPoints(value: Double): Self = StObject.set(x, "remainingPoints", value.asInstanceOf[js.Any])
    }
  }
}
