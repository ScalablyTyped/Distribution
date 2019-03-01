package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Blob")(Blob)
    __obj.updateDynamic("Event")(Event)
    __obj.updateDynamic("Fetch")(Fetch)
    __obj.updateDynamic("File")(File)
    __obj.updateDynamic("FileReader")(FileReader)
    __obj.updateDynamic("ProgressEvent")(ProgressEvent)
    __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest)
    __obj.asInstanceOf[Polyfill]
  }
}

