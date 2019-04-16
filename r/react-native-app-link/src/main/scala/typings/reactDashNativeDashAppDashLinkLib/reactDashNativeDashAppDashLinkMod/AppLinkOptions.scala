package typings
package reactDashNativeDashAppDashLinkLib.reactDashNativeDashAppDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLinkOptions extends js.Object {
  val appName: java.lang.String
  val appStoreId: scala.Double
  val appStoreLocale: java.lang.String
  val playStoreId: java.lang.String
}

object AppLinkOptions {
  @scala.inline
  def apply(
    appName: java.lang.String,
    appStoreId: scala.Double,
    appStoreLocale: java.lang.String,
    playStoreId: java.lang.String
  ): AppLinkOptions = {
    val __obj = js.Dynamic.literal(appName = appName, appStoreId = appStoreId, appStoreLocale = appStoreLocale, playStoreId = playStoreId)
  
    __obj.asInstanceOf[AppLinkOptions]
  }
}

