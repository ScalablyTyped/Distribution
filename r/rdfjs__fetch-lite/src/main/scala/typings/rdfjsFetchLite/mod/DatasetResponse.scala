package typings.rdfjsFetchLite.mod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Stream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.ResponseType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends RdfFetchResponse[OutQuad] {
  def dataset(): js.Promise[D]
}

object DatasetResponse {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.DatasetCore[OutQuad, InQuad] */ D, /* <: typings.rdfJs.mod.BaseQuad */ OutQuad, /* <: typings.rdfJs.mod.BaseQuad */ InQuad](
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    dataset: () => js.Promise[D],
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    quadStream: () => js.Promise[Stream[OutQuad]],
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String,
    body: ReadableStream[Uint8Array] = null
  ): DatasetResponse[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = js.Any.fromFunction0(dataset), formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
  }
}

