package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledDone extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fixedContent: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.undefined
  var onPull: js.UndefOr[js.Function0[Unit]] = js.undefined
  var thresholdHeight: js.UndefOr[Double] = js.undefined
}

object Anon_DisabledDone {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    fixedContent: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onChange: /* e */ PullHookChangeEvent => Unit = null,
    onLoad: /* done */ js.Function0[Unit] => Unit = null,
    onPull: () => Unit = null,
    thresholdHeight: Int | Double = null
  ): Anon_DisabledDone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fixedContent)) __obj.updateDynamic("fixedContent")(fixedContent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPull != null) __obj.updateDynamic("onPull")(js.Any.fromFunction0(onPull))
    if (thresholdHeight != null) __obj.updateDynamic("thresholdHeight")(thresholdHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisabledDone]
  }
}

