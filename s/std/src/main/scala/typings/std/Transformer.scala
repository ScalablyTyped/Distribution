package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer[I, O] extends js.Object {
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  var readableType: js.UndefOr[scala.Nothing] = js.undefined
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[I, O]] = js.undefined
  var writableType: js.UndefOr[scala.Nothing] = js.undefined
}

object Transformer {
  @scala.inline
  def apply[I, O](
    flush: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit] = null,
    start: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit] = null,
    transform: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit] = null
  ): Transformer[I, O] = {
    val __obj = js.Dynamic.literal()
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1(flush))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Transformer[I, O]]
  }
}

