package typings.siema.siemaMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiemaOptions extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var multipleDrag: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var perPage: js.UndefOr[Double | PageInterface] = js.undefined
  var selector: js.UndefOr[String | HTMLElement] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object SiemaOptions {
  @scala.inline
  def apply(
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    multipleDrag: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    onInit: () => Unit = null,
    perPage: Double | PageInterface = null,
    selector: String | HTMLElement = null,
    startIndex: Int | Double = null,
    threshold: Int | Double = null
  ): SiemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleDrag)) __obj.updateDynamic("multipleDrag")(multipleDrag.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiemaOptions]
  }
}

