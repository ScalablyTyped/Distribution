package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: stdLib.Event
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: stdLib.Event,
    error: stdLib.Event,
    load: stdLib.Event,
    loadend: stdLib.Event,
    loadstart: stdLib.Event,
    progress: stdLib.Event,
    readystatechange: stdLib.Event,
    timeout: stdLib.Event
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, readystatechange = readystatechange, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

