package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.anon.PanGestureHandlerPropsPar
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersPanGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler", "PanGestureHandler")
  @js.native
  val PanGestureHandler: ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]] = js.native
  type PanGestureHandler = ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]
  
  inline def managePanProps(props: PanGestureHandlerProps_): PanGestureHandlerPropsPar = ^.asInstanceOf[js.Dynamic].applyDynamic("managePanProps")(props.asInstanceOf[js.Any]).asInstanceOf[PanGestureHandlerPropsPar]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler", "panGestureHandlerCustomNativeProps")
  @js.native
  val panGestureHandlerCustomNativeProps: js.Tuple8[
    "activeOffsetYStart", 
    "activeOffsetYEnd", 
    "activeOffsetXStart", 
    "activeOffsetXEnd", 
    "failOffsetYStart", 
    "failOffsetYEnd", 
    "failOffsetXStart", 
    "failOffsetXEnd"
  ] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler", "panGestureHandlerProps")
  @js.native
  val panGestureHandlerProps: js.Tuple13[
    "activeOffsetY", 
    "activeOffsetX", 
    "failOffsetY", 
    "failOffsetX", 
    "minDist", 
    "minVelocity", 
    "minVelocityX", 
    "minVelocityY", 
    "minPointers", 
    "maxPointers", 
    "avgTouches", 
    "enableTrackpadTwoFingerGesture", 
    "activateAfterLongPress"
  ] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler", "panHandlerName")
  @js.native
  val panHandlerName: /* "PanGestureHandler" */ String = js.native
  
  trait CommonPanProperties extends StObject {
    
    var activateAfterLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Android only.
      */
    var avgTouches: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables two-finger gestures on supported devices, for example iPads with
      * trackpads. If not enabled the gesture will require click + drag, with
      * enableTrackpadTwoFingerGesture swiping with two fingers will also trigger
      * the gesture.
      */
    var enableTrackpadTwoFingerGesture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the given number of fingers is placed on the screen and handler hasn't
      * yet activated it will fail recognizing the gesture. Should be a higher or
      * equal to 0 integer.
      */
    var maxPointers: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum distance the finger (or multiple finger) need to travel before the
      * handler activates. Expressed in points.
      */
    var minDist: js.UndefOr[Double] = js.undefined
    
    /**
      * A number of fingers that is required to be placed before handler can
      * activate. Should be a higher or equal to 0 integer.
      */
    var minPointers: js.UndefOr[Double] = js.undefined
    
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    var minVelocityX: js.UndefOr[Double] = js.undefined
    
    var minVelocityY: js.UndefOr[Double] = js.undefined
  }
  object CommonPanProperties {
    
    inline def apply(): CommonPanProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPanProperties]
    }
    
    extension [Self <: CommonPanProperties](x: Self) {
      
      inline def setActivateAfterLongPress(value: Double): Self = StObject.set(x, "activateAfterLongPress", value.asInstanceOf[js.Any])
      
      inline def setActivateAfterLongPressUndefined: Self = StObject.set(x, "activateAfterLongPress", js.undefined)
      
      inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
      
      inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
      
      inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
      
      inline def setEnableTrackpadTwoFingerGestureUndefined: Self = StObject.set(x, "enableTrackpadTwoFingerGesture", js.undefined)
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
      
      inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    }
  }
  
  trait PanGestureConfig
    extends StObject
       with CommonPanProperties {
    
    var activeOffsetXEnd: js.UndefOr[Double] = js.undefined
    
    var activeOffsetXStart: js.UndefOr[Double] = js.undefined
    
    var activeOffsetYEnd: js.UndefOr[Double] = js.undefined
    
    var activeOffsetYStart: js.UndefOr[Double] = js.undefined
    
    var failOffsetXEnd: js.UndefOr[Double] = js.undefined
    
    var failOffsetXStart: js.UndefOr[Double] = js.undefined
    
    var failOffsetYEnd: js.UndefOr[Double] = js.undefined
    
    var failOffsetYStart: js.UndefOr[Double] = js.undefined
  }
  object PanGestureConfig {
    
    inline def apply(): PanGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanGestureConfig]
    }
    
    extension [Self <: PanGestureConfig](x: Self) {
      
      inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXEndUndefined: Self = StObject.set(x, "activeOffsetXEnd", js.undefined)
      
      inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXStartUndefined: Self = StObject.set(x, "activeOffsetXStart", js.undefined)
      
      inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYEndUndefined: Self = StObject.set(x, "activeOffsetYEnd", js.undefined)
      
      inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYStartUndefined: Self = StObject.set(x, "activeOffsetYStart", js.undefined)
      
      inline def setFailOffsetXEnd(value: Double): Self = StObject.set(x, "failOffsetXEnd", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXEndUndefined: Self = StObject.set(x, "failOffsetXEnd", js.undefined)
      
      inline def setFailOffsetXStart(value: Double): Self = StObject.set(x, "failOffsetXStart", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXStartUndefined: Self = StObject.set(x, "failOffsetXStart", js.undefined)
      
      inline def setFailOffsetYEnd(value: Double): Self = StObject.set(x, "failOffsetYEnd", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYEndUndefined: Self = StObject.set(x, "failOffsetYEnd", js.undefined)
      
      inline def setFailOffsetYStart(value: Double): Self = StObject.set(x, "failOffsetYStart", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYStartUndefined: Self = StObject.set(x, "failOffsetYStart", js.undefined)
    }
  }
  
  trait PanGestureHandlerEventPayload extends StObject {
    
    /**
      * X coordinate of the current position of the pointer (finger or a leading
      * pointer when there are multiple fingers placed) relative to the window.
      * The value is expressed in point units. It is recommended to use it instead
      * of `x` in cases when the original view can be transformed as an effect of
      * the gesture.
      */
    var absoluteX: Double
    
    /**
      * Y coordinate of the current position of the pointer (finger or a leading
      * pointer when there are multiple fingers placed) relative to the window.
      * The value is expressed in point units. It is recommended to use it instead
      * of `y` in cases when the original view can be transformed as an
      * effect of the gesture.
      */
    var absoluteY: Double
    
    /**
      * Translation of the pan gesture along X axis accumulated over the time of
      * the gesture. The value is expressed in the point units.
      */
    var translationX: Double
    
    /**
      * Translation of the pan gesture along Y axis accumulated over the time of
      * the gesture. The value is expressed in the point units.
      */
    var translationY: Double
    
    /**
      * Velocity of the pan gesture along the X axis in the current moment. The
      * value is expressed in point units per second.
      */
    var velocityX: Double
    
    /**
      * Velocity of the pan gesture along the Y axis in the current moment. The
      * value is expressed in point units per second.
      */
    var velocityY: Double
    
    /**
      * X coordinate of the current position of the pointer (finger or a leading
      * pointer when there are multiple fingers placed) relative to the view
      * attached to the handler. Expressed in point units.
      */
    var x: Double
    
    /**
      * Y coordinate of the current position of the pointer (finger or a leading
      * pointer when there are multiple fingers placed) relative to the view
      * attached to the handler. Expressed in point units.
      */
    var y: Double
  }
  object PanGestureHandlerEventPayload {
    
    inline def apply(
      absoluteX: Double,
      absoluteY: Double,
      translationX: Double,
      translationY: Double,
      velocityX: Double,
      velocityY: Double,
      x: Double,
      y: Double
    ): PanGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanGestureHandlerEventPayload]
    }
    
    extension [Self <: PanGestureHandlerEventPayload](x: Self) {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
      
      inline def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
      
      inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PanGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[PanGestureHandlerEventPayload]
       with CommonPanProperties {
    
    /**
      * Range along X axis (in points) where fingers travels without activation of
      * handler. Moving outside of this range implies activation of handler. Range
      * can be given as an array or a single number. If range is set as an array,
      * first value must be lower or equal to 0, a the second one higher or equal
      * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
      * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
      */
    var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Range along X axis (in points) where fingers travels without activation of
      * handler. Moving outside of this range implies activation of handler. Range
      * can be given as an array or a single number. If range is set as an array,
      * first value must be lower or equal to 0, a the second one higher or equal
      * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
      * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
      */
    var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * When the finger moves outside this range (in points) along X axis and
      * handler hasn't yet activated it will fail recognizing the gesture. Range
      * can be given as an array or a single number. If range is set as an array,
      * first value must be lower or equal to 0, a the second one higher or equal
      * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
      * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
      */
    var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * When the finger moves outside this range (in points) along Y axis and
      * handler hasn't yet activated it will fail recognizing the gesture. Range
      * can be given as an array or a single number. If range is set as an array,
      * first value must be lower or equal to 0, a the second one higher or equal
      * to 0. If only one number `p` is given a range of `(-inf, p)` will be used
      * if `p` is higher or equal to 0 and `(-p, inf)` otherwise.
      */
    var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PanGestureHandlerProps_ {
    
    inline def apply(): PanGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanGestureHandlerProps_]
    }
    
    extension [Self <: PanGestureHandlerProps_](x: Self) {
      
      inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
      
      inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value*))
      
      inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
      
      inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value*))
      
      inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
      
      inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value*))
      
      inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
      
      inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value*))
    }
  }
}
