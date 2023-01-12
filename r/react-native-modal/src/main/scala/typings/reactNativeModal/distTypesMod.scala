package typings.reactNativeModal

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.NativeTouchEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.Animation
import typings.reactNativeAnimatable.mod.CustomAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait AnimationEvent extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait Animations extends StObject {
    
    var animationIn: String
    
    var animationOut: String
  }
  object Animations {
    
    inline def apply(animationIn: String, animationOut: String): Animations = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animations] (val x: Self) extends AnyVal {
      
      inline def setAnimationIn(value: String): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(value: String): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeModal.reactNativeModalStrings.up
    - typings.reactNativeModal.reactNativeModalStrings.down
    - typings.reactNativeModal.reactNativeModalStrings.left
    - typings.reactNativeModal.reactNativeModalStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typings.reactNativeModal.reactNativeModalStrings.down = "down".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.down]
    
    inline def left: typings.reactNativeModal.reactNativeModalStrings.left = "left".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.left]
    
    inline def right: typings.reactNativeModal.reactNativeModalStrings.right = "right".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.right]
    
    inline def up: typings.reactNativeModal.reactNativeModalStrings.up = "up".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.up]
  }
  
  type GestureResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  
  type OnOrientationChange = js.Function1[/* orientation */ NativeSyntheticEvent[Any], Unit]
  
  type OrNull[T] = Null | T
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeModal.reactNativeModalStrings.portrait
    - typings.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
    - typings.reactNativeModal.reactNativeModalStrings.landscape
    - typings.reactNativeModal.reactNativeModalStrings.`landscape-left`
    - typings.reactNativeModal.reactNativeModalStrings.`landscape-right`
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def landscape: typings.reactNativeModal.reactNativeModalStrings.landscape = "landscape".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.landscape]
    
    inline def `landscape-left`: typings.reactNativeModal.reactNativeModalStrings.`landscape-left` = "landscape-left".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.`landscape-left`]
    
    inline def `landscape-right`: typings.reactNativeModal.reactNativeModalStrings.`landscape-right` = "landscape-right".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.`landscape-right`]
    
    inline def portrait: typings.reactNativeModal.reactNativeModalStrings.portrait = "portrait".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.portrait]
    
    inline def `portrait-upside-down`: typings.reactNativeModal.reactNativeModalStrings.`portrait-upside-down` = "portrait-upside-down".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeModal.reactNativeModalStrings.fullScreen
    - typings.reactNativeModal.reactNativeModalStrings.pageSheet
    - typings.reactNativeModal.reactNativeModalStrings.formSheet
    - typings.reactNativeModal.reactNativeModalStrings.overFullScreen
  */
  trait PresentationStyle extends StObject
  object PresentationStyle {
    
    inline def formSheet: typings.reactNativeModal.reactNativeModalStrings.formSheet = "formSheet".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.formSheet]
    
    inline def fullScreen: typings.reactNativeModal.reactNativeModalStrings.fullScreen = "fullScreen".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.fullScreen]
    
    inline def overFullScreen: typings.reactNativeModal.reactNativeModalStrings.overFullScreen = "overFullScreen".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.overFullScreen]
    
    inline def pageSheet: typings.reactNativeModal.reactNativeModalStrings.pageSheet = "pageSheet".asInstanceOf[typings.reactNativeModal.reactNativeModalStrings.pageSheet]
  }
  
  type SupportedAnimation = Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])
}
