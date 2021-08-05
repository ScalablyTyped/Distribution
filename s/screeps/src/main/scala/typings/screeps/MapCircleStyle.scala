package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapCircleStyle
  extends StObject
     with MapPolyStyle {
  
  /**
    * Circle radius, default is 10.
    */
  var radius: js.UndefOr[Double] = js.undefined
}
object MapCircleStyle {
  
  inline def apply(): MapCircleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCircleStyle]
  }
  
  extension [Self <: MapCircleStyle](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
