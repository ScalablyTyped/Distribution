package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with TextSpecificProps {
  
  var dx: js.UndefOr[NumberArrayProp] = js.undefined
  
  var dy: js.UndefOr[NumberArrayProp] = js.undefined
}
object TextProps {
  
  inline def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  extension [Self <: TextProps](x: Self) {
    
    inline def setDx(value: NumberArrayProp): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value :_*))
    
    inline def setDy(value: NumberArrayProp): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value :_*))
  }
}
