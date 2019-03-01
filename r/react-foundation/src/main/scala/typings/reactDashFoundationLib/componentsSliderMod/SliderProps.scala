package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.componentsSliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ trait SliderProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var fill: js.UndefOr[SliderFillProps] = js.undefined
  var handle: js.UndefOr[SliderHandleProps] = js.undefined
  var initialStart: js.UndefOr[scala.Double] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isVertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    SliderCommonProps: SliderCommonProps = null,
    fill: SliderFillProps = null,
    handle: SliderHandleProps = null,
    initialStart: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, SliderCommonProps)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (initialStart != null) __obj.updateDynamic("initialStart")(initialStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

