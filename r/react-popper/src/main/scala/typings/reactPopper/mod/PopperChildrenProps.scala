package typings.reactPopper.mod

import typings.popperJs.mod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var ref: Ref[_]
  var style: CSSProperties
  def scheduleUpdate(): Unit
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    outOfBoundaries: Boolean = null.asInstanceOf[Boolean],
    ref: Ref[_] = null
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], outOfBoundaries = outOfBoundaries.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperChildrenProps]
  }
}

