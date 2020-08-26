package typings.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyfill extends js.Object {
  var Blob: PolyfillBlob = js.native
  var Event: PolyfillEvent = js.native
  var Fetch: PolyfillFetch = js.native
  var File: PolyfillFile = js.native
  var FileReader: PolyfillFileReader = js.native
  var ProgressEvent: PolyfillProgressEvent = js.native
  var XMLHttpRequest: PolyfillXMLHttpRequest = js.native
}

object Polyfill {
  @scala.inline
  def apply(
    Blob: PolyfillBlob,
    Event: PolyfillEvent,
    Fetch: PolyfillFetch,
    File: PolyfillFile,
    FileReader: PolyfillFileReader,
    ProgressEvent: PolyfillProgressEvent,
    XMLHttpRequest: PolyfillXMLHttpRequest
  ): Polyfill = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileReader = FileReader.asInstanceOf[js.Any], ProgressEvent = ProgressEvent.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyfill]
  }
  @scala.inline
  implicit class PolyfillOps[Self <: Polyfill] (val x: Self) extends AnyVal {
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
    def setBlob(value: PolyfillBlob): Self = this.set("Blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: PolyfillEvent): Self = this.set("Event", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetch(value: PolyfillFetch): Self = this.set("Fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: PolyfillFile): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileReader(value: PolyfillFileReader): Self = this.set("FileReader", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressEvent(value: PolyfillProgressEvent): Self = this.set("ProgressEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setXMLHttpRequest(value: PolyfillXMLHttpRequest): Self = this.set("XMLHttpRequest", value.asInstanceOf[js.Any])
  }
  
}

