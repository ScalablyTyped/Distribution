package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Utmcampaign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ganalytics extends js.Object {
  def getContent(): String = js.native
  def getEnable(): Boolean = js.native
  def getUrmMedium(): String = js.native
  def getUrmTerm(): String = js.native
  def getUtmCampaign(): String = js.native
  def getUtmSource(): String = js.native
  def setContent(content: String): Unit = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setUrmMedium(medium: String): Unit = js.native
  def setUrmTerm(term: String): Unit = js.native
  def setUtmCampaign(campaign: String): Unit = js.native
  def setUtmSource(source: String): Unit = js.native
  def toJSON(): Utmcampaign = js.native
}

object Ganalytics {
  @scala.inline
  def apply(
    getContent: () => String,
    getEnable: () => Boolean,
    getUrmMedium: () => String,
    getUrmTerm: () => String,
    getUtmCampaign: () => String,
    getUtmSource: () => String,
    setContent: String => Unit,
    setEnable: Boolean => Unit,
    setUrmMedium: String => Unit,
    setUrmTerm: String => Unit,
    setUtmCampaign: String => Unit,
    setUtmSource: String => Unit,
    toJSON: () => Utmcampaign
  ): Ganalytics = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getEnable = js.Any.fromFunction0(getEnable), getUrmMedium = js.Any.fromFunction0(getUrmMedium), getUrmTerm = js.Any.fromFunction0(getUrmTerm), getUtmCampaign = js.Any.fromFunction0(getUtmCampaign), getUtmSource = js.Any.fromFunction0(getUtmSource), setContent = js.Any.fromFunction1(setContent), setEnable = js.Any.fromFunction1(setEnable), setUrmMedium = js.Any.fromFunction1(setUrmMedium), setUrmTerm = js.Any.fromFunction1(setUrmTerm), setUtmCampaign = js.Any.fromFunction1(setUtmCampaign), setUtmSource = js.Any.fromFunction1(setUtmSource), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Ganalytics]
  }
  @scala.inline
  implicit class GanalyticsOps[Self <: Ganalytics] (val x: Self) extends AnyVal {
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
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUrmMedium(value: () => String): Self = this.set("getUrmMedium", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUrmTerm(value: () => String): Self = this.set("getUrmTerm", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUtmCampaign(value: () => String): Self = this.set("getUtmCampaign", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUtmSource(value: () => String): Self = this.set("getUtmSource", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrmMedium(value: String => Unit): Self = this.set("setUrmMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrmTerm(value: String => Unit): Self = this.set("setUrmTerm", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUtmCampaign(value: String => Unit): Self = this.set("setUtmCampaign", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUtmSource(value: String => Unit): Self = this.set("setUtmSource", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => Utmcampaign): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

