package typings
package primereactLib.componentsFullcalendarFullCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullCalendarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var events: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object FullCalendarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    events: js.Array[_] = null,
    id: java.lang.String = null,
    options: js.Object = null,
    style: js.Object = null
  ): FullCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FullCalendarProps]
  }
}

