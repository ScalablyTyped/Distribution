package typings.reactNavigationCore

import typings.reactNavigationCore.anon.`12`
import typings.reactNavigationCore.anon.`13`
import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnPreventRemoveMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", JSImport.Default)
  @js.native
  def default(hasGetStateEmitterBeforeRemoveListeners: Options): Unit = js.native
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", "shouldPreventRemove")
  @js.native
  def shouldPreventRemove(
    emitter: NavigationEventEmitter[EventMapCore[_]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[`12`],
    nextRoutes: js.Array[`13`],
    action: NavigationAction
  ): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]] = js.native
    
    var emitter: NavigationEventEmitter[EventMapCore[_]] = js.native
    
    def getState(): NavigationState[ParamListBase] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
      emitter: NavigationEventEmitter[EventMapCore[_]],
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
      def setEmitter(value: NavigationEventEmitter[EventMapCore[_]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
}
