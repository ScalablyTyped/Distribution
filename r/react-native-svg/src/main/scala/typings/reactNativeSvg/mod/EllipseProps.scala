package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipseProps
  extends StObject
     with CommonPathProps {
  
  var cx: js.UndefOr[NumberProp] = js.undefined
  
  var cy: js.UndefOr[NumberProp] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var rx: js.UndefOr[NumberProp] = js.undefined
  
  var ry: js.UndefOr[NumberProp] = js.undefined
}
object EllipseProps {
  
  inline def apply(): EllipseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseProps]
  }
  
  extension [Self <: EllipseProps](x: Self) {
    
    inline def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}
