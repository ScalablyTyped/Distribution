package typings.reduxAuthWrapper.redirectMod

import typings.reduxAuthWrapper.mod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOnEnterConfig[State] extends AuthConfig {
  
  var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.native
  
  var authenticatedSelector: StateMutateSelector[State, Boolean] = js.native
  
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.native
  
  var redirectPath: String | (StateMutateSelector[State, String]) = js.native
  
  var redirectQueryParamName: js.UndefOr[String] = js.native
}
object CreateOnEnterConfig {
  
  @scala.inline
  def apply[State](
    authenticatedSelector: (State, State) => Boolean,
    redirectPath: String | (StateMutateSelector[State, String])
  ): CreateOnEnterConfig[State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnEnterConfig[State]]
  }
  
  @scala.inline
  implicit class CreateOnEnterConfigOps[Self <: CreateOnEnterConfig[_], State] (val x: Self with CreateOnEnterConfig[State]) extends AnyVal {
    
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
    def setAuthenticatedSelector(value: (State, State) => Boolean): Self = this.set("authenticatedSelector", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedirectPathFunction2(value: (State, State) => String): Self = this.set("redirectPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedirectPath(value: String | (StateMutateSelector[State, String])): Self = this.set("redirectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRedirectBackFunction2(value: (State, State) => Boolean): Self = this.set("allowRedirectBack", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowRedirectBack(value: Boolean | (StateMutateSelector[State, Boolean])): Self = this.set("allowRedirectBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRedirectBack: Self = this.set("allowRedirectBack", js.undefined)
    
    @scala.inline
    def setAuthenticatingSelector(value: (State, State) => Boolean): Self = this.set("authenticatingSelector", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAuthenticatingSelector: Self = this.set("authenticatingSelector", js.undefined)
    
    @scala.inline
    def setRedirectQueryParamName(value: String): Self = this.set("redirectQueryParamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectQueryParamName: Self = this.set("redirectQueryParamName", js.undefined)
  }
}
