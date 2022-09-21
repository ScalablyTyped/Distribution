package typings.reactNativeSwipeGestures

import typings.react.mod.Component
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swipe-gestures", JSImport.Default)
  @js.native
  open class default ()
    extends Component[GestureRecognizerProps, js.Object, Any]
  
  type GestureRecognizer = Component[GestureRecognizerProps, js.Object, Any]
  
  trait GestureRecognizerConfig extends StObject {
    
    /**
      * Absolute offset that shouldn't be breached for swipe to be triggered (dy for horizontal swipe, dx for vertical swipe)
      * @default 80
      */
    var directionalOffsetThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Absolute distance that should be breached for the gesture to not be considered a click (dx or dy properties of gestureState)
      * @default 5
      */
    var gestureIsClickThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Velocity that has to be breached in order for swipe to be triggered (vx and vy properties of gestureState)
      * @default 0.3
      */
    var velocityThreshold: js.UndefOr[Double] = js.undefined
  }
  object GestureRecognizerConfig {
    
    inline def apply(): GestureRecognizerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureRecognizerConfig]
    }
    
    extension [Self <: GestureRecognizerConfig](x: Self) {
      
      inline def setDirectionalOffsetThreshold(value: Double): Self = StObject.set(x, "directionalOffsetThreshold", value.asInstanceOf[js.Any])
      
      inline def setDirectionalOffsetThresholdUndefined: Self = StObject.set(x, "directionalOffsetThreshold", js.undefined)
      
      inline def setGestureIsClickThreshold(value: Double): Self = StObject.set(x, "gestureIsClickThreshold", value.asInstanceOf[js.Any])
      
      inline def setGestureIsClickThresholdUndefined: Self = StObject.set(x, "gestureIsClickThreshold", js.undefined)
      
      inline def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
      
      inline def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
    }
  }
  
  trait GestureRecognizerProps
    extends StObject
       with ViewProps {
    
    var config: js.UndefOr[GestureRecognizerConfig] = js.undefined
    
    var onSwipe: js.UndefOr[
        js.Function2[/* gestureName */ String, /* gestureState */ PanResponderGestureState, Unit]
      ] = js.undefined
    
    var onSwipeDown: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    var onSwipeLeft: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    var onSwipeRight: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    var onSwipeUp: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
  }
  object GestureRecognizerProps {
    
    inline def apply(): GestureRecognizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureRecognizerProps]
    }
    
    extension [Self <: GestureRecognizerProps](x: Self) {
      
      inline def setConfig(value: GestureRecognizerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setOnSwipe(value: (/* gestureName */ String, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction2(value))
      
      inline def setOnSwipeDown(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction1(value))
      
      inline def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
      
      inline def setOnSwipeLeft(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction1(value))
      
      inline def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
      
      inline def setOnSwipeRight(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction1(value))
      
      inline def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
      
      inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      inline def setOnSwipeUp(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction1(value))
      
      inline def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
    }
  }
}
