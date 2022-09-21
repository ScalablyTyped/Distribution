package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISector
  extends StObject
     with IPath {
  
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var margin: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.undefined
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_ISector: js.UndefOr[js.Function2[/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any], Unit]] = js.undefined
}
object ISector {
  
  inline def apply(): ISector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISector]
  }
  
  extension [Self <: ISector](x: Self) {
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
    
    inline def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
    
    inline def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
    
    inline def setUpdatePath(value: (/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
  }
}
