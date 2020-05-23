package typings.signaturePad.anon

import typings.std.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* error */ js.UndefOr[ErrorEvent], Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Callback {
  @scala.inline
  def apply(
    callback: /* error */ js.UndefOr[ErrorEvent] => Unit = null,
    height: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

