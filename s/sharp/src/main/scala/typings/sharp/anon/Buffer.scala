package typings.sharp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: Boolean
  var file: Boolean
  var stream: Boolean
}

object Buffer {
  @scala.inline
  def apply(buffer: Boolean, file: Boolean, stream: Boolean): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

