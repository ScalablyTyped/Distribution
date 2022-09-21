package typings.reactNativeGestureHandler

import typings.hammerjs.HammerManager
import typings.hammerjs.HammerPoint
import typings.hammerjs.RecognizerStatic
import typings.reactNativeGestureHandler.anon.Dictx
import typings.reactNativeGestureHandler.anon.FailedSuccess
import typings.reactNativeGestureHandler.anon.NativeEvent
import typings.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import typings.reactNativeGestureHandler.anon.Pointers
import typings.reactNativeGestureHandler.anon.RequiredConfig
import typings.reactNativeGestureHandler.anon.X
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`1`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`2`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`8`
import typings.reactNativeGestureHandler.stateMod.State
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHammerGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/GestureHandler", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with GestureHandler
  
  /* Inlined std.Partial<{  enabled :boolean,   minPointers :number,   maxPointers :number,   minDist :number,   minDistSq :number,   minVelocity :number,   minVelocitySq :number,   maxDist :number,   maxDistSq :number,   failOffsetXStart :number,   failOffsetYStart :number,   failOffsetXEnd :number,   failOffsetYEnd :number,   activeOffsetXStart :number,   activeOffsetXEnd :number,   activeOffsetYStart :number,   activeOffsetYEnd :number,   waitFor :std.Array<any> | null,   simultaneousHandlers :std.Array<any> | null}> */
  trait Config extends StObject {
    
    var activeOffsetXEnd: js.UndefOr[Double] = js.undefined
    
    var activeOffsetXStart: js.UndefOr[Double] = js.undefined
    
    var activeOffsetYEnd: js.UndefOr[Double] = js.undefined
    
    var activeOffsetYStart: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var failOffsetXEnd: js.UndefOr[Double] = js.undefined
    
    var failOffsetXStart: js.UndefOr[Double] = js.undefined
    
    var failOffsetYEnd: js.UndefOr[Double] = js.undefined
    
    var failOffsetYStart: js.UndefOr[Double] = js.undefined
    
    var maxDist: js.UndefOr[Double] = js.undefined
    
    var maxDistSq: js.UndefOr[Double] = js.undefined
    
    var maxPointers: js.UndefOr[Double] = js.undefined
    
    var minDist: js.UndefOr[Double] = js.undefined
    
    var minDistSq: js.UndefOr[Double] = js.undefined
    
    var minPointers: js.UndefOr[Double] = js.undefined
    
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    var minVelocitySq: js.UndefOr[Double] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[js.Array[Any] | Null] = js.undefined
    
    var waitFor: js.UndefOr[js.Array[Any] | Null] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXEndUndefined: Self = StObject.set(x, "activeOffsetXEnd", js.undefined)
      
      inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXStartUndefined: Self = StObject.set(x, "activeOffsetXStart", js.undefined)
      
      inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYEndUndefined: Self = StObject.set(x, "activeOffsetYEnd", js.undefined)
      
      inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYStartUndefined: Self = StObject.set(x, "activeOffsetYStart", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFailOffsetXEnd(value: Double): Self = StObject.set(x, "failOffsetXEnd", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXEndUndefined: Self = StObject.set(x, "failOffsetXEnd", js.undefined)
      
      inline def setFailOffsetXStart(value: Double): Self = StObject.set(x, "failOffsetXStart", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXStartUndefined: Self = StObject.set(x, "failOffsetXStart", js.undefined)
      
      inline def setFailOffsetYEnd(value: Double): Self = StObject.set(x, "failOffsetYEnd", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYEndUndefined: Self = StObject.set(x, "failOffsetYEnd", js.undefined)
      
      inline def setFailOffsetYStart(value: Double): Self = StObject.set(x, "failOffsetYStart", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYStartUndefined: Self = StObject.set(x, "failOffsetYStart", js.undefined)
      
      inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
      
      inline def setMaxDistSq(value: Double): Self = StObject.set(x, "maxDistSq", value.asInstanceOf[js.Any])
      
      inline def setMaxDistSqUndefined: Self = StObject.set(x, "maxDistSq", js.undefined)
      
      inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      inline def setMinDistSq(value: Double): Self = StObject.set(x, "minDistSq", value.asInstanceOf[js.Any])
      
      inline def setMinDistSqUndefined: Self = StObject.set(x, "minDistSq", js.undefined)
      
      inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocitySq(value: Double): Self = StObject.set(x, "minVelocitySq", value.asInstanceOf[js.Any])
      
      inline def setMinVelocitySqUndefined: Self = StObject.set(x, "minVelocitySq", js.undefined)
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setSimultaneousHandlers(value: js.Array[Any]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Any*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
      
      inline def setWaitFor(value: js.Array[Any]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      inline def setWaitForVarargs(value: Any*): Self = StObject.set(x, "waitFor", js.Array(value*))
    }
  }
  
  @js.native
  trait GestureHandler extends StObject {
    
    def NativeGestureClass: RecognizerStatic = js.native
    
    /* protected */ var __initialX: Any = js.native
    
    /* protected */ var __initialY: Any = js.native
    
    def _getPendingGestures(): js.Array[Any] = js.native
    
    /* private */ var _stillWaiting: Any = js.native
    
    def addPendingGesture(gesture: this.type): Unit = js.native
    
    def cancelEvent(event: HammerInputExt): Unit = js.native
    
    def cancelPendingGestures(event: HammerInputExt): Unit = js.native
    
    def clearSelfAsPending(): Unit = js.native
    
    /* protected */ var config: Config = js.native
    
    def destroy(): Unit = js.native
    
    def ensureConfig(config: Config): RequiredConfig = js.native
    
    def forceInvalidate(event: HammerInputExt): Unit = js.native
    
    /* private */ var gestureInstance: Any = js.native
    
    def getConfig(): PartialenabledbooleanminP = js.native
    
    def getHammerConfig(): Pointers = js.native
    
    def getState(`type`: /* keyof react-native-gesture-handler.anon.1 */ `1` | `2` | `4` | `8`): State = js.native
    
    /* protected */ var hammer: HammerManager | Null = js.native
    
    var handlerTag: Any = js.native
    
    /* protected */ var hasCustomActivationCriteria: Boolean = js.native
    
    /* protected */ var hasGestureFailed: Boolean = js.native
    
    def id: String = js.native
    
    /* protected */ var initialRotation: Double | Null = js.native
    
    def isDiscrete: Boolean = js.native
    
    def isGestureEnabledForEvent(_config: Any, _recognizer: Any, _event: Any): FailedSuccess = js.native
    
    var isGestureRunning: Boolean = js.native
    
    def isNative: Boolean = js.native
    
    def isPointInView(hasXY: X): Boolean = js.native
    
    /* private */ var lastSentState: Any = js.native
    
    def name: String = js.native
    
    def notifyPendingGestures(): Unit = js.native
    
    /* private */ var oldState: Any = js.native
    
    def onGestureActivated(ev: HammerInputExt): Unit = js.native
    
    def onGestureEnded(event: HammerInputExt): Unit = js.native
    
    def onRawEvent(hasIsFirst: HammerInputExt): Unit = js.native
    
    def onStart(hasDeltaXDeltaYRotation: HammerInputExt): Unit = js.native
    
    def onSuccess(): Unit = js.native
    
    def onWaitingEnded(_gesture: this.type): Unit = js.native
    
    /* private */ var pendingGestures: Any = js.native
    
    /* protected */ var previousState: State = js.native
    
    /* private */ var propsRef: Any = js.native
    
    /* private */ var ref: Any = js.native
    
    def removePendingGesture(id: String): Unit = js.native
    
    def sendEvent(nativeEvent: HammerInputExt): Unit = js.native
    
    @JSName("setView")
    def setView_0(
      ref: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-native-gesture-handler.anon.FnCallComponentOrHandle>['0'] */ js.Any,
      propsRef: Any
    ): Unit = js.native
    
    def setupEvents(): Unit = js.native
    
    def shouldEnableGestureOnSetup: Boolean = js.native
    
    def shouldUseTouchEvents(config: Config): Boolean = js.native
    
    def simulateCancelEvent(_inputData: Any): Unit = js.native
    
    def sync(): Unit = js.native
    
    def transformEventData(event: HammerInputExt): NativeEvent = js.native
    
    def transformNativeEvent(_event: HammerInputExt): js.Object = js.native
    
    def updateGestureConfig(hasEnabledProps: Dictx): PartialenabledbooleanminP = js.native
    
    def updateHasCustomActivationCriteria(_config: Config): Boolean = js.native
    
    var view: Double | Null = js.native
  }
  
  /* Inlined std.Omit<hammerjs.HammerInput, 'destroy' | 'handler' | 'init'> */
  trait HammerInputExt extends StObject {
    
    var angle: Double
    
    var center: HammerPoint
    
    var changedPointers: js.Array[Any]
    
    var deltaTime: Double
    
    var deltaX: Double
    
    var deltaY: Double
    
    var direction: Double
    
    var distance: Double
    
    var eventType: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`4` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`8`
    
    var isFinal: Boolean
    
    var isFirst: Boolean
    
    var maxPointers: Double
    
    var offsetDirection: Double
    
    var overallVelocity: Double
    
    var overallVelocityX: Double
    
    var overallVelocityY: Double
    
    var pointerType: String
    
    var pointers: js.Array[Any]
    
    var preventDefault: js.Function
    
    var rotation: Double
    
    var scale: Double
    
    var srcEvent: TouchEvent | MouseEvent | PointerEvent
    
    var target: HTMLElement
    
    var timeStamp: Double
    
    var `type`: String
    
    var velocity: Double
    
    var velocityX: Double
    
    var velocityY: Double
  }
  object HammerInputExt {
    
    inline def apply(
      angle: Double,
      center: HammerPoint,
      changedPointers: js.Array[Any],
      deltaTime: Double,
      deltaX: Double,
      deltaY: Double,
      direction: Double,
      distance: Double,
      eventType: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`4` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`8`,
      isFinal: Boolean,
      isFirst: Boolean,
      maxPointers: Double,
      offsetDirection: Double,
      overallVelocity: Double,
      overallVelocityX: Double,
      overallVelocityY: Double,
      pointerType: String,
      pointers: js.Array[Any],
      preventDefault: js.Function,
      rotation: Double,
      scale: Double,
      srcEvent: TouchEvent | MouseEvent | PointerEvent,
      target: HTMLElement,
      timeStamp: Double,
      `type`: String,
      velocity: Double,
      velocityX: Double,
      velocityY: Double
    ): HammerInputExt = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], changedPointers = changedPointers.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isFinal = isFinal.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], maxPointers = maxPointers.asInstanceOf[js.Any], offsetDirection = offsetDirection.asInstanceOf[js.Any], overallVelocity = overallVelocity.asInstanceOf[js.Any], overallVelocityX = overallVelocityX.asInstanceOf[js.Any], overallVelocityY = overallVelocityY.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HammerInputExt]
    }
    
    extension [Self <: HammerInputExt](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: HammerPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setChangedPointers(value: js.Array[Any]): Self = StObject.set(x, "changedPointers", value.asInstanceOf[js.Any])
      
      inline def setChangedPointersVarargs(value: Any*): Self = StObject.set(x, "changedPointers", js.Array(value*))
      
      inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setEventType(
        value: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`4` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`8`
      ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
      
      inline def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setOffsetDirection(value: Double): Self = StObject.set(x, "offsetDirection", value.asInstanceOf[js.Any])
      
      inline def setOverallVelocity(value: Double): Self = StObject.set(x, "overallVelocity", value.asInstanceOf[js.Any])
      
      inline def setOverallVelocityX(value: Double): Self = StObject.set(x, "overallVelocityX", value.asInstanceOf[js.Any])
      
      inline def setOverallVelocityY(value: Double): Self = StObject.set(x, "overallVelocityY", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: js.Array[Any]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setPointersVarargs(value: Any*): Self = StObject.set(x, "pointers", js.Array(value*))
      
      inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
    }
  }
}
