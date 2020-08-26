package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends Object
     with Body {
  val headers: Headers = js.native
  val ok: Boolean = js.native
  val redirected: Boolean = js.native
  val status: Double = js.native
  val statusText: String = js.native
  val `type`: ResponseType = js.native
  val url: String = js.native
}

object Response {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    constructor: js.Function,
    formData: () => js.Promise[FormData],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    `type`: ResponseType,
    url: String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirected(value: Boolean): Self = this.set("redirected", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ResponseType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

