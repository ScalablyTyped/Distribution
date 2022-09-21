package typings.reactNativeElements.anon

import typings.reactNativeElements.reactNativeElementsStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var justifyContent: center
}
object Height {
  
  inline def apply(height: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], justifyContent = "center")
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
