package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: reactLib.Event
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: reactLib.Event,
    error: reactLib.Event,
    load: reactLib.Event,
    loadend: reactLib.Event,
    loadstart: reactLib.Event,
    progress: reactLib.Event,
    readystatechange: reactLib.Event,
    timeout: reactLib.Event
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, readystatechange = readystatechange, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

