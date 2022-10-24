package typings.reactNativeGestureHandler

import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.anon.X
import typings.reactNativeGestureHandler.libTypescriptStateMod.State
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.Config
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.PointerType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHandlersGestureHandlerMod {
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/web/handlers/GestureHandler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GestureHandler
  
  @js.native
  trait GestureHandler extends StObject {
    
    def activate(): Unit = js.native
    def activate(_force: Boolean): Unit = js.native
    
    /* protected */ var activationIndex: Double = js.native
    
    /* protected */ var active: Boolean = js.native
    
    /* private */ var addEventManager: Any = js.native
    
    /* protected */ var awaiting: Boolean = js.native
    
    def begin(): Unit = js.native
    
    /**
      * @param {boolean} sendIfDisabled - Used when handler becomes disabled. With this flag orchestrator will be forced to send cancel event
      */
    def cancel(): Unit = js.native
    def cancel(sendIfDisabled: Boolean): Unit = js.native
    
    /* private */ var cancelTouches: Any = js.native
    
    /* protected */ def checkCustomActivationCriteria(criterias: js.Array[String]): Unit = js.native
    
    /* private */ var checkHitSlop: Any = js.native
    
    /* protected */ var config: Config = js.native
    
    /* protected */ var currentState: State = js.native
    
    /* protected */ var enabled: Boolean = js.native
    
    def end(): Unit = js.native
    
    /* protected */ var eventManagers: js.Array[typings.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default] = js.native
    
    /**
      * @param {boolean} sendIfDisabled - Used when handler becomes disabled. With this flag orchestrator will be forced to send fail event
      */
    def fail(): Unit = js.native
    def fail(sendIfDisabled: Boolean): Unit = js.native
    
    def getActivationIndex(): Double = js.native
    
    /* protected */ def getConfig(): Config = js.native
    
    def getEventManagers(): js.Array[typings.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default] = js.native
    
    def getPointerType(): PointerType = js.native
    
    /* protected */ def getShouldCancelWhenOutside(): Boolean = js.native
    
    def getShouldEnableGestureOnSetup(): Boolean = js.native
    
    def getShouldResetProgress(): Boolean = js.native
    
    def getState(): State = js.native
    
    def getTag(): Double = js.native
    
    def getTrackedPointersID(): js.Array[Double] = js.native
    
    def getTracker(): typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default = js.native
    
    def getView(): HTMLElement = js.native
    
    /* private */ var handlerTag: Any = js.native
    
    /* protected */ var hasCustomActivationCriteria: Boolean = js.native
    
    /* protected */ def init(ref: Double, propsRef: RefObject[Any]): Unit = js.native
    
    def isActive(): Boolean = js.native
    
    def isAwaiting(): Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* private */ var isFinished: Any = js.native
    
    def isPointerInBounds(param0: X): Boolean = js.native
    
    /* private */ var lastSentState: Any = js.native
    
    def moveToState(newState: State): Unit = js.native
    def moveToState(newState: State, sendIfDisabled: Boolean): Unit = js.native
    
    /* protected */ def onCancel(): Unit = js.native
    
    /* protected */ def onPointerAdd(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerCancel(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerDown(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerEnter(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerMove(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerOut(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerOutOfBounds(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerRemove(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerUp(event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onReset(): Unit = js.native
    
    /* protected */ def onStateChange(_newState: State, _oldState: State): Unit = js.native
    
    /* protected */ var pointerType: PointerType = js.native
    
    /* private */ var propsRef: Any = js.native
    
    /* private */ var ref: Any = js.native
    
    def reset(): Unit = js.native
    
    /* protected */ def resetConfig(): Unit = js.native
    
    /* protected */ def resetProgress(): Unit = js.native
    
    def sendEvent(newState: State, oldState: State): Unit = js.native
    
    def sendTouchEvent(event: AdaptedEvent): Unit = js.native
    
    def setActivationIndex(value: Double): Unit = js.native
    
    def setActive(value: Boolean): Unit = js.native
    
    def setAwaiting(value: Boolean): Unit = js.native
    
    /* protected */ def setShouldCancelWhenOutside(shouldCancel: Boolean): Unit = js.native
    
    def setShouldResetProgress(value: Boolean): Unit = js.native
    
    def setTag(tag: Double): Unit = js.native
    
    /* private */ var setView: Any = js.native
    
    def shouldBeCancelledByOther(handler: GestureHandler): Boolean = js.native
    
    /* protected */ var shouldCancellWhenOutside: Boolean = js.native
    
    def shouldRecognizeSimultaneously(handler: GestureHandler): Boolean = js.native
    
    def shouldRequireToWaitForFailure(handler: GestureHandler): Boolean = js.native
    
    /* protected */ var shouldResetProgress: Boolean = js.native
    
    def shouldWaitForHandlerFailure(handler: GestureHandler): Boolean = js.native
    
    /* protected */ var tracker: typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default = js.native
    
    /* private */ var transformEventData: Any = js.native
    
    /* protected */ def transformNativeEvent(): js.Object = js.native
    
    /* private */ var transformTouchEvent: Any = js.native
    
    /* private */ var tryToSendMoveEvent: Any = js.native
    
    def updateGestureConfig(param0: Config): Unit = js.native
    
    /* private */ var validateHitSlops: Any = js.native
    
    /* protected */ var view: HTMLElement = js.native
  }
}
