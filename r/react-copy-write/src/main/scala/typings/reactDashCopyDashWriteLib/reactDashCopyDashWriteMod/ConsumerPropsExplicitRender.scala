package typings
package reactDashCopyDashWriteLib.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsExplicitRender[T] extends ConsumerPropsBase[T] {
  var render: js.UndefOr[reactDashCopyDashWriteLib.RenderFn[T]] = js.undefined
}

object ConsumerPropsExplicitRender {
  @scala.inline
  def apply[T](
    render: reactDashCopyDashWriteLib.RenderFn[T] = null,
    select: js.Array[reactDashCopyDashWriteLib.SelectorFn[T]] = null
  ): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(render)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
}

