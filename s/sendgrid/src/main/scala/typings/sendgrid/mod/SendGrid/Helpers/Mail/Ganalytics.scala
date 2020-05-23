package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Utmcampaign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ganalytics extends js.Object {
  def getContent(): String
  def getEnable(): Boolean
  def getUrmMedium(): String
  def getUrmTerm(): String
  def getUtmCampaign(): String
  def getUtmSource(): String
  def setContent(content: String): Unit
  def setEnable(enabled: Boolean): Unit
  def setUrmMedium(medium: String): Unit
  def setUrmTerm(term: String): Unit
  def setUtmCampaign(campaign: String): Unit
  def setUtmSource(source: String): Unit
  def toJSON(): Utmcampaign
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
}

