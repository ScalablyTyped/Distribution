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

