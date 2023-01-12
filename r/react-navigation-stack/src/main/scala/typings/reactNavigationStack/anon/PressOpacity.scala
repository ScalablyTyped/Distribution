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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressOpacity] (val x: Self) extends AnyVal {
    
    inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
  }
}
