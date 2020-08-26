package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  val body: ReadableStream[Uint8Array] | Null = js.native
  val bodyUsed: scala.Boolean = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def formData(): js.Promise[FormData] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[java.lang.String] = js.native
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setBlob(value: () => js.Promise[Blob]): Self = this.set("blob", js.Any.fromFunction0(value))
    @scala.inline
    def setBodyUsed(value: scala.Boolean): Self = this.set("bodyUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormData(value: () => js.Promise[FormData]): Self = this.set("formData", js.Any.fromFunction0(value))
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: () => js.Promise[java.lang.String]): Self = this.set("text", js.Any.fromFunction0(value))
    @scala.inline
    def setBody(value: ReadableStream[Uint8Array]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
  }
  
}

