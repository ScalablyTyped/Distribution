package typings.rcPicker.pickerMod

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.DisabledTime
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
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
import typings.rcPicker.rcPickerStrings.step
import typings.rcPicker.rcPickerStrings.text
import typings.rcPicker.rcPickerStrings.time
import typings.rcPicker.rcPickerStrings.tree
import typings.rcPicker.rcPickerStrings.vertical
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.rcTrigger.interfaceMod.AlignType
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

/* Inlined parent rc-picker.rc-picker/es/Picker.PickerSharedProps<DateType> */
/* Inlined parent rc-picker.rc-picker/es/Picker.OmitPanelProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelDateProps<DateType>> */
@js.native
trait PickerDateProps[DateType] extends PickerProps[DateType] {
  var allowClear: js.UndefOr[Boolean] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clearIcon: js.UndefOr[ReactNode] = js.native
  var components: js.UndefOr[Components] = js.native
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  var defaultValue: js.UndefOr[DateType] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
  var dropdownAlign: js.UndefOr[AlignType] = js.native
  var dropdownClassName: js.UndefOr[String] = js.native
  var format: js.UndefOr[String | js.Array[String]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var id: js.UndefOr[String] = js.native
  /** Make input readOnly to avoid popup keyboard in mobile */
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  var locale: Locale = js.native
  var mode: js.UndefOr[PanelMode] = js.native
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
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
  var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactNode, ReactNode]] = js.native
  var picker: js.UndefOr[date] = js.native
  /** @private Internal usage, do not use in production mode!!! */
  var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popupStyle: js.UndefOr[CSSProperties] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prevIcon: js.UndefOr[ReactNode] = js.native
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.native
  var role: js.UndefOr[String] = js.native
  var showNow: js.UndefOr[Boolean] = js.native
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
  var showToday: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suffixIcon: js.UndefOr[ReactNode] = js.native
  var superNextIcon: js.UndefOr[ReactNode] = js.native
  var superPrevIcon: js.UndefOr[ReactNode] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var value: js.UndefOr[DateType | Null] = js.native
}

object PickerDateProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerDateProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerDateProps[DateType]]
  }
  @scala.inline
  implicit class PickerDatePropsOps[Self <: PickerDateProps[_], DateType] (val x: Self with PickerDateProps[DateType]) extends AnyVal {
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setDateRender(value: (DateType, DateType) => ReactNode): Self = this.set("dateRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = this.set("disabledTime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
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
    def setMode(value: PanelMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactNode): Self = this.set("monthCellRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
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
    def setOnOk(value: /* date */ DateType => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnOpenChange(value: /* open */ Boolean => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* value */ DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPanelRender(value: /* originPanel */ ReactNode => ReactNode): Self = this.set("panelRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanelRender: Self = this.set("panelRender", js.undefined)
    @scala.inline
    def setPicker(value: date): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPrevIcon(value: ReactNode): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setRenderExtraFooter(value: /* mode */ PanelMode => ReactNode): Self = this.set("renderExtraFooter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderExtraFooter: Self = this.set("renderExtraFooter", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    @scala.inline
    def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = this.set("showTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    @scala.inline
    def setShowToday(value: Boolean): Self = this.set("showToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToday: Self = this.set("showToday", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
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
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

