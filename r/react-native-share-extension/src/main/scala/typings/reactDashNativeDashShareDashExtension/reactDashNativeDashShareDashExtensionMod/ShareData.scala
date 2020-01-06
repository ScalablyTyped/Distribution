package typings.reactDashNativeDashShareDashExtension.reactDashNativeDashShareDashExtensionMod

import typings.reactDashNativeDashShareDashExtension.reactDashNativeDashShareDashExtensionStrings.imagesSlashAsterisk
import typings.reactDashNativeDashShareDashExtension.reactDashNativeDashShareDashExtensionStrings.textSlashplain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareData extends js.Object {
  var `type`: textSlashplain | imagesSlashAsterisk
  var value: String
}

object ShareData {
  @scala.inline
  def apply(`type`: textSlashplain | imagesSlashAsterisk, value: String): ShareData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareData]
  }
}

