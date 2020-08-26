package typings.rdflib.fetcherMod

import typings.rdflib.tfTypesMod.QuadSubject
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.Response
import typings.std.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An extended interface of Response, since RDFlib.js adds some properties. */
@js.native
trait ExtendedResponse extends Response {
  /** Used in UpdateManager.updateDav */
  var error: js.UndefOr[String] = js.native
  /** Identifier of the reqest */
  var req: js.UndefOr[QuadSubject] = js.native
  /** String representation of the Body */
  var responseText: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ExtendedResponse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String
  ): ExtendedResponse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedResponse]
  }
  @scala.inline
  implicit class ExtendedResponseOps[Self <: ExtendedResponse] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setReq(value: QuadSubject): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

