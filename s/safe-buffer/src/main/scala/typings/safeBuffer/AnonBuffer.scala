package typings.safeBuffer

import typings.safeBuffer.safeBufferStrings.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var data: js.Array[_]
  var `type`: Buffer
}

object AnonBuffer {
  @scala.inline
  def apply(data: js.Array[_], `type`: Buffer): AnonBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

