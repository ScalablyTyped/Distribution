package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressableStateCallbackType extends StObject {
  
  val pressed: Boolean
}
object PressableStateCallbackType {
  
  inline def apply(pressed: Boolean): PressableStateCallbackType = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressableStateCallbackType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressableStateCallbackType] (val x: Self) extends AnyVal {
    
    inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
