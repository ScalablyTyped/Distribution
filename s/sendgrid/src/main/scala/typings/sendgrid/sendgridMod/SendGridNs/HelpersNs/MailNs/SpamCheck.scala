package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import typings.sendgrid.Anon_EnablePosttourl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamCheck extends js.Object {
  def getEnable(): Boolean
  def getPosttoUrl(): String
  def getThreshold(): Double
  def setEnable(enabled: Boolean): Unit
  def setPosttoUrl(post_to_url: String): Unit
  def setThreshold(threshold: Double): Unit
  def toJSON(): Anon_EnablePosttourl
}

object SpamCheck {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getPosttoUrl: () => String,
    getThreshold: () => Double,
    setEnable: Boolean => Unit,
    setPosttoUrl: String => Unit,
    setThreshold: Double => Unit,
    toJSON: () => Anon_EnablePosttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SpamCheck]
  }
}

