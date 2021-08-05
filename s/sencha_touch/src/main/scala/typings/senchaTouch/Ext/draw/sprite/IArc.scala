package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArc
  extends StObject
     with ICircle {
  
  /** [Config Option] (Boolean) */
  var anticlockwise: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object IArc {
  
  inline def apply(): IArc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArc]
  }
  
  extension [Self <: IArc](x: Self) {
    
    inline def setAnticlockwise(value: Boolean): Self = StObject.set(x, "anticlockwise", value.asInstanceOf[js.Any])
    
    inline def setAnticlockwiseUndefined: Self = StObject.set(x, "anticlockwise", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
