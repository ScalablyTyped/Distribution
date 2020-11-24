package typings.reactNavigationCore.navigationBuilderContextMod

import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedListenerMap extends js.Object {
  
  var beforeRemove: ChildBeforeRemoveListener = js.native
  
  var getState: GetStateListener = js.native
}
object KeyedListenerMap {
  
  @scala.inline
  def apply(
    beforeRemove: /* action */ NavigationAction => Boolean,
    getState: () => NavigationState[ParamListBase]
  ): KeyedListenerMap = {
    val __obj = js.Dynamic.literal(beforeRemove = js.Any.fromFunction1(beforeRemove), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[KeyedListenerMap]
  }
  
  @scala.inline
  implicit class KeyedListenerMapOps[Self <: KeyedListenerMap] (val x: Self) extends AnyVal {
    
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
    def setBeforeRemove(value: /* action */ NavigationAction => Boolean): Self = this.set("beforeRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => NavigationState[ParamListBase]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
