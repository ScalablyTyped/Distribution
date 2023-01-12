package typings.reactNavigationCore

import typings.reactNavigationCore.anon.KeyString
import typings.reactNavigationCore.anon.`4`
import typings.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typings.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOnPreventRemoveMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldPreventRemove(
    emitter: NavigationEventEmitter[EventMapCore[Any]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[KeyString],
    nextRoutes: js.Array[`4`],
    action: NavigationAction
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldPreventRemove")(emitter.asInstanceOf[js.Any], beforeRemoveListeners.asInstanceOf[js.Any], currentRoutes.asInstanceOf[js.Any], nextRoutes.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]]
    
    var emitter: NavigationEventEmitter[EventMapCore[Any]]
    
    def getState(): NavigationState[ParamListBase]
  }
  object Options {
    
    inline def apply(
      beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
      emitter: NavigationEventEmitter[EventMapCore[Any]],
      getState: () => NavigationState[ParamListBase]
    ): Options = {
      val __obj = js.Dynamic.literal(beforeRemoveListeners = beforeRemoveListeners.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBeforeRemoveListeners(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = StObject.set(x, "beforeRemoveListeners", value.asInstanceOf[js.Any])
      
      inline def setEmitter(value: NavigationEventEmitter[EventMapCore[Any]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
}
