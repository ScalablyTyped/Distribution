package typings.rcCascader.menusMod

import typings.rcCascader.cascaderMod.CascaderFieldNames
import typings.rcCascader.cascaderMod.CascaderOption
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenusProps extends js.Object {
  var activeValue: js.UndefOr[js.Array[String | Double]] = js.native
  var defaultFieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
  var expandIcon: js.UndefOr[ReactNode] = js.native
  var expandTrigger: js.UndefOr[String] = js.native
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var loadingIcon: js.UndefOr[ReactNode] = js.native
  var onItemDoubleClick: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  var onSelect: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ KeyboardEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  var options: js.UndefOr[js.Array[CascaderOption]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String | Double]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object MenusProps {
  @scala.inline
  def apply(): MenusProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenusProps]
  }
  @scala.inline
  implicit class MenusPropsOps[Self <: MenusProps] (val x: Self) extends AnyVal {
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
    def setActiveValueVarargs(value: (String | Double)*): Self = this.set("activeValue", js.Array(value :_*))
    @scala.inline
    def setActiveValue(value: js.Array[String | Double]): Self = this.set("activeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveValue: Self = this.set("activeValue", js.undefined)
    @scala.inline
    def setDefaultFieldNames(value: CascaderFieldNames): Self = this.set("defaultFieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFieldNames: Self = this.set("defaultFieldNames", js.undefined)
    @scala.inline
    def setDropdownMenuColumnStyle(value: CSSProperties): Self = this.set("dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMenuColumnStyle: Self = this.set("dropdownMenuColumnStyle", js.undefined)
    @scala.inline
    def setExpandIcon(value: ReactNode): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setExpandTrigger(value: String): Self = this.set("expandTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandTrigger: Self = this.set("expandTrigger", js.undefined)
    @scala.inline
    def setFieldNames(value: CascaderFieldNames): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNames: Self = this.set("fieldNames", js.undefined)
    @scala.inline
    def setLoadingIcon(value: ReactNode): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    @scala.inline
    def setOnItemDoubleClick(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemDoubleClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemDoubleClick: Self = this.set("onItemDoubleClick", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ KeyboardEvent[HTMLElement]) => Unit
    ): Self = this.set("onSelect", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: CascaderOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[CascaderOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String | Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

