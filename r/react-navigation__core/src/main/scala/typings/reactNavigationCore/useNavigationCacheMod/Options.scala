package typings.reactNavigationCore.useNavigationCacheMod

import typings.reactNavigationCore.anon.NavigationHelpersParamLis
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  var emitter: NavigationEventEmitter[EventMapBase] = js.native
  
  def getState(): State = js.native
  
  var navigation: NavigationHelpersParamLis = js.native
  
  var router: Router[State, NavigationAction] = js.native
  
  def setOptions(cb: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]): Unit = js.native
  
  var state: State = js.native
}
object Options {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](
    emitter: NavigationEventEmitter[EventMapBase],
    getState: () => State,
    navigation: NavigationHelpersParamLis,
    router: Router[State, NavigationAction],
    setOptions: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit,
    state: State
  ): Options[State] = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any])
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
    def setEmitter(value: NavigationEventEmitter[EventMapBase]): Self = this.set("emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: () => State): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigation(value: NavigationHelpersParamLis): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouter(value: Router[State, NavigationAction]): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOptions(value: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
