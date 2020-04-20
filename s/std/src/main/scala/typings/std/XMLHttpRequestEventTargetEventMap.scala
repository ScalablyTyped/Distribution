package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: ProgressEvent[XMLHttpRequestEventTarget]
  var error: ProgressEvent[XMLHttpRequestEventTarget]
  var load: ProgressEvent[XMLHttpRequestEventTarget]
  var loadend: ProgressEvent[XMLHttpRequestEventTarget]
  var loadstart: ProgressEvent[XMLHttpRequestEventTarget]
  var progress: ProgressEvent[XMLHttpRequestEventTarget]
  var timeout: ProgressEvent[XMLHttpRequestEventTarget]
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent[XMLHttpRequestEventTarget],
    error: ProgressEvent[XMLHttpRequestEventTarget],
    load: ProgressEvent[XMLHttpRequestEventTarget],
    loadend: ProgressEvent[XMLHttpRequestEventTarget],
    loadstart: ProgressEvent[XMLHttpRequestEventTarget],
    progress: ProgressEvent[XMLHttpRequestEventTarget],
    timeout: ProgressEvent[XMLHttpRequestEventTarget]
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

