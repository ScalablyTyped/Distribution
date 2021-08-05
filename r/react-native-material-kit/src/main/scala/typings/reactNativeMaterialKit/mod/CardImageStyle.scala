package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardImageStyle extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var resizeMode: js.UndefOr[String] = js.undefined
}
object CardImageStyle {
  
  inline def apply(): CardImageStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardImageStyle]
  }
  
  extension [Self <: CardImageStyle](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setResizeMode(value: String): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
  }
}
