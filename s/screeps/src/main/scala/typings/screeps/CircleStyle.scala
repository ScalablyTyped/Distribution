package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleStyle
  extends StObject
     with PolyStyle {
  
  /**
    * Circle radius, default is 0.15.
    */
  var radius: js.UndefOr[Double] = js.undefined
}
object CircleStyle {
  
  inline def apply(): CircleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleStyle] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
