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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

