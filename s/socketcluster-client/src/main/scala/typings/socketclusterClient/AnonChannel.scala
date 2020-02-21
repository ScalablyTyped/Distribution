package typings.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel[T] extends js.Object {
  var channel: String
  var data: T
}

object AnonChannel {
  @scala.inline
  def apply[T](channel: String, data: T): AnonChannel[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannel[T]]
  }
}

