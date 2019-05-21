package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOnEnterConfig[State]
  extends reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthConfig {
  var allowRedirectBack: js.UndefOr[scala.Boolean | (StateMutateSelector[State, scala.Boolean])] = js.undefined
  var authenticatedSelector: StateMutateSelector[State, scala.Boolean]
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, scala.Boolean]] = js.undefined
  var redirectPath: java.lang.String | (StateMutateSelector[State, java.lang.String])
  var redirectQueryParamName: js.UndefOr[java.lang.String] = js.undefined
}

object CreateOnEnterConfig {
  @scala.inline
  def apply[State](
    authenticatedSelector: StateMutateSelector[State, scala.Boolean],
    redirectPath: java.lang.String | (StateMutateSelector[State, java.lang.String]),
    AuthenticatingComponent: reactLib.reactMod.ReactType[_] = null,
    allowRedirectBack: scala.Boolean | (StateMutateSelector[State, scala.Boolean]) = null,
    authenticatingSelector: StateMutateSelector[State, scala.Boolean] = null,
    redirectQueryParamName: java.lang.String = null,
    wrapperDisplayName: java.lang.String = null
  ): CreateOnEnterConfig[State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = authenticatedSelector, redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(authenticatingSelector)
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName)
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[CreateOnEnterConfig[State]]
  }
}

