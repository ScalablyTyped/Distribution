package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingSource[R] extends js.Object {
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}

object UnderlyingSource {
  @scala.inline
  def apply[R](
    cancel: ReadableStreamErrorCallback = null,
    pull: ReadableStreamDefaultControllerCallback[R] = null,
    start: ReadableStreamDefaultControllerCallback[R] = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (start != null) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
}

