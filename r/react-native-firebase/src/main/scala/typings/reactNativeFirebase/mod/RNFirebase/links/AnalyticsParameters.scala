package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsParameters extends js.Object {
  def setCampaign(campaign: String): DynamicLink = js.native
  def setContent(content: String): DynamicLink = js.native
  def setMedium(medium: String): DynamicLink = js.native
  def setSource(source: String): DynamicLink = js.native
  def setTerm(term: String): DynamicLink = js.native
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
  @scala.inline
  implicit class AnalyticsParametersOps[Self <: AnalyticsParameters] (val x: Self) extends AnyVal {
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
    def setSetCampaign(value: String => DynamicLink): Self = this.set("setCampaign", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContent(value: String => DynamicLink): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMedium(value: String => DynamicLink): Self = this.set("setMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSource(value: String => DynamicLink): Self = this.set("setSource", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTerm(value: String => DynamicLink): Self = this.set("setTerm", js.Any.fromFunction1(value))
  }
  
}

