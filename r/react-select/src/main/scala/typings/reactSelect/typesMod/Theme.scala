package typings.reactSelect.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var borderRadius: Double
  
  var colors: Colors
  
  var spacing: ThemeSpacing
}
object Theme {
  
  inline def apply(borderRadius: Double, colors: Colors, spacing: ThemeSpacing): Theme = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: ThemeSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
