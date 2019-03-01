package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: reactLib.Event
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: reactLib.Event,
    error: reactLib.Event,
    load: reactLib.Event,
    loadend: reactLib.Event,
    loadstart: reactLib.Event,
    progress: reactLib.Event,
    readystatechange: reactLib.Event,
    timeout: reactLib.Event
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("readystatechange")(readystatechange)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

