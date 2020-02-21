package typings.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSdkOptions extends js.Object {
  var appId: String
  var devKey: String
  var isDebug: Boolean
}

object InitSdkOptions {
  @scala.inline
  def apply(appId: String, devKey: String, isDebug: Boolean): InitSdkOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], devKey = devKey.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitSdkOptions]
  }
}

