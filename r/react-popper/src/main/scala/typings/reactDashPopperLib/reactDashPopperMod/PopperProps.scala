package typings
package reactDashPopperLib.reactDashPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends js.Object {
  var eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var innerRef: js.UndefOr[reactDashPopperLib.RefHandler] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var positionFixed: js.UndefOr[scala.Boolean] = js.undefined
  var referenceElement: js.UndefOr[popperDotJsLib.popperDotJsMod.ReferenceObject] = js.undefined
  def children(props: PopperChildrenProps): reactLib.reactMod.ReactNs.ReactNode
}

object PopperProps {
  @scala.inline
  def apply(
    children: js.Function1[PopperChildrenProps, reactLib.reactMod.ReactNs.ReactNode],
    eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactDashPopperLib.RefHandler = null,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    placement: popperDotJsLib.popperDotJsMod.Placement = null,
    positionFixed: js.UndefOr[scala.Boolean] = js.undefined,
    referenceElement: popperDotJsLib.popperDotJsMod.ReferenceObject = null
  ): PopperProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed)
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement)
    __obj.asInstanceOf[PopperProps]
  }
}

