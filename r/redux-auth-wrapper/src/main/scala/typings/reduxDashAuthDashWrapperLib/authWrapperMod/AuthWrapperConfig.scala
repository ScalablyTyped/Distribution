package typings
package reduxDashAuthDashWrapperLib.authWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthWrapperConfig
  extends reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthConfig {
  var FailureComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object AuthWrapperConfig {
  @scala.inline
  def apply(
    AuthenticatingComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    FailureComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    wrapperDisplayName: java.lang.String = null
  ): AuthWrapperConfig = {
    val __obj = js.Dynamic.literal()
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (FailureComponent != null) __obj.updateDynamic("FailureComponent")(FailureComponent.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[AuthWrapperConfig]
  }
}

