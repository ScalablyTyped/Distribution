package typings.roarr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageType extends js.Object {
  var context: MessageContextType
  var message: String
  var sequence: Double
  var time: Double
  var version: String
}

object MessageType {
  @scala.inline
  def apply(context: MessageContextType, message: String, sequence: Double, time: Double, version: String): MessageType = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
}

