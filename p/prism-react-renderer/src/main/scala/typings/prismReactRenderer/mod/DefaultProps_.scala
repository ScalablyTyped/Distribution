package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProps_ extends StObject {
  
  var Prism: PrismLib
  
  var theme: PrismTheme
}
object DefaultProps_ {
  
  @scala.inline
  def apply(Prism: PrismLib, theme: PrismTheme): DefaultProps_ = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps_]
  }
  
  @scala.inline
  implicit class DefaultProps_MutableBuilder[Self <: DefaultProps_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrism(value: PrismLib): Self = StObject.set(x, "Prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
