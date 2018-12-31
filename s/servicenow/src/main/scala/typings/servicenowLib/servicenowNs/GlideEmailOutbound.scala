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

