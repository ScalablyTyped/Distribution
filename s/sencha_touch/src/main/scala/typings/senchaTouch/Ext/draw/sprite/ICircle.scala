package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICircle
  extends StObject
     with IPath {
  
  /** [Config Option] (Number) */
  var cx: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var cy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var r: js.UndefOr[Double] = js.undefined
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_ICircle: js.UndefOr[js.Function2[/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any], Unit]] = js.undefined
}
object ICircle {
  
  inline def apply(): ICircle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircle]
  }
  
  extension [Self <: ICircle](x: Self) {
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setUpdatePath(value: (/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
  }
}
