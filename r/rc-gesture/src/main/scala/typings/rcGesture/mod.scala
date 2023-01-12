package typings.rcGesture

import typings.rcGesture.anon.AvailablePan
import typings.rcGesture.anon.Direction
import typings.rcGesture.rcGestureStrings.`pan-x pan-y`
import typings.rcGesture.rcGestureStrings.`pan-x`
import typings.rcGesture.rcGestureStrings.`pan-y`
import typings.rcGesture.rcGestureStrings.all
import typings.rcGesture.rcGestureStrings.auto
import typings.rcGesture.rcGestureStrings.horizontal
import typings.rcGesture.rcGestureStrings.vertical
import typings.react.mod.Component
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  open class default protected () extends Gesture {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-gesture", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-gesture", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    inline def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Finger extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Finger {
    
    inline def apply(x: Double, y: Double): Finger = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Finger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Finger] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Gesture extends Component[IGesture, Any, Any] {
    
    def _handleTouchCancel(e: Any): Unit = js.native
    
    def _handleTouchEnd(e: Any): Unit = js.native
    
    def _handleTouchMove(e: Any): Unit = js.native
    
    def _handleTouchStart(e: Any): Unit = js.native
    
    def allowGesture(): Boolean = js.native
    
    def checkIfMultiTouchEnd(status: Any): Unit = js.native
    
    def checkIfMultiTouchMove(): Unit = js.native
    
    def checkIfMultiTouchStart(): Unit = js.native
    
    def checkIfSingleTouchMove(): Unit = js.native
    
    def cleanGestureState(): Unit = js.native
    
    def cleanPressTimer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGesture(): Unit = js.native
    
    /* private */ var directionSetting: Any = js.native
    
    def doSingleTouchEnd(status: Any): Unit = js.native
    
    /* protected */ var event: Any = js.native
    
    /* protected */ var gesture: IGestureStatus = js.native
    
    def getGestureState(): AvailablePan = js.native
    
    def getTouchAction(): auto | (`pan-x pan-y`) | `pan-x` | `pan-y` = js.native
    
    def getTouches(e: Any): Any = js.native
    
    def initGestureStatus(e: Any): Unit = js.native
    
    def initPressTimer(): Unit = js.native
    
    /* private */ var pressTimer: Any = js.native
    
    def setGestureState(params: Any): Unit = js.native
    
    def triggerAllowEvent(`type`: Any, status: Any): Unit = js.native
    
    def triggerCombineEvent(mainEventName: Any, eventStatus: Any, args: Any*): Unit = js.native
    
    def triggerEvent(name: Any, args: Any*): Unit = js.native
    
    def triggerPinchEvent(mainEventName: Any, eventStatus: Any, args: Any*): Unit = js.native
    
    def triggerSubEvent(mainEventName: Any, eventStatus: Any, args: Any*): Unit = js.native
    
    def triggerUserCb(status: Any, e: Any): Unit = js.native
    
    def updateGestureStatus(e: Any): Unit = js.native
  }
  
  type GestureHandler = js.Function1[/* s */ IGestureStatus, Unit]
  
  trait IGesture extends StObject {
    
    var direction: js.UndefOr[all | vertical | horizontal] = js.undefined
    
    var enablePinch: js.UndefOr[Boolean] = js.undefined
    
    var enableRotate: js.UndefOr[Boolean] = js.undefined
    
    var onPan: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanCancel: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanDown: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanEnd: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanLeft: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanMove: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanRight: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanStart: js.UndefOr[GestureHandler] = js.undefined
    
    var onPanUp: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinch: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchCancel: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchEnd: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchIn: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchMove: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchOut: js.UndefOr[GestureHandler] = js.undefined
    
    var onPinchStart: js.UndefOr[GestureHandler] = js.undefined
    
    var onPress: js.UndefOr[GestureHandler] = js.undefined
    
    var onPressUp: js.UndefOr[GestureHandler] = js.undefined
    
    var onRotate: js.UndefOr[GestureHandler] = js.undefined
    
    var onRotateCancel: js.UndefOr[GestureHandler] = js.undefined
    
    var onRotateEnd: js.UndefOr[GestureHandler] = js.undefined
    
    var onRotateMove: js.UndefOr[GestureHandler] = js.undefined
    
    var onRotateStart: js.UndefOr[GestureHandler] = js.undefined
    
    var onSwipe: js.UndefOr[GestureHandler] = js.undefined
    
    var onSwipeDown: js.UndefOr[GestureHandler] = js.undefined
    
    var onSwipeLeft: js.UndefOr[GestureHandler] = js.undefined
    
    var onSwipeRight: js.UndefOr[GestureHandler] = js.undefined
    
    var onSwipeUp: js.UndefOr[GestureHandler] = js.undefined
    
    var onTap: js.UndefOr[GestureHandler] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  }
  object IGesture {
    
    inline def apply(): IGesture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGesture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGesture] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: all | vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnablePinch(value: Boolean): Self = StObject.set(x, "enablePinch", value.asInstanceOf[js.Any])
      
      inline def setEnablePinchUndefined: Self = StObject.set(x, "enablePinch", js.undefined)
      
      inline def setEnableRotate(value: Boolean): Self = StObject.set(x, "enableRotate", value.asInstanceOf[js.Any])
      
      inline def setEnableRotateUndefined: Self = StObject.set(x, "enableRotate", js.undefined)
      
      inline def setOnPan(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      inline def setOnPanCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanCancel", js.Any.fromFunction1(value))
      
      inline def setOnPanCancelUndefined: Self = StObject.set(x, "onPanCancel", js.undefined)
      
      inline def setOnPanDown(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanDown", js.Any.fromFunction1(value))
      
      inline def setOnPanDownUndefined: Self = StObject.set(x, "onPanDown", js.undefined)
      
      inline def setOnPanEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction1(value))
      
      inline def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
      
      inline def setOnPanLeft(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanLeft", js.Any.fromFunction1(value))
      
      inline def setOnPanLeftUndefined: Self = StObject.set(x, "onPanLeft", js.undefined)
      
      inline def setOnPanMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanMove", js.Any.fromFunction1(value))
      
      inline def setOnPanMoveUndefined: Self = StObject.set(x, "onPanMove", js.undefined)
      
      inline def setOnPanRight(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanRight", js.Any.fromFunction1(value))
      
      inline def setOnPanRightUndefined: Self = StObject.set(x, "onPanRight", js.undefined)
      
      inline def setOnPanStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction1(value))
      
      inline def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
      
      inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      inline def setOnPanUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanUp", js.Any.fromFunction1(value))
      
      inline def setOnPanUpUndefined: Self = StObject.set(x, "onPanUp", js.undefined)
      
      inline def setOnPinch(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinch", js.Any.fromFunction1(value))
      
      inline def setOnPinchCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchCancel", js.Any.fromFunction1(value))
      
      inline def setOnPinchCancelUndefined: Self = StObject.set(x, "onPinchCancel", js.undefined)
      
      inline def setOnPinchEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchEnd", js.Any.fromFunction1(value))
      
      inline def setOnPinchEndUndefined: Self = StObject.set(x, "onPinchEnd", js.undefined)
      
      inline def setOnPinchIn(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchIn", js.Any.fromFunction1(value))
      
      inline def setOnPinchInUndefined: Self = StObject.set(x, "onPinchIn", js.undefined)
      
      inline def setOnPinchMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchMove", js.Any.fromFunction1(value))
      
      inline def setOnPinchMoveUndefined: Self = StObject.set(x, "onPinchMove", js.undefined)
      
      inline def setOnPinchOut(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchOut", js.Any.fromFunction1(value))
      
      inline def setOnPinchOutUndefined: Self = StObject.set(x, "onPinchOut", js.undefined)
      
      inline def setOnPinchStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchStart", js.Any.fromFunction1(value))
      
      inline def setOnPinchStartUndefined: Self = StObject.set(x, "onPinchStart", js.undefined)
      
      inline def setOnPinchUndefined: Self = StObject.set(x, "onPinch", js.undefined)
      
      inline def setOnPress(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnPressUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPressUp", js.Any.fromFunction1(value))
      
      inline def setOnPressUpUndefined: Self = StObject.set(x, "onPressUp", js.undefined)
      
      inline def setOnRotate(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotate", js.Any.fromFunction1(value))
      
      inline def setOnRotateCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateCancel", js.Any.fromFunction1(value))
      
      inline def setOnRotateCancelUndefined: Self = StObject.set(x, "onRotateCancel", js.undefined)
      
      inline def setOnRotateEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateEnd", js.Any.fromFunction1(value))
      
      inline def setOnRotateEndUndefined: Self = StObject.set(x, "onRotateEnd", js.undefined)
      
      inline def setOnRotateMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateMove", js.Any.fromFunction1(value))
      
      inline def setOnRotateMoveUndefined: Self = StObject.set(x, "onRotateMove", js.undefined)
      
      inline def setOnRotateStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateStart", js.Any.fromFunction1(value))
      
      inline def setOnRotateStartUndefined: Self = StObject.set(x, "onRotateStart", js.undefined)
      
      inline def setOnRotateUndefined: Self = StObject.set(x, "onRotate", js.undefined)
      
      inline def setOnSwipe(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      inline def setOnSwipeDown(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction1(value))
      
      inline def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
      
      inline def setOnSwipeLeft(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction1(value))
      
      inline def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
      
      inline def setOnSwipeRight(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction1(value))
      
      inline def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
      
      inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      inline def setOnSwipeUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction1(value))
      
      inline def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
      
      inline def setOnTap(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  trait IGestureStatus extends StObject {
    
    var availablePan: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[Double] = js.undefined
    
    var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.undefined
    
    var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
    
    var pan: js.UndefOr[Boolean] = js.undefined
    
    var pinch: js.UndefOr[Boolean] = js.undefined
    
    var preTouches: js.Array[Finger]
    
    var press: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var srcEvent: Any
    
    var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
    
    var startTime: Double
    
    var startTouches: js.Array[Finger]
    
    var swipe: js.UndefOr[Boolean] = js.undefined
    
    var time: Double
    
    var touches: js.Array[Finger]
  }
  object IGestureStatus {
    
    inline def apply(
      preTouches: js.Array[Finger],
      srcEvent: Any,
      startTime: Double,
      startTouches: js.Array[Finger],
      time: Double,
      touches: js.Array[Finger]
    ): IGestureStatus = {
      val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGestureStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGestureStatus] (val x: Self) extends AnyVal {
      
      inline def setAvailablePan(value: Boolean): Self = StObject.set(x, "availablePan", value.asInstanceOf[js.Any])
      
      inline def setAvailablePanUndefined: Self = StObject.set(x, "availablePan", js.undefined)
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMoveStatus(value: SingeFingerMoveStatus): Self = StObject.set(x, "moveStatus", value.asInstanceOf[js.Any])
      
      inline def setMoveStatusUndefined: Self = StObject.set(x, "moveStatus", js.undefined)
      
      inline def setMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "mutliFingerStatus", value.asInstanceOf[js.Any])
      
      inline def setMutliFingerStatusUndefined: Self = StObject.set(x, "mutliFingerStatus", js.undefined)
      
      inline def setMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "mutliFingerStatus", js.Array(value*))
      
      inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setPinch(value: Boolean): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      inline def setPreTouches(value: js.Array[Finger]): Self = StObject.set(x, "preTouches", value.asInstanceOf[js.Any])
      
      inline def setPreTouchesVarargs(value: Finger*): Self = StObject.set(x, "preTouches", js.Array(value*))
      
      inline def setPress(value: Boolean): Self = StObject.set(x, "press", value.asInstanceOf[js.Any])
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSrcEvent(value: Any): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
      
      inline def setStartMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "startMutliFingerStatus", value.asInstanceOf[js.Any])
      
      inline def setStartMutliFingerStatusUndefined: Self = StObject.set(x, "startMutliFingerStatus", js.undefined)
      
      inline def setStartMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "startMutliFingerStatus", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTouches(value: js.Array[Finger]): Self = StObject.set(x, "startTouches", value.asInstanceOf[js.Any])
      
      inline def setStartTouchesVarargs(value: Finger*): Self = StObject.set(x, "startTouches", js.Array(value*))
      
      inline def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTouches(value: js.Array[Finger]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setTouchesVarargs(value: Finger*): Self = StObject.set(x, "touches", js.Array(value*))
    }
  }
  
  trait MultiFingerStatus extends StObject {
    
    var angle: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object MultiFingerStatus {
    
    inline def apply(angle: Double, x: Double, y: Double, z: Double): MultiFingerStatus = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiFingerStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiFingerStatus] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingeFingerMoveStatus extends StObject {
    
    var angle: Double
    
    var time: Double
    
    var velocity: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object SingeFingerMoveStatus {
    
    inline def apply(angle: Double, time: Double, velocity: Double, x: Double, y: Double, z: Double): SingeFingerMoveStatus = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingeFingerMoveStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingeFingerMoveStatus] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
