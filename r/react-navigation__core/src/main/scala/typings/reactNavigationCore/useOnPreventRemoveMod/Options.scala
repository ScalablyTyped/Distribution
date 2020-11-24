package typings.reactNavigationCore.useOnPreventRemoveMod

import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeRemoveListeners(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = this.set("beforeRemoveListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitter(value: NavigationEventEmitter[EventMapCore[_]]): Self = this.set("emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: () => NavigationState[ParamListBase]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
