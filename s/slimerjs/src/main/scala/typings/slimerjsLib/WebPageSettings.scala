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
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled, javascriptEnabled = javascriptEnabled, loadImages = loadImages, localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled, password = password, resourceTimeout = resourceTimeout, userAgent = userAgent, userName = userName, webSecurityEnabled = webSecurityEnabled)
  
    __obj.asInstanceOf[WebPageSettings]
  }
}

