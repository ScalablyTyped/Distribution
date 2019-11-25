package typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod

import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  var authenticatedSelector: StateSelector[State, OwnProps, Boolean]
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.undefined
}

object AuthBaseConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    AuthenticatingComponent: ReactType[_] = null,
    authenticatingSelector: (State, OwnProps) => Boolean = null,
    wrapperDisplayName: String = null
  ): AuthBaseConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2(authenticatingSelector))
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
  }
}

