package typings.primereact.pickListSubListMod

import typings.primereact.anon.EventValue
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListSubListProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  var list: js.UndefOr[js.Array[_]] = js.native
  var listClassName: js.UndefOr[String] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var onItemClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ EventValue, Unit]] = js.native
  var selection: js.UndefOr[js.Array[_]] = js.native
  var showControls: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object PickListSubListProps {
  @scala.inline
  def apply(): PickListSubListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListSubListProps]
  }
  @scala.inline
  implicit class PickListSubListPropsOps[Self <: PickListSubListProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setListVarargs(value: js.Any*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[_]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setListClassName(value: String): Self = this.set("listClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListClassName: Self = this.set("listClassName", js.undefined)
    @scala.inline
    def setMetaKeySelection(value: Boolean): Self = this.set("metaKeySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaKeySelection: Self = this.set("metaKeySelection", js.undefined)
    @scala.inline
    def setOnItemClick(value: () => Unit): Self = this.set("onItemClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnSelectionChange(value: /* e */ EventValue => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: js.Any*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[_]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setShowControls(value: Boolean): Self = this.set("showControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowControls: Self = this.set("showControls", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

