package typings.slackMock.mod

import typings.ws.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RtmCall[T] extends js.Object {
  var message: T
  var rawMessage: Data
  var token: String
}

object RtmCall {
  @scala.inline
  def apply[T](message: T, rawMessage: Data, token: String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RtmCall[T]]
  }
}

