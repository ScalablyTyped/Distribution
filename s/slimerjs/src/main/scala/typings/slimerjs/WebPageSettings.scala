package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPageSettings extends js.Object {
  var XSSAuditingEnabled: Boolean
  var javascriptEnabled: Boolean
  var loadImages: Boolean
  var localToRemoteUrlAccessEnabled: Boolean
  var password: String
  var resourceTimeout: Double
  var userAgent: String
  var userName: String
  var webSecurityEnabled: Boolean
}

object WebPageSettings {
  @scala.inline
  def apply(
    XSSAuditingEnabled: Boolean,
    javascriptEnabled: Boolean,
    loadImages: Boolean,
    localToRemoteUrlAccessEnabled: Boolean,
    password: String,
    resourceTimeout: Double,
    userAgent: String,
    userName: String,
    webSecurityEnabled: Boolean
  ): WebPageSettings = {
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled, javascriptEnabled = javascriptEnabled, loadImages = loadImages, localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled, password = password, resourceTimeout = resourceTimeout, userAgent = userAgent, userName = userName, webSecurityEnabled = webSecurityEnabled)
  
    __obj.asInstanceOf[WebPageSettings]
  }
}

