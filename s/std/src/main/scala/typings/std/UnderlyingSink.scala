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
    abort: /* reason */ js.Any => Unit | js.Thenable[Unit] = null,
    close: () => Unit | js.Thenable[Unit] = null,
    start: /* controller */ WritableStreamDefaultController => Unit | js.Thenable[Unit] = null,
    write: (W, /* controller */ WritableStreamDefaultController) => Unit | js.Thenable[Unit] = null
  ): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
}

