package typings.reactNavigationStack.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureEnabled extends StObject {
  
  var gestureEnabled: Boolean
  
  var gestureVelocityImpact: Double
  
  def overlay(param0: StyleWithAnimatedValue): Element | Null
  
  var overlayEnabled: Boolean
  
  var shadowEnabled: Boolean
}
object GestureEnabled {
  
  inline def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlay: StyleWithAnimatedValue => Element | Null,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): GestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEnabled]
  }
  
  extension [Self <: GestureEnabled](x: Self) {
    
    inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: StyleWithAnimatedValue => Element | Null): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
    
    inline def setOverlayEnabled(value: Boolean): Self = StObject.set(x, "overlayEnabled", value.asInstanceOf[js.Any])
    
    inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
  }
}
