package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.componentsSliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ trait TwoHandleSliderProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var fill: js.UndefOr[SliderFillProps] = js.undefined
  var initialEnd: js.UndefOr[scala.Double] = js.undefined
  var initialStart: js.UndefOr[scala.Double] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isVertical: js.UndefOr[scala.Boolean] = js.undefined
  var maxHandle: js.UndefOr[SliderHandleProps] = js.undefined
  var minHandle: js.UndefOr[SliderHandleProps] = js.undefined
}

object TwoHandleSliderProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    SliderCommonProps: SliderCommonProps = null,
    fill: SliderFillProps = null,
    initialEnd: scala.Int | scala.Double = null,
    initialStart: scala.Int | scala.Double = null,
    maxHandle: SliderHandleProps = null,
    minHandle: SliderHandleProps = null
  ): TwoHandleSliderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, SliderCommonProps)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (initialEnd != null) __obj.updateDynamic("initialEnd")(initialEnd.asInstanceOf[js.Any])
    if (initialStart != null) __obj.updateDynamic("initialStart")(initialStart.asInstanceOf[js.Any])
    if (maxHandle != null) __obj.updateDynamic("maxHandle")(maxHandle)
    if (minHandle != null) __obj.updateDynamic("minHandle")(minHandle)
    __obj.asInstanceOf[TwoHandleSliderProps]
  }
}

