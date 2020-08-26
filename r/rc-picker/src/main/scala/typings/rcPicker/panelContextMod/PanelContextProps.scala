package typings.rcPicker.panelContextMod

import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.MutableRefObject
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelContextProps extends js.Object {
  /** Only used for TimePicker and this is a deprecated prop */
  var defaultOpenValue: js.UndefOr[js.Any] = js.native
  /** Only work with time panel */
  var hideHeader: js.UndefOr[Boolean] = js.native
  var hideNextBtn: js.UndefOr[Boolean] = js.native
  var hidePrevBtn: js.UndefOr[Boolean] = js.native
  var hideRanges: js.UndefOr[Boolean] = js.native
  var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  var onSelect: js.UndefOr[OnSelect[_]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.native
  var panelRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
}

object PanelContextProps {
  @scala.inline
  def apply(): PanelContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelContextProps]
  }
  @scala.inline
  implicit class PanelContextPropsOps[Self <: PanelContextProps] (val x: Self) extends AnyVal {
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
    def setDefaultOpenValue(value: js.Any): Self = this.set("defaultOpenValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenValue: Self = this.set("defaultOpenValue", js.undefined)
    @scala.inline
    def setHideHeader(value: Boolean): Self = this.set("hideHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideHeader: Self = this.set("hideHeader", js.undefined)
    @scala.inline
    def setHideNextBtn(value: Boolean): Self = this.set("hideNextBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideNextBtn: Self = this.set("hideNextBtn", js.undefined)
    @scala.inline
    def setHidePrevBtn(value: Boolean): Self = this.set("hidePrevBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePrevBtn: Self = this.set("hidePrevBtn", js.undefined)
    @scala.inline
    def setHideRanges(value: Boolean): Self = this.set("hideRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRanges: Self = this.set("hideRanges", js.undefined)
    @scala.inline
    def setOnDateMouseEnter(value: /* date */ js.Any => Unit): Self = this.set("onDateMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDateMouseEnter: Self = this.set("onDateMouseEnter", js.undefined)
    @scala.inline
    def setOnDateMouseLeave(value: /* date */ js.Any => Unit): Self = this.set("onDateMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDateMouseLeave: Self = this.set("onDateMouseLeave", js.undefined)
    @scala.inline
    def setOnSelect(value: (_, /* type */ key | mouse | submit) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOperationRef(value: MutableRefObject[ContextOperationRefProps | Null]): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationRef: Self = this.set("operationRef", js.undefined)
    @scala.inline
    def setPanelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("panelRef", js.Any.fromFunction1(value))
    @scala.inline
    def setPanelRef(value: Ref[HTMLDivElement]): Self = this.set("panelRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelRef: Self = this.set("panelRef", js.undefined)
    @scala.inline
    def setPanelRefNull: Self = this.set("panelRef", null)
  }
  
}

