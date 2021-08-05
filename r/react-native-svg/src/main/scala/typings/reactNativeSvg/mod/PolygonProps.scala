package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonProps
  extends StObject
     with CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var points: js.UndefOr[String | js.Array[NumberProp]] = js.undefined
}
object PolygonProps {
  
  inline def apply(): PolygonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonProps]
  }
  
  extension [Self <: PolygonProps](x: Self) {
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPoints(value: String | js.Array[NumberProp]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: NumberProp*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
