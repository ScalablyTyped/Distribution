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
    flush: TransformStreamDefaultControllerCallback[O] = null,
    readableType: js.UndefOr[scala.Nothing] = js.undefined,
    start: TransformStreamDefaultControllerCallback[O] = null,
    transform: TransformStreamDefaultControllerTransformCallback[I, O] = null,
    writableType: js.UndefOr[scala.Nothing] = js.undefined
  ): Transformer[I, O] = {
    val __obj = js.Dynamic.literal()
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (!js.isUndefined(readableType)) __obj.updateDynamic("readableType")(readableType)
    if (start != null) __obj.updateDynamic("start")(start)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(writableType)) __obj.updateDynamic("writableType")(writableType)
    __obj.asInstanceOf[Transformer[I, O]]
  }
}

