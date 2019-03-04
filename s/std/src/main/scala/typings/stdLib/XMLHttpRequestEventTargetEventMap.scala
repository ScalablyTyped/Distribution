package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: ProgressEvent
  var error: ProgressEvent
  var load: ProgressEvent
  var loadend: ProgressEvent
  var loadstart: ProgressEvent
  var progress: ProgressEvent
  var timeout: ProgressEvent
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent,
    timeout: ProgressEvent
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

