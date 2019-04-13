package typings
package reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var AuthenticatingComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var wrapperDisplayName: js.UndefOr[java.lang.String] = js.undefined
}

object AuthConfig {
  @scala.inline
  def apply(
    AuthenticatingComponent: reactLib.reactMod.ReactType[_] = null,
    wrapperDisplayName: java.lang.String = null
  ): AuthConfig = {
    val __obj = js.Dynamic.literal()
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[AuthConfig]
  }
}

