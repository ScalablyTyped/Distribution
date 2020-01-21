package typings.reactNativeShareExtension.mod

import typings.reactNativeShareExtension.reactNativeShareExtensionStrings.imagesSlashAsterisk
import typings.reactNativeShareExtension.reactNativeShareExtensionStrings.textSlashplain
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

