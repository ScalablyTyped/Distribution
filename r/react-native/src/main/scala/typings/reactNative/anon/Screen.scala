package typings.reactNative.anon

import typings.reactNative.mod.ScaledSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  var screen: ScaledSize
  
  var window: ScaledSize
}
object Screen {
  
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreen(value: ScaledSize): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: ScaledSize): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
