package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flex extends StObject {
  
  var flex: Double
  
  var width: Double
}
object Flex {
  
  inline def apply(flex: Double, width: Double): Flex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
  
  extension [Self <: Flex](x: Self) {
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
