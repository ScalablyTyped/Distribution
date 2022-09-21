package typings.recharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeDasharray extends StObject {
  
  var strokeDasharray: String
}
object StrokeDasharray {
  
  inline def apply(strokeDasharray: String): StrokeDasharray = {
    val __obj = js.Dynamic.literal(strokeDasharray = strokeDasharray.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeDasharray]
  }
  
  extension [Self <: StrokeDasharray](x: Self) {
    
    inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
  }
}
