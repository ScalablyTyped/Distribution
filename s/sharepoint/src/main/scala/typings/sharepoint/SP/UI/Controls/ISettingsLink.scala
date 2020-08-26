package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISettingsLink extends js.Object {
  var displayName: String = js.native
  var linkUrl: String = js.native
}

object ISettingsLink {
  @scala.inline
  def apply(displayName: String, linkUrl: String): ISettingsLink = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingsLink]
  }
  @scala.inline
  implicit class ISettingsLinkOps[Self <: ISettingsLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkUrl(value: String): Self = this.set("linkUrl", value.asInstanceOf[js.Any])
  }
  
}

