package typings.reactNavigationCore

import typings.reactNavigationCore.anon.`10`
import typings.reactNavigationCore.anon.`11`
import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnPreventRemoveMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasGetStateEmitterBeforeRemoveListeners: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasGetStateEmitterBeforeRemoveListeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def shouldPreventRemove(
    emitter: NavigationEventEmitter[EventMapCore[js.Any]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[`10`],
    nextRoutes: js.Array[`11`],
    action: NavigationAction
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldPreventRemove")(emitter.asInstanceOf[js.Any], beforeRemoveListeners.asInstanceOf[js.Any], currentRoutes.asInstanceOf[js.Any], nextRoutes.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]]
    
    var emitter: NavigationEventEmitter[EventMapCore[js.Any]]
    
    def getState(): NavigationState[ParamListBase]
  }
  object Options {
    
    @scala.inline
    def apply(
      beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
      emitter: NavigationEventEmitter[EventMapCore[js.Any]],
      getState: () => NavigationState[ParamListBase]
    ): Options = {
      val __obj = js.Dynamic.literal(beforeRemoveListeners = beforeRemoveListeners.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeRemoveListeners(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = StObject.set(x, "beforeRemoveListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitter(value: NavigationEventEmitter[EventMapCore[js.Any]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
}
