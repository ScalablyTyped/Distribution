package typings
package reactDashCopyDashWriteLib.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsImplicitRender[T] extends ConsumerPropsBase[T] {
  var children: js.UndefOr[reactDashCopyDashWriteLib.RenderFn[T]] = js.undefined
}

object ConsumerPropsImplicitRender {
  @scala.inline
  def apply[T](
    children: reactDashCopyDashWriteLib.RenderFn[T] = null,
    select: js.Array[reactDashCopyDashWriteLib.SelectorFn[T]] = null
  ): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
}

