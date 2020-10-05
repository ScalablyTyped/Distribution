package typings.rcPicker.pickerPanelMod

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerPanelSharedProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.native
  /** @private Internal usage. Do not use in your production env */
  var components: js.UndefOr[Components] = js.native
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  /** [Legacy] Set default display picker view date */
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  var defaultValue: js.UndefOr[DateType] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  /** @private This is internal usage. Do not use in your production env */
  var hideHeader: js.UndefOr[Boolean] = js.native
  var locale: Locale = js.native
  /** @deprecated Will be removed in next big version. Please use `mode` instead */
  var mode: js.UndefOr[PanelMode] = js.native
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
  /** @private This is internal usage. Do not use in your production env */
  var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
  /** [Legacy] Set default display picker view date */
  var pickerValue: js.UndefOr[DateType] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var value: js.UndefOr[DateType | Null] = js.native
}

object PickerPanelSharedProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelSharedProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelSharedProps[DateType]]
  }
  @scala.inline
  implicit class PickerPanelSharedPropsOps[Self <: PickerPanelSharedProps[_], DateType] (val x: Self with PickerPanelSharedProps[DateType]) extends AnyVal {
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
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setDateRender(value: (DateType, DateType) => ReactNode): Self = this.set("dateRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDefaultPickerValue(value: DateType): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    @scala.inline
    def setDefaultValue(value: DateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setHideHeader(value: Boolean): Self = this.set("hideHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideHeader: Self = this.set("hideHeader", js.undefined)
    @scala.inline
    def setMode(value: PanelMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactNode): Self = this.set("monthCellRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ DateType => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnOk(value: /* date */ DateType => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    @scala.inline
    def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = this.set("onPickerValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPickerValueChange: Self = this.set("onPickerValueChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* value */ DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPickerValue(value: DateType): Self = this.set("pickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerValue: Self = this.set("pickerValue", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderExtraFooter(value: /* mode */ PanelMode => ReactNode): Self = this.set("renderExtraFooter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderExtraFooter: Self = this.set("renderExtraFooter", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

