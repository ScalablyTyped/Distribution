package typings.reactDashPopper.reactDashPopperMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProps extends js.Object {
  var innerRef: js.UndefOr[RefHandler] = js.undefined
  def children(props: ReferenceChildrenProps): ReactNode
}

object ReferenceProps {
  @scala.inline
  def apply(children: ReferenceChildrenProps => ReactNode, innerRef: RefHandler = null): ReferenceProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    __obj.asInstanceOf[ReferenceProps]
  }
}

