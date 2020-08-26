package typings.rcPicker.pickerMod

import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcTrigger.interfaceMod.AlignType
import typings.react.mod.AriaAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerSharedProps[DateType] extends AriaAttributes {
  var allowClear: js.UndefOr[Boolean] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var clearIcon: js.UndefOr[ReactNode] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownAlign: js.UndefOr[AlignType] = js.native
  var dropdownClassName: js.UndefOr[String] = js.native
  var format: js.UndefOr[String | js.Array[String]] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var id: js.UndefOr[String] = js.native
  /** Make input readOnly to avoid popup keyboard in mobile */
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var nextIcon: js.UndefOr[ReactNode] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ DateType | Null, /* dateString */ String, Unit]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactNode, ReactNode]] = js.native
  /** @private Internal usage, do not use in production mode!!! */
  var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popupStyle: js.UndefOr[CSSProperties] = js.native
  var prevIcon: js.UndefOr[ReactNode] = js.native
  var role: js.UndefOr[String] = js.native
  var suffixIcon: js.UndefOr[ReactNode] = js.native
  var superNextIcon: js.UndefOr[ReactNode] = js.native
  var superPrevIcon: js.UndefOr[ReactNode] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var transitionName: js.UndefOr[String] = js.native
}

object PickerSharedProps {
  @scala.inline
  def apply[DateType](): PickerSharedProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerSharedProps[DateType]]
  }
  @scala.inline
  implicit class PickerSharedPropsOps[Self <: PickerSharedProps[_], DateType] (val x: Self with PickerSharedProps[DateType]) extends AnyVal {
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownAlign(value: AlignType): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: String | js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputReadOnly(value: Boolean): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputReadOnly: Self = this.set("inputReadOnly", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNextIcon(value: ReactNode): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ DateType | Null, /* dateString */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnOpenChange(value: /* open */ Boolean => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPanelRender(value: /* originPanel */ ReactNode => ReactNode): Self = this.set("panelRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanelRender: Self = this.set("panelRender", js.undefined)
    @scala.inline
    def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = this.set("pickerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerRef: Self = this.set("pickerRef", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    @scala.inline
    def setPrevIcon(value: ReactNode): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSuffixIcon(value: ReactNode): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setSuperNextIcon(value: ReactNode): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperNextIcon: Self = this.set("superNextIcon", js.undefined)
    @scala.inline
    def setSuperPrevIcon(value: ReactNode): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperPrevIcon: Self = this.set("superPrevIcon", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
  }
  
}

