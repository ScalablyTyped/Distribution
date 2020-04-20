package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsParameters extends js.Object {
  def setCampaign(campaign: String): DynamicLink
  def setContent(content: String): DynamicLink
  def setMedium(medium: String): DynamicLink
  def setSource(source: String): DynamicLink
  def setTerm(term: String): DynamicLink
}

object AnalyticsParameters {
  @scala.inline
  def apply(
    setCampaign: String => DynamicLink,
    setContent: String => DynamicLink,
    setMedium: String => DynamicLink,
    setSource: String => DynamicLink,
    setTerm: String => DynamicLink
  ): AnalyticsParameters = {
    val __obj = js.Dynamic.literal(setCampaign = js.Any.fromFunction1(setCampaign), setContent = js.Any.fromFunction1(setContent), setMedium = js.Any.fromFunction1(setMedium), setSource = js.Any.fromFunction1(setSource), setTerm = js.Any.fromFunction1(setTerm))
    __obj.asInstanceOf[AnalyticsParameters]
  }
}

