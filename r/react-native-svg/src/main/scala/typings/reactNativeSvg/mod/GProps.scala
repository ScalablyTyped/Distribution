package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GProps
  extends StObject
     with CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
}
object GProps {
  
  inline def apply(): GProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GProps]
  }
  
  extension [Self <: GProps](x: Self) {
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
