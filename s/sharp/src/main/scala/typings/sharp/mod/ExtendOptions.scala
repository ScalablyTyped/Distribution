package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendOptions extends StObject {
  
  /** background colour, parsed by the color module, defaults to black without transparency. (optional, default {r:0,g:0,b:0,alpha:1}) */
  var background: js.UndefOr[Color] = js.undefined
  
  /** single pixel count to bottom edge (optional, default 0) */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /** how the extension is done, one of: "background", "copy", "repeat", "mirror" (optional, default `'background'`) */
  var extendWith: js.UndefOr[ExtendWith] = js.undefined
  
  /** single pixel count to left edge (optional, default 0) */
  var left: js.UndefOr[Double] = js.undefined
  
  /** single pixel count to right edge (optional, default 0) */
  var right: js.UndefOr[Double] = js.undefined
  
  /** single pixel count to top edge (optional, default 0) */
  var top: js.UndefOr[Double] = js.undefined
}
object ExtendOptions {
  
  inline def apply(): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setExtendWith(value: ExtendWith): Self = StObject.set(x, "extendWith", value.asInstanceOf[js.Any])
    
    inline def setExtendWithUndefined: Self = StObject.set(x, "extendWith", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
