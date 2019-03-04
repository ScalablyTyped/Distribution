package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginAcceptedPayload extends js.Object {
  var sequenceNumber: scala.Double
  var username: java.lang.String
}

object LoginAcceptedPayload {
  @scala.inline
  def apply(sequenceNumber: scala.Double, username: java.lang.String): LoginAcceptedPayload = {
    val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber, username = username)
  
    __obj.asInstanceOf[LoginAcceptedPayload]
  }
}

