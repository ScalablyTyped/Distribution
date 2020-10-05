package typings.rcPicker.timeUnitColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeUnitColumnProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  var onSelect: js.UndefOr[js.Function1[/* value */ Double, scala.Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var units: js.UndefOr[js.Array[Unit]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object TimeUnitColumnProps {
  @scala.inline
  def apply(): TimeUnitColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeUnitColumnProps]
  }
  @scala.inline
  implicit class TimeUnitColumnPropsOps[Self <: TimeUnitColumnProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    @scala.inline
    def setOnSelect(value: /* value */ Double => scala.Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setUnitsVarargs(value: Unit*): Self = this.set("units", js.Array(value :_*))
    @scala.inline
    def setUnits(value: js.Array[Unit]): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

