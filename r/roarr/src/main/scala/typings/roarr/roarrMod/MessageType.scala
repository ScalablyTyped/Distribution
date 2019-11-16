package typings.roarr.roarrMod

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
    val __obj = js.Dynamic.literal(context = context, message = message, sequence = sequence, time = time, version = version)
  
    __obj.asInstanceOf[MessageType]
  }
}

