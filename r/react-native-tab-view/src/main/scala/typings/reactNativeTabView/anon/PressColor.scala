package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressColor extends StObject {
  
  var pressColor: String
}
object PressColor {
  
  inline def apply(pressColor: String): PressColor = {
    val __obj = js.Dynamic.literal(pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressColor]
  }
  
  extension [Self <: PressColor](x: Self) {
    
    inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
  }
}
