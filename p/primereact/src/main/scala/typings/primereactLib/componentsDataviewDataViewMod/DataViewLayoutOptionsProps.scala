package typings
package primereactLib.componentsDataviewDataViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewLayoutOptionsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  def onChange(e: primereactLib.Anon_OriginalEventValueEvent): scala.Unit
}

object DataViewLayoutOptionsProps {
  @scala.inline
  def apply(
    onChange: primereactLib.Anon_OriginalEventValueEvent => scala.Unit,
    className: java.lang.String = null,
    id: java.lang.String = null,
    layout: java.lang.String = null,
    style: java.lang.String = null
  ): DataViewLayoutOptionsProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DataViewLayoutOptionsProps]
  }
}

