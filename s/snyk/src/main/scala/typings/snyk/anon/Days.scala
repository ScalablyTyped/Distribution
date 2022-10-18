package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days extends StObject {
  
  var days: js.UndefOr[Double] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object Days {
  
  inline def apply(): Days = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Days]
  }
  
  extension [Self <: Days](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
