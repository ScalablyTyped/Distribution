package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRequestPayload extends js.Object {
  var password: java.lang.String
  var requestedSequenceNumber: scala.Double
  var requestedSession: java.lang.String
  var username: java.lang.String
}

object LoginRequestPayload {
  @scala.inline
  def apply(
    password: java.lang.String,
    requestedSequenceNumber: scala.Double,
    requestedSession: java.lang.String,
    username: java.lang.String
  ): LoginRequestPayload = {
    val __obj = js.Dynamic.literal(password = password, requestedSequenceNumber = requestedSequenceNumber, requestedSession = requestedSession, username = username)
  
    __obj.asInstanceOf[LoginRequestPayload]
  }
}

