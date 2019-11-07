package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessControl: js.UndefOr[ACCESS_CONTROL] = js.undefined
  var accessGroup: js.UndefOr[String] = js.undefined
  var accessible: js.UndefOr[ACCESSIBLE] = js.undefined
  var authenticationPrompt: js.UndefOr[String] = js.undefined
  var authenticationType: js.UndefOr[LAPolicy] = js.undefined
  var securityLevel: js.UndefOr[SECURITY_LEVEL] = js.undefined
  var service: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessControl: ACCESS_CONTROL = null,
    accessGroup: String = null,
    accessible: ACCESSIBLE = null,
    authenticationPrompt: String = null,
    authenticationType: LAPolicy = null,
    securityLevel: SECURITY_LEVEL = null,
    service: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl)
    if (accessGroup != null) __obj.updateDynamic("accessGroup")(accessGroup)
    if (accessible != null) __obj.updateDynamic("accessible")(accessible)
    if (authenticationPrompt != null) __obj.updateDynamic("authenticationPrompt")(authenticationPrompt)
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType)
    if (securityLevel != null) __obj.updateDynamic("securityLevel")(securityLevel)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Options]
  }
}

