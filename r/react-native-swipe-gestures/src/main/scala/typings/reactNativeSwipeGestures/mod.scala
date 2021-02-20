package typings.reactNativeSwipeGestures

import typings.react.mod.Component
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swipe-gestures", JSImport.Default)
  @js.native
  class default ()
    extends Component[GestureRecognizerProps, js.Object, js.Any]
  
  type GestureRecognizer = Component[GestureRecognizerProps, js.Object, js.Any]
  
  @js.native
  trait GestureRecognizerConfig extends StObject {
    
    /**
      * Absolute offset that shouldn't be breached for swipe to be triggered (dy for horizontal swipe, dx for vertical swipe)
      * @default 80
      */
    var directionalOffsetThreshold: js.UndefOr[Double] = js.native
    
    /**
      * Absolute distance that should be breached for the gesture to not be considered a click (dx or dy properties of gestureState)
      * @default 5
      */
    var gestureIsClickThreshold: js.UndefOr[Double] = js.native
    
    /**
      * Velocity that has to be breached in order for swipe to be triggered (vx and vy properties of gestureState)
      * @default 0.3
      */
    var velocityThreshold: js.UndefOr[Double] = js.native
  }
  object GestureRecognizerConfig {
    
    @scala.inline
    def apply(): GestureRecognizerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureRecognizerConfig]
    }
    
    @scala.inline
    implicit class GestureRecognizerConfigMutableBuilder[Self <: GestureRecognizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectionalOffsetThreshold(value: Double): Self = StObject.set(x, "directionalOffsetThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalOffsetThresholdUndefined: Self = StObject.set(x, "directionalOffsetThreshold", js.undefined)
      
      @scala.inline
      def setGestureIsClickThreshold(value: Double): Self = StObject.set(x, "gestureIsClickThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureIsClickThresholdUndefined: Self = StObject.set(x, "gestureIsClickThreshold", js.undefined)
      
      @scala.inline
      def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
    }
  }
  
  @js.native
  trait GestureRecognizerProps extends ViewProps {
    
    var config: js.UndefOr[GestureRecognizerConfig] = js.native
    
    var onSwipe: js.UndefOr[
        js.Function2[/* gestureName */ String, /* gestureState */ PanResponderGestureState, Unit]
      ] = js.native
    
    var onSwipeDown: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
    
    var onSwipeLeft: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
    
    var onSwipeRight: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
    
    var onSwipeUp: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  }
  object GestureRecognizerProps {
    
    @scala.inline
    def apply(): GestureRecognizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureRecognizerProps]
    }
    
    @scala.inline
    implicit class GestureRecognizerPropsMutableBuilder[Self <: GestureRecognizerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: GestureRecognizerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setOnSwipe(value: (/* gestureName */ String, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwipeDown(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
      
      @scala.inline
      def setOnSwipeLeft(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
      
      @scala.inline
      def setOnSwipeRight(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
      
      @scala.inline
      def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      @scala.inline
      def setOnSwipeUp(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
    }
  }
}
