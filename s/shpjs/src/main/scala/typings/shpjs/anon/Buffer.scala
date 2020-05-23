package typings.shpjs.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: ArrayBuffer
}

object Buffer {
  @scala.inline
  def apply(buffer: ArrayBuffer): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

