package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleProps extends CommonApiProps {
  /**
    * Class name
    */
  @JSName("className")
  var className_HandleProps: java.lang.String
  /**
    * Styling option offset
    */
  var offset: scala.Double
  /**
    * Styling if true, then bottom: {offset} else left: {offset}
    * @default False
    */
  @JSName("vertical")
  var vertical_HandleProps: scala.Boolean
}

object HandleProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    offset: scala.Double,
    vertical: scala.Boolean,
    activeDotStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    handle: js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode] = null,
    handleStyle: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    marks: Marks = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    railStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    step: scala.Int | scala.Double = null,
    style: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    tipFormatter: js.Function1[/* value */ js.Any, js.UndefOr[_]] = null,
    tipTransitionName: java.lang.String = null,
    trackStyle: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null
  ): HandleProps = {
    val __obj = js.Dynamic.literal(className = className, offset = offset, vertical = vertical)
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(tipFormatter)
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleProps]
  }
}

