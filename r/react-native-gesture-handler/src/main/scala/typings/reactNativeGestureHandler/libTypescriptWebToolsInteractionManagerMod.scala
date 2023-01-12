package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsInteractionManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with InteractionManager {
    
    /* CompleteClass */
    override def configureInteractions(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      config: Config
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropRelationsForHandlerWithTag(handlerTag: Double): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def shouldHandlerBeCancelledBy(
      _handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldRecognizeSimultaneously(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldRequireHandlerToWaitForFailure(
      _handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldWaitForHandlerFailure(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val simultaneousRelations: Any = js.native
    
    /* private */ /* CompleteClass */
    override val waitForRelations: Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): InteractionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[InteractionManager]
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", "default.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait InteractionManager extends StObject {
    
    def configureInteractions(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      config: Config
    ): Unit
    
    def dropRelationsForHandlerWithTag(handlerTag: Double): Unit
    
    def reset(): Unit
    
    def shouldHandlerBeCancelledBy(
      _handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldRecognizeSimultaneously(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldRequireHandlerToWaitForFailure(
      _handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldWaitForHandlerFailure(
      handler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    /* private */ val simultaneousRelations: Any
    
    /* private */ val waitForRelations: Any
  }
  object InteractionManager {
    
    inline def apply(
      configureInteractions: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, Config) => Unit,
      dropRelationsForHandlerWithTag: Double => Unit,
      reset: () => Unit,
      shouldHandlerBeCancelledBy: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldRecognizeSimultaneously: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldRequireHandlerToWaitForFailure: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldWaitForHandlerFailure: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      simultaneousRelations: Any,
      waitForRelations: Any
    ): InteractionManager = {
      val __obj = js.Dynamic.literal(configureInteractions = js.Any.fromFunction2(configureInteractions), dropRelationsForHandlerWithTag = js.Any.fromFunction1(dropRelationsForHandlerWithTag), reset = js.Any.fromFunction0(reset), shouldHandlerBeCancelledBy = js.Any.fromFunction2(shouldHandlerBeCancelledBy), shouldRecognizeSimultaneously = js.Any.fromFunction2(shouldRecognizeSimultaneously), shouldRequireHandlerToWaitForFailure = js.Any.fromFunction2(shouldRequireHandlerToWaitForFailure), shouldWaitForHandlerFailure = js.Any.fromFunction2(shouldWaitForHandlerFailure), simultaneousRelations = simultaneousRelations.asInstanceOf[js.Any], waitForRelations = waitForRelations.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionManager] (val x: Self) extends AnyVal {
      
      inline def setConfigureInteractions(
        value: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, Config) => Unit
      ): Self = StObject.set(x, "configureInteractions", js.Any.fromFunction2(value))
      
      inline def setDropRelationsForHandlerWithTag(value: Double => Unit): Self = StObject.set(x, "dropRelationsForHandlerWithTag", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setShouldHandlerBeCancelledBy(
        value: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldHandlerBeCancelledBy", js.Any.fromFunction2(value))
      
      inline def setShouldRecognizeSimultaneously(
        value: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldRecognizeSimultaneously", js.Any.fromFunction2(value))
      
      inline def setShouldRequireHandlerToWaitForFailure(
        value: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldRequireHandlerToWaitForFailure", js.Any.fromFunction2(value))
      
      inline def setShouldWaitForHandlerFailure(
        value: (typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldWaitForHandlerFailure", js.Any.fromFunction2(value))
      
      inline def setSimultaneousRelations(value: Any): Self = StObject.set(x, "simultaneousRelations", value.asInstanceOf[js.Any])
      
      inline def setWaitForRelations(value: Any): Self = StObject.set(x, "waitForRelations", value.asInstanceOf[js.Any])
    }
  }
}
