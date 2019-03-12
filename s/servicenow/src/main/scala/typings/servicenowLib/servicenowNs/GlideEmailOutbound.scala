package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideEmailOutbound extends js.Object {
  def addAddress(`type`: java.lang.String, address: java.lang.String, displayName: java.lang.String): scala.Unit
  def getSubject(): java.lang.String
  def setBody(bodyText: java.lang.String): scala.Unit
  def setFrom(address: java.lang.String): scala.Unit
  def setReplyTo(address: java.lang.String): scala.Unit
  def setSubject(subject: java.lang.String): scala.Unit
}

object GlideEmailOutbound {
  @scala.inline
  def apply(
    addAddress: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    getSubject: () => java.lang.String,
    setBody: java.lang.String => scala.Unit,
    setFrom: java.lang.String => scala.Unit,
    setReplyTo: java.lang.String => scala.Unit,
    setSubject: java.lang.String => scala.Unit
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal(addAddress = js.Any.fromFunction3(addAddress), getSubject = js.Any.fromFunction0(getSubject), setBody = js.Any.fromFunction1(setBody), setFrom = js.Any.fromFunction1(setFrom), setReplyTo = js.Any.fromFunction1(setReplyTo), setSubject = js.Any.fromFunction1(setSubject))
  
    __obj.asInstanceOf[GlideEmailOutbound]
  }
}

