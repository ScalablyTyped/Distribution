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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  class default protected () extends Gesture {
    def this(props: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-gesture", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-gesture", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    @scala.inline
    def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Finger extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Finger {
    
    @scala.inline
    def apply(x: Double, y: Double): Finger = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Finger]
    }
    
    @scala.inline
    implicit class FingerMutableBuilder[Self <: Finger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Gesture
    extends Component[IGesture, js.Any, js.Any] {
    
    def _handleTouchCancel(e: js.Any): Unit = js.native
    
    def _handleTouchEnd(e: js.Any): Unit = js.native
    
    def _handleTouchMove(e: js.Any): Unit = js.native
    
    def _handleTouchStart(e: js.Any): Unit = js.native
    
    def allowGesture(): Boolean = js.native
    
    def checkIfMultiTouchEnd(status: js.Any): Unit = js.native
    
    def checkIfMultiTouchMove(): Unit = js.native
    
    def checkIfMultiTouchStart(): Unit = js.native
    
    def checkIfSingleTouchMove(): Unit = js.native
    
    def cleanGestureState(): Unit = js.native
    
    def cleanPressTimer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGesture(): Unit = js.native
    
    var directionSetting: js.Any = js.native
    
    def doSingleTouchEnd(status: js.Any): Unit = js.native
    
    var event: js.Any = js.native
    
    var gesture: IGestureStatus = js.native
    
    def getGestureState(): AvailablePan = js.native
    
    def getTouchAction(): auto | (`pan-x pan-y`) | `pan-x` | `pan-y` = js.native
    
    def getTouches(e: js.Any): js.Any = js.native
    
    def initGestureStatus(e: js.Any): Unit = js.native
    
    def initPressTimer(): Unit = js.native
    
    var pressTimer: js.Any = js.native
    
    def setGestureState(params: js.Any): Unit = js.native
    
    def triggerAllowEvent(`type`: js.Any, status: js.Any): Unit = js.native
    
    def triggerCombineEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
    
    def triggerEvent(name: js.Any, args: js.Any*): Unit = js.native
    
    def triggerPinchEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
    
    def triggerSubEvent(mainEventName: js.Any, eventStatus: js.Any, args: js.Any*): Unit = js.native
    
    def triggerUserCb(status: js.Any, e: js.Any): Unit = js.native
    
    def updateGestureStatus(e: js.Any): Unit = js.native
  }
  
  type GestureHandler = js.Function1[/* s */ IGestureStatus, Unit]
  
  @js.native
  trait IGesture extends StObject {
    
    var direction: js.UndefOr[all | vertical | horizontal] = js.native
    
    var enablePinch: js.UndefOr[Boolean] = js.native
    
    var enableRotate: js.UndefOr[Boolean] = js.native
    
    var onPan: js.UndefOr[GestureHandler] = js.native
    
    var onPanCancel: js.UndefOr[GestureHandler] = js.native
    
    var onPanDown: js.UndefOr[GestureHandler] = js.native
    
    var onPanEnd: js.UndefOr[GestureHandler] = js.native
    
    var onPanLeft: js.UndefOr[GestureHandler] = js.native
    
    var onPanMove: js.UndefOr[GestureHandler] = js.native
    
    var onPanRight: js.UndefOr[GestureHandler] = js.native
    
    var onPanStart: js.UndefOr[GestureHandler] = js.native
    
    var onPanUp: js.UndefOr[GestureHandler] = js.native
    
    var onPinch: js.UndefOr[GestureHandler] = js.native
    
    var onPinchCancel: js.UndefOr[GestureHandler] = js.native
    
    var onPinchEnd: js.UndefOr[GestureHandler] = js.native
    
    var onPinchIn: js.UndefOr[GestureHandler] = js.native
    
    var onPinchMove: js.UndefOr[GestureHandler] = js.native
    
    var onPinchOut: js.UndefOr[GestureHandler] = js.native
    
    var onPinchStart: js.UndefOr[GestureHandler] = js.native
    
    var onPress: js.UndefOr[GestureHandler] = js.native
    
    var onPressUp: js.UndefOr[GestureHandler] = js.native
    
    var onRotate: js.UndefOr[GestureHandler] = js.native
    
    var onRotateCancel: js.UndefOr[GestureHandler] = js.native
    
    var onRotateEnd: js.UndefOr[GestureHandler] = js.native
    
    var onRotateMove: js.UndefOr[GestureHandler] = js.native
    
    var onRotateStart: js.UndefOr[GestureHandler] = js.native
    
    var onSwipe: js.UndefOr[GestureHandler] = js.native
    
    var onSwipeDown: js.UndefOr[GestureHandler] = js.native
    
    var onSwipeLeft: js.UndefOr[GestureHandler] = js.native
    
    var onSwipeRight: js.UndefOr[GestureHandler] = js.native
    
    var onSwipeUp: js.UndefOr[GestureHandler] = js.native
    
    var onTap: js.UndefOr[GestureHandler] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  }
  object IGesture {
    
    @scala.inline
    def apply(): IGesture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGesture]
    }
    
    @scala.inline
    implicit class IGestureMutableBuilder[Self <: IGesture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: all | vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnablePinch(value: Boolean): Self = StObject.set(x, "enablePinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePinchUndefined: Self = StObject.set(x, "enablePinch", js.undefined)
      
      @scala.inline
      def setEnableRotate(value: Boolean): Self = StObject.set(x, "enableRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRotateUndefined: Self = StObject.set(x, "enableRotate", js.undefined)
      
      @scala.inline
      def setOnPan(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanCancelUndefined: Self = StObject.set(x, "onPanCancel", js.undefined)
      
      @scala.inline
      def setOnPanDown(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanDownUndefined: Self = StObject.set(x, "onPanDown", js.undefined)
      
      @scala.inline
      def setOnPanEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
      
      @scala.inline
      def setOnPanLeft(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanLeftUndefined: Self = StObject.set(x, "onPanLeft", js.undefined)
      
      @scala.inline
      def setOnPanMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanMoveUndefined: Self = StObject.set(x, "onPanMove", js.undefined)
      
      @scala.inline
      def setOnPanRight(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanRightUndefined: Self = StObject.set(x, "onPanRight", js.undefined)
      
      @scala.inline
      def setOnPanStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
      
      @scala.inline
      def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      @scala.inline
      def setOnPanUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPanUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanUpUndefined: Self = StObject.set(x, "onPanUp", js.undefined)
      
      @scala.inline
      def setOnPinch(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchCancelUndefined: Self = StObject.set(x, "onPinchCancel", js.undefined)
      
      @scala.inline
      def setOnPinchEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchEndUndefined: Self = StObject.set(x, "onPinchEnd", js.undefined)
      
      @scala.inline
      def setOnPinchIn(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchInUndefined: Self = StObject.set(x, "onPinchIn", js.undefined)
      
      @scala.inline
      def setOnPinchMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchMoveUndefined: Self = StObject.set(x, "onPinchMove", js.undefined)
      
      @scala.inline
      def setOnPinchOut(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchOutUndefined: Self = StObject.set(x, "onPinchOut", js.undefined)
      
      @scala.inline
      def setOnPinchStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPinchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchStartUndefined: Self = StObject.set(x, "onPinchStart", js.undefined)
      
      @scala.inline
      def setOnPinchUndefined: Self = StObject.set(x, "onPinch", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnPressUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onPressUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUpUndefined: Self = StObject.set(x, "onPressUp", js.undefined)
      
      @scala.inline
      def setOnRotate(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateCancel(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateCancelUndefined: Self = StObject.set(x, "onRotateCancel", js.undefined)
      
      @scala.inline
      def setOnRotateEnd(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateEndUndefined: Self = StObject.set(x, "onRotateEnd", js.undefined)
      
      @scala.inline
      def setOnRotateMove(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateMoveUndefined: Self = StObject.set(x, "onRotateMove", js.undefined)
      
      @scala.inline
      def setOnRotateStart(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onRotateStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateStartUndefined: Self = StObject.set(x, "onRotateStart", js.undefined)
      
      @scala.inline
      def setOnRotateUndefined: Self = StObject.set(x, "onRotate", js.undefined)
      
      @scala.inline
      def setOnSwipe(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeDown(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
      
      @scala.inline
      def setOnSwipeLeft(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
      
      @scala.inline
      def setOnSwipeRight(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
      
      @scala.inline
      def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      @scala.inline
      def setOnSwipeUp(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* s */ IGestureStatus => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  @js.native
  trait IGestureStatus extends StObject {
    
    var availablePan: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[Double] = js.native
    
    var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.native
    
    var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
    
    var pan: js.UndefOr[Boolean] = js.native
    
    var pinch: js.UndefOr[Boolean] = js.native
    
    var preTouches: js.Array[Finger] = js.native
    
    var press: js.UndefOr[Boolean] = js.native
    
    var rotate: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var srcEvent: js.Any = js.native
    
    var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
    
    var startTime: Double = js.native
    
    var startTouches: js.Array[Finger] = js.native
    
    var swipe: js.UndefOr[Boolean] = js.native
    
    var time: Double = js.native
    
    var touches: js.Array[Finger] = js.native
  }
  object IGestureStatus {
    
    @scala.inline
    def apply(
      preTouches: js.Array[Finger],
      srcEvent: js.Any,
      startTime: Double,
      startTouches: js.Array[Finger],
      time: Double,
      touches: js.Array[Finger]
    ): IGestureStatus = {
      val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGestureStatus]
    }
    
    @scala.inline
    implicit class IGestureStatusMutableBuilder[Self <: IGestureStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailablePan(value: Boolean): Self = StObject.set(x, "availablePan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailablePanUndefined: Self = StObject.set(x, "availablePan", js.undefined)
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMoveStatus(value: SingeFingerMoveStatus): Self = StObject.set(x, "moveStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveStatusUndefined: Self = StObject.set(x, "moveStatus", js.undefined)
      
      @scala.inline
      def setMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "mutliFingerStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutliFingerStatusUndefined: Self = StObject.set(x, "mutliFingerStatus", js.undefined)
      
      @scala.inline
      def setMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "mutliFingerStatus", js.Array(value :_*))
      
      @scala.inline
      def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      @scala.inline
      def setPinch(value: Boolean): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      @scala.inline
      def setPreTouches(value: js.Array[Finger]): Self = StObject.set(x, "preTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreTouchesVarargs(value: Finger*): Self = StObject.set(x, "preTouches", js.Array(value :_*))
      
      @scala.inline
      def setPress(value: Boolean): Self = StObject.set(x, "press", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      @scala.inline
      def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSrcEvent(value: js.Any): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "startMutliFingerStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartMutliFingerStatusUndefined: Self = StObject.set(x, "startMutliFingerStatus", js.undefined)
      
      @scala.inline
      def setStartMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "startMutliFingerStatus", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTouches(value: js.Array[Finger]): Self = StObject.set(x, "startTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTouchesVarargs(value: Finger*): Self = StObject.set(x, "startTouches", js.Array(value :_*))
      
      @scala.inline
      def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouches(value: js.Array[Finger]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchesVarargs(value: Finger*): Self = StObject.set(x, "touches", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MultiFingerStatus extends StObject {
    
    var angle: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object MultiFingerStatus {
    
    @scala.inline
    def apply(angle: Double, x: Double, y: Double, z: Double): MultiFingerStatus = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiFingerStatus]
    }
    
    @scala.inline
    implicit class MultiFingerStatusMutableBuilder[Self <: MultiFingerStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SingeFingerMoveStatus extends StObject {
    
    var angle: Double = js.native
    
    var time: Double = js.native
    
    var velocity: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object SingeFingerMoveStatus {
    
    @scala.inline
    def apply(angle: Double, time: Double, velocity: Double, x: Double, y: Double, z: Double): SingeFingerMoveStatus = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingeFingerMoveStatus]
    }
    
    @scala.inline
    implicit class SingeFingerMoveStatusMutableBuilder[Self <: SingeFingerMoveStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
