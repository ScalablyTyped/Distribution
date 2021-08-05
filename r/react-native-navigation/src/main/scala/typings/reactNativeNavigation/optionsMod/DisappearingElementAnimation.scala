package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisappearingElementAnimation
  extends StObject
     with ElementAnimation {
  
  var to: Double
}
object DisappearingElementAnimation {
  
  inline def apply(duration: Double, to: Double): DisappearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisappearingElementAnimation]
  }
  
  extension [Self <: DisappearingElementAnimation](x: Self) {
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
