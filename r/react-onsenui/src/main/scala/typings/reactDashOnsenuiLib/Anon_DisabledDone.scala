package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledDone extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fixedContent: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactDashOnsenuiLib.reactDashOnsenuiMod.PullHookChangeEvent, scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  var onPull: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var thresholdHeight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DisabledDone {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fixedContent: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onChange: js.Function1[/* e */ reactDashOnsenuiLib.reactDashOnsenuiMod.PullHookChangeEvent, scala.Unit] = null,
    onLoad: js.Function1[/* done */ js.Function0[scala.Unit], scala.Unit] = null,
    onPull: js.Function0[scala.Unit] = null,
    thresholdHeight: scala.Int | scala.Double = null
  ): Anon_DisabledDone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fixedContent)) __obj.updateDynamic("fixedContent")(fixedContent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onPull != null) __obj.updateDynamic("onPull")(onPull)
    if (thresholdHeight != null) __obj.updateDynamic("thresholdHeight")(thresholdHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisabledDone]
  }
}

