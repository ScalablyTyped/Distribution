package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITunesParameters extends js.Object {
  def setAffiliateToken(affiliateToken: String): DynamicLink
  def setCampaignToken(campaignToken: String): DynamicLink
  def setProviderToken(providerToken: String): DynamicLink
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
}

