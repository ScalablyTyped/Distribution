package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ganalytics extends js.Object {
  def getContent(): java.lang.String
  def getEnable(): scala.Boolean
  def getUrmMedium(): java.lang.String
  def getUrmTerm(): java.lang.String
  def getUtmCampaign(): java.lang.String
  def getUtmSource(): java.lang.String
  def setContent(content: java.lang.String): scala.Unit
  def setEnable(enabled: scala.Boolean): scala.Unit
  def setUrmMedium(medium: java.lang.String): scala.Unit
  def setUrmTerm(term: java.lang.String): scala.Unit
  def setUtmCampaign(campaign: java.lang.String): scala.Unit
  def setUtmSource(source: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_EnableUtmcampaign
}

object Ganalytics {
  @scala.inline
  def apply(
    getContent: () => java.lang.String,
    getEnable: () => scala.Boolean,
    getUrmMedium: () => java.lang.String,
    getUrmTerm: () => java.lang.String,
    getUtmCampaign: () => java.lang.String,
    getUtmSource: () => java.lang.String,
    setContent: java.lang.String => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setUrmMedium: java.lang.String => scala.Unit,
    setUrmTerm: java.lang.String => scala.Unit,
    setUtmCampaign: java.lang.String => scala.Unit,
    setUtmSource: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_EnableUtmcampaign
  ): Ganalytics = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getEnable = js.Any.fromFunction0(getEnable), getUrmMedium = js.Any.fromFunction0(getUrmMedium), getUrmTerm = js.Any.fromFunction0(getUrmTerm), getUtmCampaign = js.Any.fromFunction0(getUtmCampaign), getUtmSource = js.Any.fromFunction0(getUtmSource), setContent = js.Any.fromFunction1(setContent), setEnable = js.Any.fromFunction1(setEnable), setUrmMedium = js.Any.fromFunction1(setUrmMedium), setUrmTerm = js.Any.fromFunction1(setUrmTerm), setUtmCampaign = js.Any.fromFunction1(setUtmCampaign), setUtmSource = js.Any.fromFunction1(setUtmSource), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Ganalytics]
  }
}

