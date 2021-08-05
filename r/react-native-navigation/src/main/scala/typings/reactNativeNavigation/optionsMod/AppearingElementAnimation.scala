package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppearingElementAnimation
  extends StObject
     with ElementAnimation {
  
  var from: Double
}
object AppearingElementAnimation {
  
  inline def apply(duration: Double, from: Double): AppearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearingElementAnimation]
  }
  
  extension [Self <: AppearingElementAnimation](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
