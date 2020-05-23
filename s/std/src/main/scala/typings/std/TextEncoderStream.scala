package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderStream
  extends GenericTransformStream
     with TextEncoderCommon {
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[Uint8Array]
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String]
}

object TextEncoderStream {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    readable: ReadableStream[Uint8Array],
    writable: WritableStream[java.lang.String]
  ): TextEncoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderStream]
  }
}

