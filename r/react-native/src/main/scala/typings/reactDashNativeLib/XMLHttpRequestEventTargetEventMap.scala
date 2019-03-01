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

