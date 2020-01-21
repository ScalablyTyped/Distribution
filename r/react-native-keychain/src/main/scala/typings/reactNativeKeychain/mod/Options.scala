package typings.reactNativeKeychain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessControl: js.UndefOr[ACCESS_CONTROL] = js.undefined
  var accessGroup: js.UndefOr[String] = js.undefined
  var accessible: js.UndefOr[ACCESSIBLE] = js.undefined
  var authenticationPrompt: js.UndefOr[String] = js.undefined
  var authenticationType: js.UndefOr[AUTHENTICATION_TYPE] = js.undefined
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
    authenticationType: AUTHENTICATION_TYPE = null,
    securityLevel: SECURITY_LEVEL = null,
    service: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl.asInstanceOf[js.Any])
    if (accessGroup != null) __obj.updateDynamic("accessGroup")(accessGroup.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (authenticationPrompt != null) __obj.updateDynamic("authenticationPrompt")(authenticationPrompt.asInstanceOf[js.Any])
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (securityLevel != null) __obj.updateDynamic("securityLevel")(securityLevel.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

