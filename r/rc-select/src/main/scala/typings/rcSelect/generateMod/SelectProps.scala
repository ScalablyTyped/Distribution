package typings.rcSelect.generateMod

import typings.rcSelect.anon.Mark
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.FilterFunc
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.SingleType
import typings.rcSelect.interfaceMod.Mode
import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.rcSelect.interfaceMod.RenderNode
import typings.rcSelect.rcSelectStrings.click
import typings.rcSelect.rcSelectStrings.focus
import typings.react.mod.AriaAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps[OptionsType /* <: js.Array[js.Object] */, ValueType] extends AriaAttributes {
  
  var allowClear: js.UndefOr[Boolean] = js.native
  
  var animation: js.UndefOr[String] = js.native
  
  var autoClearSearchValue: js.UndefOr[Boolean] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backfill: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var choiceTransitionName: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearIcon: js.UndefOr[ReactNode] = js.native
  
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
  
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[ValueType] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dropdownAlign: js.UndefOr[js.Any] = js.native
  
  var dropdownClassName: js.UndefOr[String] = js.native
  
  var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
  
  var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
  
  var dropdownStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * In Select, `false` means do nothing.
    * In TreeSelect, `false` will highlight match item.
    * It's by design.
    */
  var filterOption: js.UndefOr[
    Boolean | (FilterFunc[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
    ])
  ] = js.native
  
  var getInputElement: js.UndefOr[js.Function0[Element]] = js.native
  
  var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputIcon: js.UndefOr[RenderNode] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  /**
    * Only used in current version for internal event process.
    * Do not use in production environment.
    */
  var internalProps: js.UndefOr[Mark[OptionsType]] = js.native
  
  var labelInValue: js.UndefOr[Boolean] = js.native
  
  var listHeight: js.UndefOr[Double] = js.native
  
  var listItemHeight: js.UndefOr[Double] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var maxTagCount: js.UndefOr[Double] = js.native
  
  var maxTagPlaceholder: js.UndefOr[
    ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])
  ] = js.native
  
  var maxTagTextLength: js.UndefOr[Double] = js.native
  
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
  
  var mode: js.UndefOr[Mode] = js.native
  
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ ValueType, 
      /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any) | OptionsType, 
      Unit
    ]
  ] = js.native
  
  var onClear: js.UndefOr[OnClear] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.native
  
  var onDeselect: js.UndefOr[
    js.Function2[
      /* value */ SingleType[ValueType], 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
  var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var onSelect: js.UndefOr[
    js.Function2[
      /* value */ SingleType[ValueType], 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var optionFilterProp: js.UndefOr[String] = js.native
  
  var optionLabelProp: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[OptionsType] = js.native
  
  var placeholder: js.UndefOr[ReactNode] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var removeIcon: js.UndefOr[ReactNode] = js.native
  
  var searchValue: js.UndefOr[String] = js.native
  
  var showAction: js.UndefOr[js.Array[focus | click]] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
  
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[ValueType] = js.native
  
  var virtual: js.UndefOr[Boolean] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */, ValueType](): SelectProps[OptionsType, ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps[OptionsType, ValueType]]
  }
  
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps[_, _], OptionsType /* <: js.Array[js.Object] */, ValueType] (val x: Self with (SelectProps[OptionsType, ValueType])) extends AnyVal {
    
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoClearSearchValue(value: Boolean): Self = this.set("autoClearSearchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClearSearchValue: Self = this.set("autoClearSearchValue", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackfill(value: Boolean): Self = this.set("backfill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfill: Self = this.set("backfill", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChoiceTransitionName(value: String): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirstOption(value: Boolean): Self = this.set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveFirstOption: Self = this.set("defaultActiveFirstOption", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: ValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDropdownAlign(value: js.Any): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean | Double): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    
    @scala.inline
    def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = this.set("dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
    
    @scala.inline
    def setDropdownStyle(value: CSSProperties): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    
    @scala.inline
    def setFilterOptionFunction2(
      value: (/* inputValue */ String, /* option */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
        ]) => Boolean
    ): Self = this.set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterOption(
      value: Boolean | (FilterFunc[
          /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
        ])
    ): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    
    @scala.inline
    def setGetInputElement(value: () => Element): Self = this.set("getInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInputElement: Self = this.set("getInputElement", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputIconFunction1(value: /* props */ js.Any => ReactNode): Self = this.set("inputIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputIcon(value: RenderNode): Self = this.set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIcon: Self = this.set("inputIcon", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setInternalProps(value: Mark[OptionsType]): Self = this.set("internalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalProps: Self = this.set("internalProps", js.undefined)
    
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInValue: Self = this.set("labelInValue", js.undefined)
    
    @scala.inline
    def setListHeight(value: Double): Self = this.set("listHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListHeight: Self = this.set("listHeight", js.undefined)
    
    @scala.inline
    def setListItemHeight(value: Double): Self = this.set("listItemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemHeight: Self = this.set("listItemHeight", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    
    @scala.inline
    def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = this.set("maxTagPlaceholder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    
    @scala.inline
    def setMenuItemSelectedIconFunction1(value: /* props */ js.Any => ReactNode): Self = this.set("menuItemSelectedIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuItemSelectedIcon(value: RenderNode): Self = this.set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemSelectedIcon: Self = this.set("menuItemSelectedIcon", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNotFoundContent(value: ReactNode): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* value */ ValueType, /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any) | OptionsType) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDeselect(
      value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
    ): Self = this.set("onDeselect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    
    @scala.inline
    def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = this.set("onDropdownVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownVisibleChange: Self = this.set("onDropdownVisibleChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onInputKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputKeyDown: Self = this.set("onInputKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
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
    def setOnPopupScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = this.set("onPopupScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPopupScroll: Self = this.set("onPopupScroll", js.undefined)
    
    @scala.inline
    def setOnSearch(value: /* value */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
    ): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOptionFilterProp(value: String): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionFilterProp: Self = this.set("optionFilterProp", js.undefined)
    
    @scala.inline
    def setOptionLabelProp(value: String): Self = this.set("optionLabelProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionLabelProp: Self = this.set("optionLabelProp", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsType): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRemoveIcon(value: ReactNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    
    @scala.inline
    def setShowActionVarargs(value: (focus | click)*): Self = this.set("showAction", js.Array(value :_*))
    
    @scala.inline
    def setShowAction(value: js.Array[focus | click]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = this.set("tagRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTagRender: Self = this.set("tagRender", js.undefined)
    
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = this.set("tokenSeparators", js.Array(value :_*))
    
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setValue(value: ValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
