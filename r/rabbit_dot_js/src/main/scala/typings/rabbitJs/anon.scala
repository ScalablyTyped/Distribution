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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CorrelationId] (val x: Self) extends AnyVal {
      
      inline def setCorrelationId(value: Double): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    }
  }
}
