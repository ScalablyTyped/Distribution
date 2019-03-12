package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: stdLib.Event
  var error: stdLib.Event
  var load: stdLib.Event
  var loadend: stdLib.Event
  var loadstart: stdLib.Event
  var progress: stdLib.Event
  var timeout: stdLib.Event
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: stdLib.Event,
    error: stdLib.Event,
    load: stdLib.Event,
    loadend: stdLib.Event,
    loadstart: stdLib.Event,
    progress: stdLib.Event,
    timeout: stdLib.Event
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

