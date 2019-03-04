package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: reactLib.Event
  var error: reactLib.Event
  var load: reactLib.Event
  var loadend: reactLib.Event
  var loadstart: reactLib.Event
  var progress: reactLib.Event
  var timeout: reactLib.Event
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: reactLib.Event,
    error: reactLib.Event,
    load: reactLib.Event,
    loadend: reactLib.Event,
    loadstart: reactLib.Event,
    progress: reactLib.Event,
    timeout: reactLib.Event
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

