package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeaderProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with MDLDOMAttributes[TableHeader] {
  var cellFormatter: js.UndefOr[
    js.Function3[/* value */ js.Any, /* row */ js.Any, /* index */ Double, ReactNode]
  ] = js.native
  var name: String = js.native
  var nosort: js.UndefOr[Boolean] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String, _]
  ] = js.native
  var sortFn: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean, Double]] = js.native
  var title: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[ReactNode] = js.native
}

object TableHeaderProps {
  @scala.inline
  def apply(name: String): TableHeaderProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
  @scala.inline
  implicit class TableHeaderPropsOps[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellFormatter(value: (/* value */ js.Any, /* row */ js.Any, /* index */ Double) => ReactNode): Self = this.set("cellFormatter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCellFormatter: Self = this.set("cellFormatter", js.undefined)
    @scala.inline
    def setNosort(value: Boolean): Self = this.set("nosort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNosort: Self = this.set("nosort", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setOnClick(value: (/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String) => _): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSortFn(value: (/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean) => Double): Self = this.set("sortFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSortFn: Self = this.set("sortFn", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: ReactNode): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

