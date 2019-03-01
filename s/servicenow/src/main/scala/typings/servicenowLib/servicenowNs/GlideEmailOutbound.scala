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
    addAddress: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    getSubject: js.Function0[java.lang.String],
    setBody: js.Function1[java.lang.String, scala.Unit],
    setFrom: js.Function1[java.lang.String, scala.Unit],
    setReplyTo: js.Function1[java.lang.String, scala.Unit],
    setSubject: js.Function1[java.lang.String, scala.Unit]
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAddress")(addAddress)
    __obj.updateDynamic("getSubject")(getSubject)
    __obj.updateDynamic("setBody")(setBody)
    __obj.updateDynamic("setFrom")(setFrom)
    __obj.updateDynamic("setReplyTo")(setReplyTo)
    __obj.updateDynamic("setSubject")(setSubject)
    __obj.asInstanceOf[GlideEmailOutbound]
  }
}

