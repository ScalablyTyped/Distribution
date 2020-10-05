package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderStream
  extends GenericTransformStream
     with TextDecoderCommon {
  @JSName("readable")
  val readable_TextDecoderStream: ReadableStream[java.lang.String] = js.native
  @JSName("writable")
  val writable_TextDecoderStream: WritableStream[BufferSource] = js.native
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
  @scala.inline
  implicit class TextDecoderStreamOps[Self <: TextDecoderStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadable(value: ReadableStream[java.lang.String]): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: WritableStream[BufferSource]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}

