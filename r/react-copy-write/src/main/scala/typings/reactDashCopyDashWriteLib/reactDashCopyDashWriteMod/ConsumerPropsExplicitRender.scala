package typings
package reactDashCopyDashWriteLib.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsExplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var render: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsExplicitRender {
  @scala.inline
  def apply[T](render: RenderFn[T] = null, select: js.Array[SelectorFn[T]] = null): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(render)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
}

