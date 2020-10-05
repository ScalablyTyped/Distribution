package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderStream
  extends GenericTransformStream
     with TextEncoderCommon {
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[Uint8Array] = js.native
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String] = js.native
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
  @scala.inline
  implicit class TextEncoderStreamOps[Self <: TextEncoderStream] (val x: Self) extends AnyVal {
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
    def setReadable(value: ReadableStream[Uint8Array]): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: WritableStream[java.lang.String]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}

