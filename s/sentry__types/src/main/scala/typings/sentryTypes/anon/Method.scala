package typings.sentryTypes.anon

import typings.sentryTypes.transactionMod.TransactionSamplingMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var method: TransactionSamplingMethod
  
  var rate: js.UndefOr[Double] = js.undefined
}
object Method {
  
  inline def apply(method: TransactionSamplingMethod): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setMethod(value: TransactionSamplingMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
