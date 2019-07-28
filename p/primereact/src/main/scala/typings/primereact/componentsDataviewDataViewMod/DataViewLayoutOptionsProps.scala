package typings.primereact.componentsDataviewDataViewMod

import typings.primereact.Anon_OriginalEventValueEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewLayoutOptionsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  def onChange(e: Anon_OriginalEventValueEvent): Unit
}

object DataViewLayoutOptionsProps {
  @scala.inline
  def apply(
    onChange: Anon_OriginalEventValueEvent => Unit,
    className: String = null,
    id: String = null,
    layout: String = null,
    style: String = null
  ): DataViewLayoutOptionsProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DataViewLayoutOptionsProps]
  }
}

