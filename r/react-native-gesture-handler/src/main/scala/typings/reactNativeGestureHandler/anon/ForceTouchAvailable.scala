package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTouchAvailable extends StObject {
  
  var forceTouchAvailable: Boolean
}
object ForceTouchAvailable {
  
  inline def apply(forceTouchAvailable: Boolean): ForceTouchAvailable = {
    val __obj = js.Dynamic.literal(forceTouchAvailable = forceTouchAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchAvailable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceTouchAvailable] (val x: Self) extends AnyVal {
    
    inline def setForceTouchAvailable(value: Boolean): Self = StObject.set(x, "forceTouchAvailable", value.asInstanceOf[js.Any])
  }
}
