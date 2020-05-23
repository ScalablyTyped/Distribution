package typings.rdflib.fetcherMod

import typings.rdflib.tfTypesMod.QuadSubject
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.Response
import typings.std.ResponseType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An extended interface of Response, since RDFlib.js adds some properties. */
trait ExtendedResponse extends Response {
  /** Used in UpdateManager.updateDav */
  var error: js.UndefOr[String] = js.undefined
  /** Identifier of the reqest */
  var req: js.UndefOr[QuadSubject] = js.undefined
  /** String representation of the Body */
  var responseText: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
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
    url: String,
    body: ReadableStream[Uint8Array] = null,
    error: String = null,
    req: QuadSubject = null,
    responseText: String = null,
    size: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ExtendedResponse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedResponse]
  }
}

