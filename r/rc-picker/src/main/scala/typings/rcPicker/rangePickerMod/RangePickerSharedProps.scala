package typings.rcPicker.rangePickerMod

import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.EventValue
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.RangeValue
import typings.rcPicker.rcPickerNumbers.`0`
import typings.rcPicker.rcPickerNumbers.`1`
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePickerSharedProps[DateType] extends js.Object {
  
  /** @private Internal control of active picker. Do not use since it's private usage */
  var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
  
  var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
  
  var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  
  var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
  
  var disabledTime: js.UndefOr[
    js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
  ] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onCalendarChange: js.UndefOr[
    js.Function3[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      /* info */ RangeInfo, 
      Unit
    ]
  ] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
  
  var onPanelChange: js.UndefOr[
    js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
  ] = js.native
  
  var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactNode, ReactNode]] = js.native
  
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var ranges: js.UndefOr[
    Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ]
  ] = js.native
  
  var separator: js.UndefOr[ReactNode] = js.native
  
  var value: js.UndefOr[RangeValue[DateType]] = js.native
}
object RangePickerSharedProps {
  
  @scala.inline
  def apply[DateType](): RangePickerSharedProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePickerSharedProps[DateType]]
  }
  
  @scala.inline
  implicit class RangePickerSharedPropsOps[Self <: RangePickerSharedProps[_], DateType] (val x: Self with RangePickerSharedProps[DateType]) extends AnyVal {
    
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
    def setActivePickerIndex(value: `0` | `1`): Self = this.set("activePickerIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivePickerIndex: Self = this.set("activePickerIndex", js.undefined)
    
    @scala.inline
    def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactNode): Self = this.set("dateRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    
    @scala.inline
    def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: RangeValue[DateType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = this.set("disabledTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCalendarChange(
      value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
    ): Self = this.set("onCalendarChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCalendarChange: Self = this.set("onCalendarChange", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    
    @scala.inline
    def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    
    @scala.inline
    def setPanelRender(value: /* originPanel */ ReactNode => ReactNode): Self = this.set("panelRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePanelRender: Self = this.set("panelRender", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Tuple2[String, String]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRanges(
      value: Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
    ): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setSeparator(value: ReactNode): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setValue(value: RangeValue[DateType]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
