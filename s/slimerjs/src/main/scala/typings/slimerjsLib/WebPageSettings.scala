package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPageSettings extends js.Object {
  var XSSAuditingEnabled: scala.Boolean
  var javascriptEnabled: scala.Boolean
  var loadImages: scala.Boolean
  var localToRemoteUrlAccessEnabled: scala.Boolean
  var password: java.lang.String
  var resourceTimeout: scala.Double
  var userAgent: java.lang.String
  var userName: java.lang.String
  var webSecurityEnabled: scala.Boolean
}

object WebPageSettings {
  @scala.inline
  def apply(
    XSSAuditingEnabled: scala.Boolean,
    javascriptEnabled: scala.Boolean,
    loadImages: scala.Boolean,
    localToRemoteUrlAccessEnabled: scala.Boolean,
    password: java.lang.String,
    resourceTimeout: scala.Double,
    userAgent: java.lang.String,
    userName: java.lang.String,
    webSecurityEnabled: scala.Boolean
  ): WebPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("XSSAuditingEnabled")(XSSAuditingEnabled)
    __obj.updateDynamic("javascriptEnabled")(javascriptEnabled)
    __obj.updateDynamic("loadImages")(loadImages)
    __obj.updateDynamic("localToRemoteUrlAccessEnabled")(localToRemoteUrlAccessEnabled)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("resourceTimeout")(resourceTimeout)
    __obj.updateDynamic("userAgent")(userAgent)
    __obj.updateDynamic("userName")(userName)
    __obj.updateDynamic("webSecurityEnabled")(webSecurityEnabled)
    __obj.asInstanceOf[WebPageSettings]
  }
}

