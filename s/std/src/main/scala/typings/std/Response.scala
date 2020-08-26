package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents the response to a request. */
@js.native
trait Response extends Body {
  val headers: Headers = js.native
  val ok: scala.Boolean = js.native
  val redirected: scala.Boolean = js.native
  val status: Double = js.native
  val statusText: java.lang.String = js.native
  val trailer: js.Promise[Headers] = js.native
  val `type`: ResponseType = js.native
  val url: java.lang.String = js.native
}

object Response {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: scala.Boolean,
    redirected: scala.Boolean,
    status: Double,
    statusText: java.lang.String,
    text: () => js.Promise[java.lang.String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: scala.Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirected(value: scala.Boolean): Self = this.set("redirected", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: java.lang.String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailer(value: js.Promise[Headers]): Self = this.set("trailer", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ResponseType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

