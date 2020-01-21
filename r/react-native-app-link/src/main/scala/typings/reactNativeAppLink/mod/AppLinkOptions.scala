package typings.reactNativeAppLink.mod

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
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appStoreId = appStoreId.asInstanceOf[js.Any], appStoreLocale = appStoreLocale.asInstanceOf[js.Any], playStoreId = playStoreId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppLinkOptions]
  }
}

