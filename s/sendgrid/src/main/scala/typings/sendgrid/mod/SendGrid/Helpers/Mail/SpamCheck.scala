package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Posttourl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpamCheck extends js.Object {
  def getEnable(): Boolean = js.native
  def getPosttoUrl(): String = js.native
  def getThreshold(): Double = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setPosttoUrl(post_to_url: String): Unit = js.native
  def setThreshold(threshold: Double): Unit = js.native
  def toJSON(): Posttourl = js.native
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
    toJSON: () => Posttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SpamCheck]
  }
  @scala.inline
  implicit class SpamCheckOps[Self <: SpamCheck] (val x: Self) extends AnyVal {
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
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosttoUrl(value: () => String): Self = this.set("getPosttoUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetThreshold(value: () => Double): Self = this.set("getThreshold", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosttoUrl(value: String => Unit): Self = this.set("setPosttoUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetThreshold(value: Double => Unit): Self = this.set("setThreshold", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => Posttourl): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

