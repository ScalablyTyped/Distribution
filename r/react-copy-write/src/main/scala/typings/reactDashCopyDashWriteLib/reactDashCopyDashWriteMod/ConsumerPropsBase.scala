package typings
package reactDashCopyDashWriteLib.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsBase[T] extends js.Object {
  var select: js.UndefOr[js.Array[reactDashCopyDashWriteLib.SelectorFn[T]]] = js.undefined
}

object ConsumerPropsBase {
  @scala.inline
  def apply[T](select: js.Array[reactDashCopyDashWriteLib.SelectorFn[T]] = null): ConsumerPropsBase[T] = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ConsumerPropsBase[T]]
  }
}

