package typings.reactDashFoundation.componentsSliderMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.componentsSliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ trait SliderProps extends HTMLAttributes[HTMLDivElement] {
  var fill: js.UndefOr[SliderFillProps] = js.undefined
  var handle: js.UndefOr[SliderHandleProps] = js.undefined
  var initialStart: js.UndefOr[Double] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isVertical: js.UndefOr[Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    fill: SliderFillProps = null,
    handle: SliderHandleProps = null,
    initialStart: Int | Double = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isVertical: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (initialStart != null) __obj.updateDynamic("initialStart")(initialStart.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical)
    __obj.asInstanceOf[SliderProps]
  }
}

