package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.absolute
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardMenuStyle extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[absolute | relative] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object CardMenuStyle {
  
  inline def apply(): CardMenuStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMenuStyle]
  }
  
  extension [Self <: CardMenuStyle](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
