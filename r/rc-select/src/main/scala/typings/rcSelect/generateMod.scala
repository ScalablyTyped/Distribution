package typings.rcSelect

import typings.rcSelect.anon.Disabled
import typings.rcSelect.anon.FilterOption
import typings.rcSelect.anon.LabelInValue
import typings.rcSelect.anon.Mark
import typings.rcSelect.anon.OptionList
import typings.rcSelect.anon.PrevValueOptions
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.FilterFunc
import typings.rcSelect.generatorMod.FilterOptions
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.GetLabeledValue
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.RawValueType
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
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  @JSImport("rc-select/lib/generate", JSImport.Default)
  @js.native
  def default[OptionsType /* <: js.Array[Disabled] */](config: GenerateConfig[OptionsType]): ForwardRefExoticComponent[(SelectProps[OptionsType, DefaultValueType]) with RefAttributes[RefSelectProps]] = js.native
  
  @js.native
  trait GenerateConfig[OptionsType /* <: js.Array[js.Object] */] extends StObject {
    
    var components: OptionList[OptionsType] = js.native
    
    /** Convert jsx tree into `OptionsType` */
    def convertChildrenToData(children: ReactNode): OptionsType = js.native
    
    var fillOptionsWithMissingValue: js.UndefOr[
        js.Function4[
          /* options */ OptionsType, 
          /* value */ DefaultValueType, 
          /* optionLabelProp */ String, 
          /* labelInValue */ Boolean, 
          OptionsType
        ]
      ] = js.native
    
    var filterOptions: FilterOptions[OptionsType] = js.native
    
    var findValueOption: (js.Function2[
        /* values */ js.Array[RawValueType], 
        /* options */ FlattenOptionsType[OptionsType], 
        OptionsType
      ]) | (js.Function3[
        /* values */ js.Array[RawValueType], 
        /* options */ FlattenOptionsType[OptionsType], 
        /* info */ js.UndefOr[PrevValueOptions[OptionsType]], 
        OptionsType
      ]) = js.native
    
    /** Flatten nest options into raw option list */
    def flattenOptions(options: OptionsType, props: js.Any): FlattenOptionsType[OptionsType] = js.native
    
    /** Convert single raw value into { label, value } format. Will be called by each value */
    var getLabeledValue: GetLabeledValue[FlattenOptionsType[OptionsType]] = js.native
    
    /** Check if a value is disabled */
    def isValueDisabled(value: RawValueType, options: FlattenOptionsType[OptionsType]): Boolean = js.native
    
    var omitDOMProps: js.UndefOr[js.Function1[/* props */ js.Object, js.Object]] = js.native
    
    var prefixCls: String = js.native
    
    var warningProps: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  }
  object GenerateConfig {
    
    @scala.inline
    def apply[OptionsType /* <: js.Array[js.Object] */](
      components: OptionList[OptionsType],
      convertChildrenToData: ReactNode => OptionsType,
      filterOptions: (/* searchValue */ String, OptionsType, /* config */ FilterOption[OptionsType]) => OptionsType,
      findValueOption: (js.Function2[
          /* values */ js.Array[RawValueType], 
          /* options */ FlattenOptionsType[OptionsType], 
          OptionsType
        ]) | (js.Function3[
          /* values */ js.Array[RawValueType], 
          /* options */ FlattenOptionsType[OptionsType], 
          /* info */ js.UndefOr[PrevValueOptions[OptionsType]], 
          OptionsType
        ]),
      flattenOptions: (OptionsType, js.Any) => FlattenOptionsType[OptionsType],
      getLabeledValue: (/* value */ RawValueType, /* config */ LabelInValue[FlattenOptionsType[OptionsType]]) => LabelValueType,
      isValueDisabled: (RawValueType, FlattenOptionsType[OptionsType]) => Boolean,
      prefixCls: String
    ): GenerateConfig[OptionsType] = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], convertChildrenToData = js.Any.fromFunction1(convertChildrenToData), filterOptions = js.Any.fromFunction3(filterOptions), findValueOption = findValueOption.asInstanceOf[js.Any], flattenOptions = js.Any.fromFunction2(flattenOptions), getLabeledValue = js.Any.fromFunction2(getLabeledValue), isValueDisabled = js.Any.fromFunction2(isValueDisabled), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig[OptionsType]]
    }
    
    @scala.inline
    implicit class GenerateConfigMutableBuilder[Self <: GenerateConfig[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with GenerateConfig[OptionsType]) extends AnyVal {
      
      @scala.inline
      def setComponents(value: OptionList[OptionsType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertChildrenToData(value: ReactNode => OptionsType): Self = StObject.set(x, "convertChildrenToData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFillOptionsWithMissingValue(
        value: (/* options */ OptionsType, /* value */ DefaultValueType, /* optionLabelProp */ String, /* labelInValue */ Boolean) => OptionsType
      ): Self = StObject.set(x, "fillOptionsWithMissingValue", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFillOptionsWithMissingValueUndefined: Self = StObject.set(x, "fillOptionsWithMissingValue", js.undefined)
      
      @scala.inline
      def setFilterOptions(
        value: (/* searchValue */ String, OptionsType, /* config */ FilterOption[OptionsType]) => OptionsType
      ): Self = StObject.set(x, "filterOptions", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFindValueOption(
        value: (js.Function2[
              /* values */ js.Array[RawValueType], 
              /* options */ FlattenOptionsType[OptionsType], 
              OptionsType
            ]) | (js.Function3[
              /* values */ js.Array[RawValueType], 
              /* options */ FlattenOptionsType[OptionsType], 
              /* info */ js.UndefOr[PrevValueOptions[OptionsType]], 
              OptionsType
            ])
      ): Self = StObject.set(x, "findValueOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindValueOptionFunction2(
        value: (/* values */ js.Array[RawValueType], /* options */ FlattenOptionsType[OptionsType]) => OptionsType
      ): Self = StObject.set(x, "findValueOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindValueOptionFunction3(
        value: (/* values */ js.Array[RawValueType], /* options */ FlattenOptionsType[OptionsType], /* info */ js.UndefOr[PrevValueOptions[OptionsType]]) => OptionsType
      ): Self = StObject.set(x, "findValueOption", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFlattenOptions(value: (OptionsType, js.Any) => FlattenOptionsType[OptionsType]): Self = StObject.set(x, "flattenOptions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetLabeledValue(
        value: (/* value */ RawValueType, /* config */ LabelInValue[FlattenOptionsType[OptionsType]]) => LabelValueType
      ): Self = StObject.set(x, "getLabeledValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValueDisabled(value: (RawValueType, FlattenOptionsType[OptionsType]) => Boolean): Self = StObject.set(x, "isValueDisabled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOmitDOMProps(value: /* props */ js.Object => js.Object): Self = StObject.set(x, "omitDOMProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOmitDOMPropsUndefined: Self = StObject.set(x, "omitDOMProps", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningProps(value: /* props */ js.Any => Unit): Self = StObject.set(x, "warningProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarningPropsUndefined: Self = StObject.set(x, "warningProps", js.undefined)
    }
  }
  
  @js.native
  trait RefSelectProps extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
  }
  object RefSelectProps {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): RefSelectProps = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[RefSelectProps]
    }
    
    @scala.inline
    implicit class RefSelectPropsMutableBuilder[Self <: RefSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class SelectPropsMutableBuilder[Self <: SelectProps[_, _], OptionsType /* <: js.Array[js.Object] */, ValueType] (val x: Self with (SelectProps[OptionsType, ValueType])) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: js.Any): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setFilterOption(
        value: Boolean | (FilterFunc[
              /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
            ])
      ): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionFunction2(
        value: (/* inputValue */ String, /* option */ js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
            ]) => Boolean
      ): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setGetInputElement(value: () => Element): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInputElementUndefined: Self = StObject.set(x, "getInputElement", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputIcon(value: RenderNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "inputIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setInternalProps(value: Mark[OptionsType]): Self = StObject.set(x, "internalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalPropsUndefined: Self = StObject.set(x, "internalProps", js.undefined)
      
      @scala.inline
      def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMaxTagCount(value: Double): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      @scala.inline
      def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      @scala.inline
      def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      @scala.inline
      def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemSelectedIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ ValueType, /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any) | OptionsType) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDeselect(
        value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
      ): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnPopupScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onPopupScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionFilterPropUndefined: Self = StObject.set(x, "optionFilterProp", js.undefined)
      
      @scala.inline
      def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionLabelPropUndefined: Self = StObject.set(x, "optionLabelProp", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      @scala.inline
      def setShowAction(value: js.Array[focus | click]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      @scala.inline
      def setShowActionVarargs(value: (focus | click)*): Self = StObject.set(x, "showAction", js.Array(value :_*))
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      @scala.inline
      def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      @scala.inline
      def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value :_*))
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
