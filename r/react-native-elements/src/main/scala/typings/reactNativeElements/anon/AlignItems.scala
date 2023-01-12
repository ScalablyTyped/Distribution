package typings.reactNativeElements.anon

import typings.reactNativeElements.reactNativeElementsStrings.center
import typings.reactNativeElements.reactNativeElementsStrings.column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  var alignItems: center
  
  var flexDirection: column
  
  var width: Double
}
object AlignItems {
  
  inline def apply(width: Double): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = "center", flexDirection = "column", width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItems] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: column): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
