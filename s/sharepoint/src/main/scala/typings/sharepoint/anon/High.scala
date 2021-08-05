package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait High extends StObject {
  
  var High: Double
  
  var Low: Double
}
object High {
  
  inline def apply(High: Double, Low: Double): High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
  
  extension [Self <: High](x: Self) {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    inline def setLow(value: Double): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
  }
}
