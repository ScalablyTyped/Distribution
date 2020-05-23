package typings.safeBuffer.anon

import typings.safeBuffer.safeBufferStrings.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[_]
  var `type`: Buffer
}

object Data {
  @scala.inline
  def apply(data: js.Array[_], `type`: Buffer): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

