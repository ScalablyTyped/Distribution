package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingSink[W] extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.undefined
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.undefined
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.undefined
}

object UnderlyingSink {
  @scala.inline
  def apply[W](
    abort: WritableStreamErrorCallback = null,
    close: WritableStreamDefaultControllerCloseCallback = null,
    start: WritableStreamDefaultControllerStartCallback = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined,
    write: WritableStreamDefaultControllerWriteCallback[W] = null
  ): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort)
    if (close != null) __obj.updateDynamic("close")(close)
    if (start != null) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
}

