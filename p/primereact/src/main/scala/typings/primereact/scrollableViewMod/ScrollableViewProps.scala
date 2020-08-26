package typings.primereact.scrollableViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableViewProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var frozen: js.UndefOr[Boolean] = js.native
  var frozenBody: js.UndefOr[js.Any] = js.native
  var frozenWidth: js.UndefOr[String] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var onVirtualScroll: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var totalRcords: js.UndefOr[Double] = js.native
  var unfrozenWidth: js.UndefOr[String] = js.native
  var virtualScroll: js.UndefOr[Boolean] = js.native
}

object ScrollableViewProps {
  @scala.inline
  def apply(): ScrollableViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableViewProps]
  }
  @scala.inline
  implicit class ScrollableViewPropsOps[Self <: ScrollableViewProps] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    @scala.inline
    def setFrozenBody(value: js.Any): Self = this.set("frozenBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenBody: Self = this.set("frozenBody", js.undefined)
    @scala.inline
    def setFrozenWidth(value: String): Self = this.set("frozenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenWidth: Self = this.set("frozenWidth", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setOnVirtualScroll(value: /* page */ Double => Unit): Self = this.set("onVirtualScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVirtualScroll: Self = this.set("onVirtualScroll", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTotalRcords(value: Double): Self = this.set("totalRcords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRcords: Self = this.set("totalRcords", js.undefined)
    @scala.inline
    def setUnfrozenWidth(value: String): Self = this.set("unfrozenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnfrozenWidth: Self = this.set("unfrozenWidth", js.undefined)
    @scala.inline
    def setVirtualScroll(value: Boolean): Self = this.set("virtualScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualScroll: Self = this.set("virtualScroll", js.undefined)
  }
  
}

