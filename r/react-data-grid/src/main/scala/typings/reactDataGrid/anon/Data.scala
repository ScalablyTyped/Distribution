package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any = js.native
  var DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any = js.native
  var Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any = js.native
  var Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any = js.native
  var Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any = js.native
  var Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any = js.native
  var Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any = js.native
}

object Data {
  @scala.inline
  def apply(
    Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any,
    DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any,
    Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any,
    Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any,
    Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any,
    Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any,
    Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any
  ): Data = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DraggableHeader = DraggableHeader.asInstanceOf[js.Any], Editors = Editors.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Formatters = Formatters.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggableHeader(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any
    ): Self = this.set("DraggableHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditors(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any): Self = this.set("Editors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any): Self = this.set("Formatters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any): Self = this.set("Menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any): Self = this.set("Toolbar", value.asInstanceOf[js.Any])
  }
  
}

