package typings.reactDashNativeDashAppDashLink.reactDashNativeDashAppDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLinkOptions extends js.Object {
  val appName: String
  val appStoreId: Double
  val appStoreLocale: String
  val playStoreId: String
}

object AppLinkOptions {
  @scala.inline
  def apply(appName: String, appStoreId: Double, appStoreLocale: String, playStoreId: String): AppLinkOptions = {
    val __obj = js.Dynamic.literal(appName = appName, appStoreId = appStoreId, appStoreLocale = appStoreLocale, playStoreId = playStoreId)
  
    __obj.asInstanceOf[AppLinkOptions]
  }
}

