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
    cancel: /* reason */ js.Any => Unit | js.Thenable[Unit] = null,
    pull: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit] = null,
    start: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit] = null
  ): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
}

