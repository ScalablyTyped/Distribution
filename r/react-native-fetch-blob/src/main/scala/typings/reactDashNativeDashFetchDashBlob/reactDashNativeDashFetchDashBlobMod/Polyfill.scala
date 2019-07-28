package typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyfill extends js.Object {
  var Blob: PolyfillBlob
  var Event: PolyfillEvent
  var Fetch: PolyfillFetch
  var File: PolyfillFile
  var FileReader: PolyfillFileReader
  var ProgressEvent: PolyfillProgressEvent
  var XMLHttpRequest: PolyfillXMLHttpRequest
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
    val __obj = js.Dynamic.literal(Blob = Blob, Event = Event, Fetch = Fetch, File = File, FileReader = FileReader, ProgressEvent = ProgressEvent, XMLHttpRequest = XMLHttpRequest)
  
    __obj.asInstanceOf[Polyfill]
  }
}

