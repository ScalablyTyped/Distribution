package typings.rcCascader.cascaderMod

import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'getPopupContainer'> */
@js.native
trait CascaderProps extends js.Object {
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
  var changeOnSelect: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var defaultValue: js.UndefOr[CascaderValueType] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
  var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
  var expandIcon: js.UndefOr[ReactNode] = js.native
  var expandTrigger: js.UndefOr[String] = js.native
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var filedNames: js.UndefOr[CascaderFieldNames] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[CascaderOption], Unit]] = js.native
  var loadingIcon: js.UndefOr[ReactNode] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption], Unit]
  ] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.native
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
  var options: js.UndefOr[js.Array[CascaderOption]] = js.native
  var popupClassName: js.UndefOr[String] = js.native
  var popupPlacement: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var value: js.UndefOr[CascaderValueType] = js.native
}

object CascaderProps {
  @scala.inline
  def apply(): CascaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascaderProps]
  }
  @scala.inline
  implicit class CascaderPropsOps[Self <: CascaderProps] (val x: Self) extends AnyVal {
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
    def setBuiltinPlacements(value: BuildInPlacements): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    @scala.inline
    def setChangeOnSelect(value: Boolean): Self = this.set("changeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeOnSelect: Self = this.set("changeOnSelect", js.undefined)
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: (String | Double)*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: CascaderValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownMenuColumnStyle(value: CSSProperties): Self = this.set("dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMenuColumnStyle: Self = this.set("dropdownMenuColumnStyle", js.undefined)
    @scala.inline
    def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = this.set("dropdownRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
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
    def setFiledNames(value: CascaderFieldNames): Self = this.set("filedNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiledNames: Self = this.set("filedNames", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setLoadData(value: /* selectOptions */ js.Array[CascaderOption] => Unit): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    @scala.inline
    def setLoadingIcon(value: ReactNode): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = this.set("onPopupVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPopupVisibleChange: Self = this.set("onPopupVisibleChange", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: CascaderOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[CascaderOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    @scala.inline
    def setPopupPlacement(value: String): Self = this.set("popupPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupPlacement: Self = this.set("popupPlacement", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

