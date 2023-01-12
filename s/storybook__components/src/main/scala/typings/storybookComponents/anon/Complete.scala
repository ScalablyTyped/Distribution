package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var complete: Double
  
  var total: Double
}
object Complete {
  
  inline def apply(complete: Double, total: Double): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Double): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
