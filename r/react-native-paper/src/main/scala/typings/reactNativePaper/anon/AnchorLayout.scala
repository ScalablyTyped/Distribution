package typings.reactNativePaper.anon

import typings.reactNative.mod.Animated.ValueXY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorLayout extends StObject {
  
  var anchorLayout: Height
  
  var left: Double
  
  var menuLayout: Height
  
  var opacityAnimation: typings.reactNative.mod.Animated.Value
  
  var rendered: Boolean
  
  var scaleAnimation: ValueXY
  
  var top: Double
}
object AnchorLayout {
  
  inline def apply(
    anchorLayout: Height,
    left: Double,
    menuLayout: Height,
    opacityAnimation: typings.reactNative.mod.Animated.Value,
    rendered: Boolean,
    scaleAnimation: ValueXY,
    top: Double
  ): AnchorLayout = {
    val __obj = js.Dynamic.literal(anchorLayout = anchorLayout.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], menuLayout = menuLayout.asInstanceOf[js.Any], opacityAnimation = opacityAnimation.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaleAnimation = scaleAnimation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnchorLayout] (val x: Self) extends AnyVal {
    
    inline def setAnchorLayout(value: Height): Self = StObject.set(x, "anchorLayout", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMenuLayout(value: Height): Self = StObject.set(x, "menuLayout", value.asInstanceOf[js.Any])
    
    inline def setOpacityAnimation(value: typings.reactNative.mod.Animated.Value): Self = StObject.set(x, "opacityAnimation", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setScaleAnimation(value: ValueXY): Self = StObject.set(x, "scaleAnimation", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
