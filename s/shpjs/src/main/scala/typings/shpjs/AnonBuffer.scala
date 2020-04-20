package typings.shpjs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: ArrayBuffer
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: ArrayBuffer): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

