package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITunesParameters extends js.Object {
  def setAffiliateToken(affiliateToken: String): DynamicLink = js.native
  def setCampaignToken(campaignToken: String): DynamicLink = js.native
  def setProviderToken(providerToken: String): DynamicLink = js.native
}

object ITunesParameters {
  @scala.inline
  def apply(
    setAffiliateToken: String => DynamicLink,
    setCampaignToken: String => DynamicLink,
    setProviderToken: String => DynamicLink
  ): ITunesParameters = {
    val __obj = js.Dynamic.literal(setAffiliateToken = js.Any.fromFunction1(setAffiliateToken), setCampaignToken = js.Any.fromFunction1(setCampaignToken), setProviderToken = js.Any.fromFunction1(setProviderToken))
    __obj.asInstanceOf[ITunesParameters]
  }
  @scala.inline
  implicit class ITunesParametersOps[Self <: ITunesParameters] (val x: Self) extends AnyVal {
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
    def setSetAffiliateToken(value: String => DynamicLink): Self = this.set("setAffiliateToken", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCampaignToken(value: String => DynamicLink): Self = this.set("setCampaignToken", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProviderToken(value: String => DynamicLink): Self = this.set("setProviderToken", js.Any.fromFunction1(value))
  }
  
}

