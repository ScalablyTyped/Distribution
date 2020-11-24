package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.NavigatorScreenParams
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  var name: String = js.native
  
  var params: js.UndefOr[NavigatorScreenParams[State, NavigationState[ParamListBase]]] = js.native
}
object Name {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](name: String): Name[State] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[State]]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Name[State]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: NavigatorScreenParams[State, NavigationState[ParamListBase]]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
