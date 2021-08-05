package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForeignObjectProps extends StObject {
  
  var height: js.UndefOr[NumberProp] = js.undefined
  
  var width: js.UndefOr[NumberProp] = js.undefined
  
  var x: js.UndefOr[NumberProp] = js.undefined
  
  var y: js.UndefOr[NumberProp] = js.undefined
}
object ForeignObjectProps {
  
  inline def apply(): ForeignObjectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeignObjectProps]
  }
  
  extension [Self <: ForeignObjectProps](x: Self) {
    
    inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
