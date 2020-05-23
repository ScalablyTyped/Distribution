package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: Event
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent[XMLHttpRequestEventTarget],
    error: ProgressEvent[XMLHttpRequestEventTarget],
    load: ProgressEvent[XMLHttpRequestEventTarget],
    loadend: ProgressEvent[XMLHttpRequestEventTarget],
    loadstart: ProgressEvent[XMLHttpRequestEventTarget],
    progress: ProgressEvent[XMLHttpRequestEventTarget],
    readystatechange: Event,
    timeout: ProgressEvent[XMLHttpRequestEventTarget]
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

