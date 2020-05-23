package typings.reactPopper.mod

import typings.popperJs.mod.Modifiers
import typings.popperJs.mod.Placement
import typings.popperJs.mod.ReferenceObject
import typings.react.mod.ReactNode
import typings.react.mod.Ref
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
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null
  ): PopperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.get.asInstanceOf[js.Any])
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperProps]
  }
}

