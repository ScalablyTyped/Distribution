package typings.storybookTheming.mod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography_ extends StObject {
  
  var fonts: Base
  
  var size: Code
  
  var weight: Black
}
object Typography_ {
  
  inline def apply(fonts: Base, size: Code, weight: Black): Typography_ = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography_]
  }
  
  extension [Self <: Typography_](x: Self) {
    
    inline def setFonts(value: Base): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Code): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Black): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
