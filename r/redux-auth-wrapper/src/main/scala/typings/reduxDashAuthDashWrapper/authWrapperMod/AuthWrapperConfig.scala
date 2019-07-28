package typings.reduxDashAuthDashWrapper.authWrapperMod

import typings.react.reactMod.ReactType
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthWrapperConfig extends AuthConfig {
  var FailureComponent: js.UndefOr[ReactType[_]] = js.undefined
}

object AuthWrapperConfig {
  @scala.inline
  def apply(
    AuthenticatingComponent: ReactType[_] = null,
    FailureComponent: ReactType[_] = null,
    wrapperDisplayName: String = null
  ): AuthWrapperConfig = {
    val __obj = js.Dynamic.literal()
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (FailureComponent != null) __obj.updateDynamic("FailureComponent")(FailureComponent.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[AuthWrapperConfig]
  }
}

