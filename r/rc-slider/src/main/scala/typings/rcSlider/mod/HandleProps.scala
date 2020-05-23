package typings.rcSlider.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleProps extends CommonApiProps {
  /**
    * Class name
    */
  @JSName("className")
  var className_HandleProps: String
  /**
    * Styling option offset
    */
  var offset: Double
  /**
    * Set the tabIndex of the slider handle.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * Styling if true, then bottom: {offset} else left: {offset}
    * @default False
    */
  @JSName("vertical")
  var vertical_HandleProps: Boolean
}

object HandleProps {
  @scala.inline
  def apply(
    className: String,
    offset: Double,
    vertical: Boolean,
    activeDotStyle: CSSProperties = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => ReactNode = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Null | Double] = js.undefined,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tipFormatter: js.UndefOr[Null | (/* value */ js.Any => js.UndefOr[_])] = js.undefined,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null
  ): HandleProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tipFormatter)) __obj.updateDynamic("tipFormatter")(if (tipFormatter != null) js.Any.fromFunction1(tipFormatter.asInstanceOf[/* value */ js.Any => js.UndefOr[_]]) else null)
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleProps]
  }
}

