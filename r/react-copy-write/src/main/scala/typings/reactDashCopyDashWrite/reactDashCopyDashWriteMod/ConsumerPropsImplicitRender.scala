package typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsImplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var children: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsImplicitRender {
  @scala.inline
  def apply[T](children: RenderFn[T] = null, select: js.Array[SelectorFn[T]] = null): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
}

