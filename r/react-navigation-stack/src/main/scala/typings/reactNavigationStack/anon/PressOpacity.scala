package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressOpacity extends StObject {
  
  var pressOpacity: Double
}
object PressOpacity {
  
  inline def apply(pressOpacity: Double): PressOpacity = {
    val __obj = js.Dynamic.literal(pressOpacity = pressOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressOpacity]
  }
  
  extension [Self <: PressOpacity](x: Self) {
    
    inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
  }
}
