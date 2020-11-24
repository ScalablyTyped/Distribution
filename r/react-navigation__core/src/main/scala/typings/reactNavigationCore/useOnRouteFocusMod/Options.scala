package typings.reactNavigationCore.useOnRouteFocusMod

import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Action /* <: NavigationAction */] extends js.Object {
  
  def getState(): NavigationState[ParamListBase] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var router: Router[NavigationState[ParamListBase], Action] = js.native
  
  def setState(state: NavigationState[ParamListBase]): Unit = js.native
}
object Options {
  
  @scala.inline
  def apply[Action /* <: NavigationAction */](
    getState: () => NavigationState[ParamListBase],
    router: Router[NavigationState[ParamListBase], Action],
    setState: NavigationState[ParamListBase] => Unit
  ): Options[Action] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), router = router.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[Options[Action]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], Action /* <: NavigationAction */] (val x: Self with Options[Action]) extends AnyVal {
    
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
    def setGetState(value: () => NavigationState[ParamListBase]): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRouter(value: Router[NavigationState[ParamListBase], Action]): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetState(value: NavigationState[ParamListBase] => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
