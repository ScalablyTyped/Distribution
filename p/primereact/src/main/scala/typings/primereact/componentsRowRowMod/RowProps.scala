package typings.primereact.componentsRowRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(className: String = null, style: js.Object = null): RowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RowProps]
  }
}

