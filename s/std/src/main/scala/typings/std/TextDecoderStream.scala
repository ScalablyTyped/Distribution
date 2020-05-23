package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderStream
  extends GenericTransformStream
     with TextDecoderCommon {
  @JSName("readable")
  val readable_TextDecoderStream: ReadableStream[java.lang.String]
  @JSName("writable")
  val writable_TextDecoderStream: WritableStream[BufferSource]
}

object TextDecoderStream {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    fatal: scala.Boolean,
    ignoreBOM: scala.Boolean,
    readable: ReadableStream[java.lang.String],
    writable: WritableStream[BufferSource]
  ): TextDecoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderStream]
  }
}

