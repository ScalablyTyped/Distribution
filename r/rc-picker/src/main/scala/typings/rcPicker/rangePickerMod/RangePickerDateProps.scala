package typings.rcPicker.rangePickerMod

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.EventValue
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.RangeValue
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.pickerMod.PickerRefConfig
import typings.rcPicker.rcPickerStrings.`additions text`
import typings.rcPicker.rcPickerStrings.`inline`
import typings.rcPicker.rcPickerStrings.additions
import typings.rcPicker.rcPickerStrings.all
import typings.rcPicker.rcPickerStrings.ascending
import typings.rcPicker.rcPickerStrings.assertive
import typings.rcPicker.rcPickerStrings.both
import typings.rcPicker.rcPickerStrings.copy
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.rcPickerStrings.descending
import typings.rcPicker.rcPickerStrings.dialog
import typings.rcPicker.rcPickerStrings.end
import typings.rcPicker.rcPickerStrings.execute
import typings.rcPicker.rcPickerStrings.grammar
import typings.rcPicker.rcPickerStrings.grid
import typings.rcPicker.rcPickerStrings.horizontal
import typings.rcPicker.rcPickerStrings.link
import typings.rcPicker.rcPickerStrings.list
import typings.rcPicker.rcPickerStrings.listbox
import typings.rcPicker.rcPickerStrings.location
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.menu
import typings.rcPicker.rcPickerStrings.mixed
import typings.rcPicker.rcPickerStrings.move
import typings.rcPicker.rcPickerStrings.none
import typings.rcPicker.rcPickerStrings.off
import typings.rcPicker.rcPickerStrings.other
import typings.rcPicker.rcPickerStrings.page
import typings.rcPicker.rcPickerStrings.polite
import typings.rcPicker.rcPickerStrings.popup
import typings.rcPicker.rcPickerStrings.removals
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcPicker.rcPickerStrings.spelling
import typings.rcPicker.rcPickerStrings.start
import typings.rcPicker.rcPickerStrings.step
import typings.rcPicker.rcPickerStrings.text
import typings.rcPicker.rcPickerStrings.time
import typings.rcPicker.rcPickerStrings.tree
import typings.rcPicker.rcPickerStrings.vertical
import typings.rcTrigger.interfaceMod.AlignType
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Exclude
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent rc-picker.rc-picker/lib/RangePicker.RangePickerSharedProps<DateType> */
/* Inlined parent rc-picker.rc-picker/lib/RangePicker.OmitPickerProps<rc-picker.rc-picker/lib/Picker.PickerDateProps<DateType>> */
trait RangePickerDateProps[DateType] extends RangePickerProps[DateType] {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var components: js.UndefOr[Components] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[/* date */ EventValue[DateType], /* type */ start | end, DisabledTimes]
  ] = js.undefined
  var dropdownAlign: js.UndefOr[AlignType] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | js.Array[String]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  var locale: Locale
  var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nextIcon: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
  ] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var picker: js.UndefOr[date] = js.undefined
  var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var prevIcon: js.UndefOr[ReactNode] = js.undefined
  var ranges: js.UndefOr[
    Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ]
  ] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
  var showTime: js.UndefOr[Boolean | RangeShowTimeObject[DateType]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
  var superNextIcon: js.UndefOr[ReactNode] = js.undefined
  var superPrevIcon: js.UndefOr[ReactNode] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[RangeValue[DateType]] = js.undefined
}

object RangePickerDateProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.Tuple2[Boolean, Boolean] = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearIcon: ReactNode = null,
    components: Components = null,
    dateRender: (DateType, DateType) => ReactNode = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultPickerValue: js.Tuple2[DateType, DateType] = null,
    defaultValue: RangeValue[DateType] = null,
    direction: ltr | rtl = null,
    disabled: Boolean | (js.Tuple2[Boolean, Boolean]) = null,
    disabledDate: /* date */ DateType => Boolean = null,
    disabledTime: (/* date */ EventValue[DateType], /* type */ start | end) => DisabledTimes = null,
    dropdownAlign: AlignType = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getPopupContainer: /* node */ HTMLElement => HTMLElement = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    mode: js.Tuple2[PanelMode, PanelMode] = null,
    monthCellRender: (DateType, /* locale */ Locale) => ReactNode = null,
    name: String = null,
    nextIcon: ReactNode = null,
    onBlur: FocusEvent[HTMLInputElement] => Unit = null,
    onCalendarChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit = null,
    onChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onContextMenu: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onFocus: FocusEvent[HTMLInputElement] => Unit = null,
    onMouseDown: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onOk: /* dates */ RangeValue[DateType] => Unit = null,
    onOpenChange: /* open */ Boolean => Unit = null,
    onPanelChange: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    picker: date = null,
    pickerRef: MutableRefObject[PickerRefConfig] = null,
    placeholder: js.Tuple2[String, String] = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    prevIcon: ReactNode = null,
    ranges: Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ] = null,
    renderExtraFooter: /* mode */ PanelMode => ReactNode = null,
    role: String = null,
    separator: ReactNode = null,
    showTime: Boolean | RangeShowTimeObject[DateType] = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    superNextIcon: ReactNode = null,
    superPrevIcon: ReactNode = null,
    tabIndex: Int | Double = null,
    transitionName: String = null,
    value: RangeValue[DateType] = null
  ): RangePickerDateProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (allowEmpty != null) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2(disabledTime))
    if (dropdownAlign != null) __obj.updateDynamic("dropdownAlign")(dropdownAlign.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2(onCalendarChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerRef != null) __obj.updateDynamic("pickerRef")(pickerRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerDateProps[DateType]]
  }
}

