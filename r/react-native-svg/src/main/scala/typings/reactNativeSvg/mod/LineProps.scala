package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineProps
  extends StObject
     with CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var x1: js.UndefOr[NumberProp] = js.undefined
  
  var x2: js.UndefOr[NumberProp] = js.undefined
  
  var y1: js.UndefOr[NumberProp] = js.undefined
  
  var y2: js.UndefOr[NumberProp] = js.undefined
}
object LineProps {
  
  inline def apply(): LineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProps]
  }
  
  extension [Self <: LineProps](x: Self) {
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
