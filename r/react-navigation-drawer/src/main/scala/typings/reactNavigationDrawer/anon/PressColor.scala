package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressColor extends StObject {
  
  var borderless: Boolean
  
  var pressColor: String
}
object PressColor {
  
  inline def apply(borderless: Boolean, pressColor: String): PressColor = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressColor]
  }
  
  extension [Self <: PressColor](x: Self) {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
  }
}
