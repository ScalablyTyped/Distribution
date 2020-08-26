package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsLink extends ISettingsLink

object SettingsLink {
  @scala.inline
  def apply(displayName: String, linkUrl: String): SettingsLink = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsLink]
  }
}

