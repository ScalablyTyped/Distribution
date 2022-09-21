package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerOrchestratorMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/GestureHandlerOrchestrator", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with GestureHandlerOrchestrator
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/GestureHandlerOrchestrator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): GestureHandlerOrchestrator = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[GestureHandlerOrchestrator]
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/GestureHandlerOrchestrator", "default.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait GestureHandlerOrchestrator extends StObject {
    
    /* private */ var activationIndex: Any = js.native
    
    /* private */ var addAwaitingHandler: Any = js.native
    
    /* private */ var awaitingHandlers: Any = js.native
    
    /* private */ var canRunSimultaneously: Any = js.native
    
    def cancelMouseAndPenGestures(currentHandler: typings.reactNativeGestureHandler.gestureHandlerMod.default): Unit = js.native
    
    /* private */ var checkOverlap: Any = js.native
    
    /* private */ var cleanHandler: Any = js.native
    
    /* private */ var cleanupAwaitingHandlers: Any = js.native
    
    /* private */ var cleanupFinishedHandlers: Any = js.native
    
    /* private */ var gestureHandlers: Any = js.native
    
    /* private */ var handlersToCancel: Any = js.native
    
    /* private */ var handlingChangeSemaphore: Any = js.native
    
    /* private */ var hasOtherHandlerToWaitFor: Any = js.native
    
    /* private */ var isFinished: Any = js.native
    
    /* private */ var makeActive: Any = js.native
    
    def onHandlerStateChange(
      handler: typings.reactNativeGestureHandler.gestureHandlerMod.default,
      newState: State,
      oldState: State
    ): Unit = js.native
    def onHandlerStateChange(
      handler: typings.reactNativeGestureHandler.gestureHandlerMod.default,
      newState: State,
      oldState: State,
      sendIfDisabled: Boolean
    ): Unit = js.native
    
    def recordHandlerIfNotPresent(handler: typings.reactNativeGestureHandler.gestureHandlerMod.default): Unit = js.native
    
    def removeHandlerFromOrchestrator(handler: typings.reactNativeGestureHandler.gestureHandlerMod.default): Unit = js.native
    
    /* private */ var scheduleFinishedHandlersCleanup: Any = js.native
    
    /* private */ var shouldActivate: Any = js.native
    
    /* private */ var shouldHandlerBeCancelledBy: Any = js.native
    
    /* private */ var shouldHandlerWaitForOther: Any = js.native
    
    /* private */ var tryActivate: Any = js.native
  }
}
