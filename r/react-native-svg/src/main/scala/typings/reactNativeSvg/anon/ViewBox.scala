package typings.reactNativeSvg.anon

import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBox extends StObject {
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var viewBox: js.UndefOr[String | js.Array[NumberProp]] = js.undefined
}
object ViewBox {
  
  inline def apply(): ViewBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBox]
  }
  
  extension [Self <: ViewBox](x: Self) {
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setViewBox(value: String | js.Array[NumberProp]): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setViewBoxVarargs(value: NumberProp*): Self = StObject.set(x, "viewBox", js.Array(value*))
  }
}
