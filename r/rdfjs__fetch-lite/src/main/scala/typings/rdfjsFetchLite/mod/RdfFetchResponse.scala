package typings.rdfjsFetchLite.mod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Stream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.Response
import typings.std.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdfFetchResponse[Q /* <: BaseQuad */] extends Response {
  def quadStream(): js.Promise[Stream[Q]] = js.native
}

object RdfFetchResponse {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.BaseQuad */ Q](
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    quadStream: () => js.Promise[Stream[Q]],
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String
  ): RdfFetchResponse[Q] = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdfFetchResponse[Q]]
  }
  @scala.inline
  implicit class RdfFetchResponseOps[Self <: RdfFetchResponse[_], /* <: typings.rdfJs.mod.BaseQuad */ Q] (val x: Self with RdfFetchResponse[Q]) extends AnyVal {
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
    def setQuadStream(value: () => js.Promise[Stream[Q]]): Self = this.set("quadStream", js.Any.fromFunction0(value))
  }
  
}

