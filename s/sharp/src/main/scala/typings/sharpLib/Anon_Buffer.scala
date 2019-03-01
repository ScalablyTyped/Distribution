package typings
package sharpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: scala.Boolean
  var file: scala.Boolean
  var stream: scala.Boolean
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: scala.Boolean, file: scala.Boolean, stream: scala.Boolean): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

