package typings
package reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  var authenticatedSelector: StateSelector[State, OwnProps, scala.Boolean]
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, scala.Boolean]] = js.undefined
}

object AuthBaseConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: StateSelector[State, OwnProps, scala.Boolean],
    AuthenticatingComponent: reactLib.reactMod.ReactType[_] = null,
    authenticatingSelector: StateSelector[State, OwnProps, scala.Boolean] = null,
    wrapperDisplayName: java.lang.String = null
  ): AuthBaseConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = authenticatedSelector)
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(authenticatingSelector)
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
  }
}

