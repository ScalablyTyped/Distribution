package typings.reactNavigationStack.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureEnabled extends StObject {
  
  var gestureEnabled: Boolean = js.native
  
  var gestureVelocityImpact: Double = js.native
  
  def overlay(hasStyle: StyleWithAnimatedValue): Element | Null = js.native
  
  var overlayEnabled: Boolean = js.native
  
  var shadowEnabled: Boolean = js.native
}
object GestureEnabled {
  
  @scala.inline
  def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlay: StyleWithAnimatedValue => Element | Null,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): GestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEnabled]
  }
  
  @scala.inline
  implicit class GestureEnabledMutableBuilder[Self <: GestureEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: StyleWithAnimatedValue => Element | Null): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlayEnabled(value: Boolean): Self = StObject.set(x, "overlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
  }
}
