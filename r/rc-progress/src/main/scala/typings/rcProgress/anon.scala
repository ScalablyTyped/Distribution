package typings.rcProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Count extends StObject {
    
    var count: Double
    
    var space: Double
  }
  object Count {
    
    inline def apply(count: Double, space: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
}
