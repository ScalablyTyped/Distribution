package typings.reactNativeAppsflyer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteLinkOptions extends js.Object {
  var baseDeeplink: js.UndefOr[String] = js.native
  var campaign: js.UndefOr[String] = js.native
  var channel: js.UndefOr[String] = js.native
  var customerID: js.UndefOr[String] = js.native
  var deeplinkPath: js.UndefOr[String] = js.native
  var referrerImageUrl: js.UndefOr[String] = js.native
  var referrerName: js.UndefOr[String] = js.native
  var userParams: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object InviteLinkOptions {
  @scala.inline
  def apply(): InviteLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteLinkOptions]
  }
  @scala.inline
  implicit class InviteLinkOptionsOps[Self <: InviteLinkOptions] (val x: Self) extends AnyVal {
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
    def setBaseDeeplink(value: String): Self = this.set("baseDeeplink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDeeplink: Self = this.set("baseDeeplink", js.undefined)
    @scala.inline
    def setCampaign(value: String): Self = this.set("campaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaign: Self = this.set("campaign", js.undefined)
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setCustomerID(value: String): Self = this.set("customerID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerID: Self = this.set("customerID", js.undefined)
    @scala.inline
    def setDeeplinkPath(value: String): Self = this.set("deeplinkPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeeplinkPath: Self = this.set("deeplinkPath", js.undefined)
    @scala.inline
    def setReferrerImageUrl(value: String): Self = this.set("referrerImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerImageUrl: Self = this.set("referrerImageUrl", js.undefined)
    @scala.inline
    def setReferrerName(value: String): Self = this.set("referrerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerName: Self = this.set("referrerName", js.undefined)
    @scala.inline
    def setUserParams(value: StringDictionary[js.Any]): Self = this.set("userParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserParams: Self = this.set("userParams", js.undefined)
  }
  
}

