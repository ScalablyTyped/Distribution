package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRect
  extends StObject
     with IPath {
  
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_IRect: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}
object IRect {
  
  inline def apply(): IRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRect]
  }
  
  extension [Self <: IRect](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
