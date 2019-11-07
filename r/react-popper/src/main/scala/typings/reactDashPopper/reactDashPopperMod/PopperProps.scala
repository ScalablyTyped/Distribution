package typings.reactDashPopper.reactDashPopperMod

import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.popperDotJs.popperDotJsMod.Placement
import typings.popperDotJs.popperDotJsMod.ReferenceObject
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  var referenceElement: js.UndefOr[ReferenceObject] = js.undefined
  def children(props: PopperChildrenProps): ReactNode
}

object PopperProps {
  @scala.inline
  def apply(
    children: PopperChildrenProps => ReactNode,
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] = null,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null
  ): PopperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed)
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement)
    __obj.asInstanceOf[PopperProps]
  }
}

