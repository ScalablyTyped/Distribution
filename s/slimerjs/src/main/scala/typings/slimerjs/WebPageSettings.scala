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
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled.asInstanceOf[js.Any], javascriptEnabled = javascriptEnabled.asInstanceOf[js.Any], loadImages = loadImages.asInstanceOf[js.Any], localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], webSecurityEnabled = webSecurityEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageSettings]
  }
}

