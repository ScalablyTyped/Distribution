package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProps_ extends StObject {
  
  var Prism: PrismLib
  
  var theme: PrismTheme
}
object DefaultProps_ {
  
  inline def apply(Prism: PrismLib, theme: PrismTheme): DefaultProps_ = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps_]
  }
  
  extension [Self <: DefaultProps_](x: Self) {
    
    inline def setPrism(value: PrismLib): Self = StObject.set(x, "Prism", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
