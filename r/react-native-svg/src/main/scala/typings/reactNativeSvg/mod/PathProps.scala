package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProps
  extends StObject
     with CommonPathProps {
  
  var d: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
}
object PathProps {
  
  inline def apply(): PathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathProps]
  }
  
  extension [Self <: PathProps](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
