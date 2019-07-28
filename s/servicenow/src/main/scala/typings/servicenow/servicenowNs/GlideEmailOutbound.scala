package typings.servicenow.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideEmailOutbound extends js.Object {
  def addAddress(`type`: String, address: String, displayName: String): Unit
  def getSubject(): String
  def setBody(bodyText: String): Unit
  def setFrom(address: String): Unit
  def setReplyTo(address: String): Unit
  def setSubject(subject: String): Unit
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
}

