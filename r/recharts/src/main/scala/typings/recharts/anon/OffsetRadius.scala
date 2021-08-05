package typings.recharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetRadius extends StObject {
  
  var offsetRadius: Double
}
object OffsetRadius {
  
  inline def apply(offsetRadius: Double): OffsetRadius = {
    val __obj = js.Dynamic.literal(offsetRadius = offsetRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRadius]
  }
  
  extension [Self <: OffsetRadius](x: Self) {
    
    inline def setOffsetRadius(value: Double): Self = StObject.set(x, "offsetRadius", value.asInstanceOf[js.Any])
  }
}
