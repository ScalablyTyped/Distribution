package typings.reactPopper.mod

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  def children(props: ReferenceChildrenProps): ReactNode
}

object ReferenceProps {
  @scala.inline
  def apply(children: ReferenceChildrenProps => ReactNode, innerRef: Ref[_] = null): ReferenceProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceProps]
  }
}

