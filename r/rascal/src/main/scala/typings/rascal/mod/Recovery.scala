package typings.rascal.mod

import typings.rascal.rascalStrings.ack
import typings.rascal.rascalStrings.forward
import typings.rascal.rascalStrings.nack
import typings.rascal.rascalStrings.republish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recovery extends StObject {
  
  var attempts: js.UndefOr[Double] = js.undefined
  
  var defer: js.UndefOr[Double] = js.undefined
  
  var immediateNack: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[PublicationConfig] = js.undefined
  
  var publication: js.UndefOr[String] = js.undefined
  
  var requeue: js.UndefOr[Boolean] = js.undefined
  
  var strategy: ack | nack | republish | forward
  
  var xDeathFix: js.UndefOr[Boolean] = js.undefined
}
object Recovery {
  
  inline def apply(strategy: ack | nack | republish | forward): Recovery = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
  
  extension [Self <: Recovery](x: Self) {
    
    inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setImmediateNack(value: Boolean): Self = StObject.set(x, "immediateNack", value.asInstanceOf[js.Any])
    
    inline def setImmediateNackUndefined: Self = StObject.set(x, "immediateNack", js.undefined)
    
    inline def setOptions(value: PublicationConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublication(value: String): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
    
    inline def setRequeue(value: Boolean): Self = StObject.set(x, "requeue", value.asInstanceOf[js.Any])
    
    inline def setRequeueUndefined: Self = StObject.set(x, "requeue", js.undefined)
    
    inline def setStrategy(value: ack | nack | republish | forward): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setXDeathFix(value: Boolean): Self = StObject.set(x, "xDeathFix", value.asInstanceOf[js.Any])
    
    inline def setXDeathFixUndefined: Self = StObject.set(x, "xDeathFix", js.undefined)
  }
}
