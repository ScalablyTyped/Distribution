package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideEmailOutbound extends js.Object {
  def addAddress(`type`: String, address: String, displayName: String): Unit = js.native
  def getSubject(): String = js.native
  def setBody(bodyText: String): Unit = js.native
  def setFrom(address: String): Unit = js.native
  def setReplyTo(address: String): Unit = js.native
  def setSubject(subject: String): Unit = js.native
}

object GlideEmailOutbound {
  @scala.inline
  def apply(
    addAddress: (String, String, String) => Unit,
    getSubject: () => String,
    setBody: String => Unit,
    setFrom: String => Unit,
    setReplyTo: String => Unit,
    setSubject: String => Unit
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal(addAddress = js.Any.fromFunction3(addAddress), getSubject = js.Any.fromFunction0(getSubject), setBody = js.Any.fromFunction1(setBody), setFrom = js.Any.fromFunction1(setFrom), setReplyTo = js.Any.fromFunction1(setReplyTo), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[GlideEmailOutbound]
  }
  @scala.inline
  implicit class GlideEmailOutboundOps[Self <: GlideEmailOutbound] (val x: Self) extends AnyVal {
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
    def setAddAddress(value: (String, String, String) => Unit): Self = this.set("addAddress", js.Any.fromFunction3(value))
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBody(value: String => Unit): Self = this.set("setBody", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFrom(value: String => Unit): Self = this.set("setFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setSetReplyTo(value: String => Unit): Self = this.set("setReplyTo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
  }
  
}

