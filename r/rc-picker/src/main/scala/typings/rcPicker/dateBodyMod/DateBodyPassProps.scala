package typings.rcPicker.dateBodyMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateBodyPassProps[DateType] extends js.Object {
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
}

object DateBodyPassProps {
  @scala.inline
  def apply[DateType](): DateBodyPassProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateBodyPassProps[DateType]]
  }
  @scala.inline
  implicit class DateBodyPassPropsOps[Self <: DateBodyPassProps[_], DateType] (val x: Self with DateBodyPassProps[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateRender(value: (DateType, DateType) => ReactNode): Self = this.set("dateRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setPrefixColumn(value: /* date */ DateType => ReactNode): Self = this.set("prefixColumn", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrefixColumn: Self = this.set("prefixColumn", js.undefined)
    @scala.inline
    def setRowClassName(value: /* date */ DateType => String): Self = this.set("rowClassName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
  }
  
}

