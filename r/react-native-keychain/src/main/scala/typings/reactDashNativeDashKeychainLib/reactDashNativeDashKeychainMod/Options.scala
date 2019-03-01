package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessControl: js.UndefOr[SecAccessControl] = js.undefined
  var accessGroup: js.UndefOr[java.lang.String] = js.undefined
  var accessible: js.UndefOr[SecAccessible] = js.undefined
  var authenticationPrompt: js.UndefOr[java.lang.String] = js.undefined
  var authenticationType: js.UndefOr[LAPolicy] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessControl: SecAccessControl = null,
    accessGroup: java.lang.String = null,
    accessible: SecAccessible = null,
    authenticationPrompt: java.lang.String = null,
    authenticationType: LAPolicy = null,
    service: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl)
    if (accessGroup != null) __obj.updateDynamic("accessGroup")(accessGroup)
    if (accessible != null) __obj.updateDynamic("accessible")(accessible)
    if (authenticationPrompt != null) __obj.updateDynamic("authenticationPrompt")(authenticationPrompt)
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Options]
  }
}

