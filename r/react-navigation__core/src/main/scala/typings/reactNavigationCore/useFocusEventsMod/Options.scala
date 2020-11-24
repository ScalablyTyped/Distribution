package typings.reactNavigationCore.useFocusEventsMod

import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  var emitter: NavigationEventEmitter[EventMapCore[State]] = js.native
  
  var state: State = js.native
}
object Options {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](emitter: NavigationEventEmitter[EventMapCore[State]], state: State): Options[State] = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[State]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Options[State]) extends AnyVal {
    
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
    def setEmitter(value: NavigationEventEmitter[EventMapCore[State]]): Self = this.set("emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
