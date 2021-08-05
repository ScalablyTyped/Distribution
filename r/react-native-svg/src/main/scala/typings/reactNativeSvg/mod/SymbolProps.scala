package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolProps extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
}
object SymbolProps {
  
  inline def apply(): SymbolProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolProps]
  }
  
  extension [Self <: SymbolProps](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
