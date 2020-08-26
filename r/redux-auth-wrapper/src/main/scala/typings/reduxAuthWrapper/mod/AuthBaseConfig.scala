package typings.reduxAuthWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  var authenticatedSelector: StateSelector[State, OwnProps, Boolean] = js.native
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.native
}

object AuthBaseConfig {
  @scala.inline
  def apply[OwnProps, State](authenticatedSelector: (State, OwnProps) => Boolean): AuthBaseConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
    __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class AuthBaseConfigOps[Self <: AuthBaseConfig[_, _], OwnProps, State] (val x: Self with (AuthBaseConfig[OwnProps, State])) extends AnyVal {
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
    def setAuthenticatedSelector(value: (State, OwnProps) => Boolean): Self = this.set("authenticatedSelector", js.Any.fromFunction2(value))
    @scala.inline
    def setAuthenticatingSelector(value: (State, OwnProps) => Boolean): Self = this.set("authenticatingSelector", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAuthenticatingSelector: Self = this.set("authenticatingSelector", js.undefined)
  }
  
}

