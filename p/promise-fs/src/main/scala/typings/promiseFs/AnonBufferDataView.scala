package typings.promiseFs

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferDataView extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object AnonBufferDataView {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): AnonBufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferDataView]
  }
}

