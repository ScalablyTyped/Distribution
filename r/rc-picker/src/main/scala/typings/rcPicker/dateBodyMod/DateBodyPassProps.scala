package typings.rcPicker.dateBodyMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBodyPassProps[DateType] extends js.Object {
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
}

object DateBodyPassProps {
  @scala.inline
  def apply[DateType](
    dateRender: (DateType, DateType) => ReactNode = null,
    disabledDate: /* date */ DateType => Boolean = null,
    prefixColumn: /* date */ DateType => ReactNode = null,
    rowClassName: /* date */ DateType => String = null
  ): DateBodyPassProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    __obj.asInstanceOf[DateBodyPassProps[DateType]]
  }
}

