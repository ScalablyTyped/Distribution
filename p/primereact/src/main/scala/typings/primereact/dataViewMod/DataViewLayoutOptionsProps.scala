package typings.primereact.dataViewMod

import typings.primereact.AnonOriginalEventValueEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewLayoutOptionsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  def onChange(e: AnonOriginalEventValueEvent): Unit
}

object DataViewLayoutOptionsProps {
  @scala.inline
  def apply(
    onChange: AnonOriginalEventValueEvent => Unit,
    className: String = null,
    id: String = null,
    layout: String = null,
    style: String = null
  ): DataViewLayoutOptionsProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewLayoutOptionsProps]
  }
}

