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
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, readystatechange = readystatechange, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

