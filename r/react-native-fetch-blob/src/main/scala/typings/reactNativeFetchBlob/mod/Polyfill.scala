package typings.reactNativeFetchBlob.mod

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
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileReader = FileReader.asInstanceOf[js.Any], ProgressEvent = ProgressEvent.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyfill]
  }
}

