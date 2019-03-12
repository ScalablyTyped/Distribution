package typings
package siemaLib.siemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiemaOptions extends js.Object {
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var multipleDrag: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var perPage: js.UndefOr[scala.Double | PageInterface] = js.undefined
  var selector: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object SiemaOptions {
  @scala.inline
  def apply(
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    multipleDrag: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: () => scala.Unit = null,
    onInit: () => scala.Unit = null,
    perPage: scala.Double | PageInterface = null,
    selector: java.lang.String | stdLib.HTMLElement = null,
    startIndex: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null
  ): SiemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(multipleDrag)) __obj.updateDynamic("multipleDrag")(multipleDrag)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiemaOptions]
  }
}

