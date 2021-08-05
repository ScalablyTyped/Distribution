package typings.rabbitJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CorrelationId extends StObject {
    
    var correlationId: Double
  }
  object CorrelationId {
    
    inline def apply(correlationId: Double): CorrelationId = {
      val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorrelationId]
    }
    
    extension [Self <: CorrelationId](x: Self) {
      
      inline def setCorrelationId(value: Double): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    }
  }
}
