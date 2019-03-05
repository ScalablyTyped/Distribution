package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReaderEventMap extends js.Object {
  var abort: ProgressEvent
  var error: ProgressEvent
  var load: ProgressEvent
  var loadend: ProgressEvent
  var loadstart: ProgressEvent
  var progress: ProgressEvent
}

object FileReaderEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress)
  
    __obj.asInstanceOf[FileReaderEventMap]
  }
}

