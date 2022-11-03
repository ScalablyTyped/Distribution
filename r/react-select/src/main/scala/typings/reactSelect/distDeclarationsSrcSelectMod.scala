package typings.reactSelect

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefCallback
import typings.react.mod.TouchEventHandler
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactSelect.anon.AriaSelection
import typings.reactSelect.anon.Arialive
import typings.reactSelect.anon.ClearIndicator
import typings.reactSelect.anon.ClearValue
import typings.reactSelect.anon.Count
import typings.reactSelect.anon.InputIsHidden
import typings.reactSelect.anon.InputValue
import typings.reactSelect.anon.TypeofSelect
import typings.reactSelect.distDeclarationsSrcAccessibilityMod.AriaLiveMessages
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.IndicatorsContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsControlMod.ControlProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupHeadingProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.ClearIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DropdownIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.IndicatorSeparatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.LoadingIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuListProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.NoticeProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.PortalStyleArgs
import typings.reactSelect.distDeclarationsSrcComponentsMod.SelectComponentsConfig
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typings.reactSelect.distDeclarationsSrcComponentsOptionMod.OptionProps
import typings.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.distDeclarationsSrcComponentsSingleValueMod.SingleValueProps
import typings.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typings.reactSelect.distDeclarationsSrcStylesMod.StylesConfig
import typings.reactSelect.distDeclarationsSrcThemeMod.ThemeConfig
import typings.reactSelect.distDeclarationsSrcTypesMod.ActionMeta
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.FocusDirection
import typings.reactSelect.distDeclarationsSrcTypesMod.GetOptionLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.GetOptionValue
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.InputActionMeta
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typings.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typings.reactSelect.distDeclarationsSrcTypesMod.Options
import typings.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typings.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typings.reactSelect.distDeclarationsSrcTypesMod.SetValueAction
import typings.reactSelect.distDeclarationsSrcTypesMod.Theme
import typings.reactSelect.reactSelectStrings.`live-region`
import typings.reactSelect.reactSelectStrings.assertive
import typings.reactSelect.reactSelectStrings.clearIndicator
import typings.reactSelect.reactSelectStrings.container
import typings.reactSelect.reactSelectStrings.control
import typings.reactSelect.reactSelectStrings.dropdownIndicator
import typings.reactSelect.reactSelectStrings.first
import typings.reactSelect.reactSelectStrings.grammar
import typings.reactSelect.reactSelectStrings.group
import typings.reactSelect.reactSelectStrings.groupHeading
import typings.reactSelect.reactSelectStrings.indicatorSeparator
import typings.reactSelect.reactSelectStrings.indicatorsContainer
import typings.reactSelect.reactSelectStrings.input
import typings.reactSelect.reactSelectStrings.last
import typings.reactSelect.reactSelectStrings.listbox
import typings.reactSelect.reactSelectStrings.loadingIndicator
import typings.reactSelect.reactSelectStrings.loadingMessage
import typings.reactSelect.reactSelectStrings.menu
import typings.reactSelect.reactSelectStrings.menuList
import typings.reactSelect.reactSelectStrings.menuPortal
import typings.reactSelect.reactSelectStrings.multiValue
import typings.reactSelect.reactSelectStrings.multiValueLabel
import typings.reactSelect.reactSelectStrings.multiValueRemove
import typings.reactSelect.reactSelectStrings.next
import typings.reactSelect.reactSelectStrings.noOptionsMessage
import typings.reactSelect.reactSelectStrings.off
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.reactSelectStrings.placeholder
import typings.reactSelect.reactSelectStrings.polite
import typings.reactSelect.reactSelectStrings.previous
import typings.reactSelect.reactSelectStrings.singleValue
import typings.reactSelect.reactSelectStrings.spelling
import typings.reactSelect.reactSelectStrings.valueContainer
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSelectMod {
  
  @JSImport("react-select/dist/declarations/src/Select", JSImport.Default)
  @js.native
  open class default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] protected () extends Select[Option, IsMulti, Group] {
    def this(props: Props[Option, IsMulti, Group]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/dist/declarations/src/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/Select", "default.defaultProps")
    @js.native
    def defaultProps: Arialive = js.native
    inline def defaultProps_=(x: Arialive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props[Any, Boolean, GroupBase[Any]], state: State[Any, Boolean, GroupBase[Any]]): AriaSelection | InputIsHidden = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AriaSelection | InputIsHidden]
  }
  
  object defaultProps {
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.aria-live")
    @js.native
    def ariaLive: String = js.native
    
    inline def ariaLive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.backspaceRemovesValue")
    @js.native
    def backspaceRemovesValue: Boolean = js.native
    inline def backspaceRemovesValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemovesValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.blurInputOnSelect")
    @js.native
    def blurInputOnSelect: Boolean = js.native
    inline def blurInputOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blurInputOnSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.captureMenuScroll")
    @js.native
    def captureMenuScroll: Boolean = js.native
    inline def captureMenuScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureMenuScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.closeMenuOnScroll")
    @js.native
    def closeMenuOnScroll: Boolean = js.native
    inline def closeMenuOnScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.closeMenuOnSelect")
    @js.native
    def closeMenuOnSelect: Boolean = js.native
    inline def closeMenuOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.controlShouldRenderValue")
    @js.native
    def controlShouldRenderValue: Boolean = js.native
    inline def controlShouldRenderValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlShouldRenderValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.escapeClearsValue")
    @js.native
    def escapeClearsValue: Boolean = js.native
    inline def escapeClearsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(x.asInstanceOf[js.Any])
    
    inline def filterOption(option: FilterOptionOption[Any], rawInput: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOption")(option.asInstanceOf[js.Any], rawInput.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def formatGroupLabel[Option, Group /* <: GroupBase[Option] */](group: Group): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGroupLabel")(group.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOptionLabel[Option_1](option: Option_1): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionLabel")(option.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOptionValue[Option_2](option: Option_2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionValue")(option.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.isDisabled")
    @js.native
    def isDisabled: Boolean = js.native
    inline def isDisabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.isLoading")
    @js.native
    def isLoading: Boolean = js.native
    inline def isLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.isMulti")
    @js.native
    def isMulti: Boolean = js.native
    inline def isMulti_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(x.asInstanceOf[js.Any])
    
    inline def isOptionDisabled[Option_3](option: Option_3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionDisabled")(option.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.isRtl")
    @js.native
    def isRtl: Boolean = js.native
    inline def isRtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.isSearchable")
    @js.native
    def isSearchable: Boolean = js.native
    inline def isSearchable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(x.asInstanceOf[js.Any])
    
    inline def loadingMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingMessage")().asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.maxMenuHeight")
    @js.native
    def maxMenuHeight: Double = js.native
    inline def maxMenuHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMenuHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.menuIsOpen")
    @js.native
    def menuIsOpen: Boolean = js.native
    inline def menuIsOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuIsOpen")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.menuPlacement")
    @js.native
    def menuPlacement: String = js.native
    inline def menuPlacement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuPlacement")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.menuPosition")
    @js.native
    def menuPosition: String = js.native
    inline def menuPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.menuShouldBlockScroll")
    @js.native
    def menuShouldBlockScroll: Boolean = js.native
    inline def menuShouldBlockScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuShouldBlockScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.menuShouldScrollIntoView")
    @js.native
    def menuShouldScrollIntoView: Boolean = js.native
    inline def menuShouldScrollIntoView_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuShouldScrollIntoView")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.minMenuHeight")
    @js.native
    def minMenuHeight: Double = js.native
    inline def minMenuHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minMenuHeight")(x.asInstanceOf[js.Any])
    
    inline def noOptionsMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noOptionsMessage")().asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.openMenuOnClick")
    @js.native
    def openMenuOnClick: Boolean = js.native
    inline def openMenuOnClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.openMenuOnFocus")
    @js.native
    def openMenuOnFocus: Boolean = js.native
    inline def openMenuOnFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.options")
    @js.native
    def options: js.Array[scala.Nothing] = js.native
    inline def options_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.pageSize")
    @js.native
    def pageSize: Double = js.native
    inline def pageSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.placeholder")
    @js.native
    def placeholder: String = js.native
    inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    inline def screenReaderStatus(param0: Count): String = ^.asInstanceOf[js.Dynamic].applyDynamic("screenReaderStatus")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.tabIndex")
    @js.native
    def tabIndex: Double = js.native
    inline def tabIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/Select", "defaultProps.tabSelectsValue")
    @js.native
    def tabSelectsValue: Boolean = js.native
    inline def tabSelectsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabSelectsValue")(x.asInstanceOf[js.Any])
  }
  
  trait CategorizedGroup[Option, Group /* <: GroupBase[Option] */]
    extends StObject
       with CategorizedGroupOrOption[Option, Group] {
    
    var data: Group
    
    var index: Double
    
    var options: js.Array[CategorizedOption[Option]]
    
    var `type`: group
  }
  object CategorizedGroup {
    
    inline def apply[Option, Group /* <: GroupBase[Option] */](data: Group, index: Double, options: js.Array[CategorizedOption[Option]]): CategorizedGroup[Option, Group] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[CategorizedGroup[Option, Group]]
    }
    
    extension [Self <: CategorizedGroup[?, ?], Option, Group /* <: GroupBase[Option] */](x: Self & (CategorizedGroup[Option, Group])) {
      
      inline def setData(value: Group): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[CategorizedOption[Option]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: CategorizedOption[Option]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedGroup[Option, Group]
    - typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedOption[Option]
  */
  trait CategorizedGroupOrOption[Option, Group /* <: GroupBase[Option] */] extends StObject
  object CategorizedGroupOrOption {
    
    inline def CategorizedGroup[Option, Group /* <: GroupBase[Option] */](data: Group, index: Double, options: js.Array[CategorizedOption[Option]]): typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedGroup[Option, Group] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedGroup[Option, Group]]
    }
    
    inline def CategorizedOption[Option](
      data: Option,
      index: Double,
      isDisabled: Boolean,
      isSelected: Boolean,
      label: String,
      value: String
    ): typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedOption[Option] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("option")
      __obj.asInstanceOf[typings.reactSelect.distDeclarationsSrcSelectMod.CategorizedOption[Option]]
    }
  }
  
  trait CategorizedOption[Option]
    extends StObject
       with CategorizedGroupOrOption[Option, Any] {
    
    var data: Option
    
    var index: Double
    
    var isDisabled: Boolean
    
    var isSelected: Boolean
    
    var label: String
    
    var `type`: option
    
    var value: String
  }
  object CategorizedOption {
    
    inline def apply[Option](
      data: Option,
      index: Double,
      isDisabled: Boolean,
      isSelected: Boolean,
      label: String,
      value: String
    ): CategorizedOption[Option] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("option")
      __obj.asInstanceOf[CategorizedOption[Option]]
    }
    
    extension [Self <: CategorizedOption[?], Option](x: Self & CategorizedOption[Option]) {
      
      inline def setData(value: Option): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setType(value: option): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.menu
    - typings.reactSelect.reactSelectStrings.value
  */
  trait FormatOptionLabelContext extends StObject
  object FormatOptionLabelContext {
    
    inline def menu: typings.reactSelect.reactSelectStrings.menu = "menu".asInstanceOf[typings.reactSelect.reactSelectStrings.menu]
    
    inline def value: typings.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typings.reactSelect.reactSelectStrings.value]
  }
  
  trait FormatOptionLabelMeta[Option] extends StObject {
    
    var context: FormatOptionLabelContext
    
    var inputValue: String
    
    var selectValue: Options[Option]
  }
  object FormatOptionLabelMeta {
    
    inline def apply[Option](context: FormatOptionLabelContext, inputValue: String, selectValue: Options[Option]): FormatOptionLabelMeta[Option] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptionLabelMeta[Option]]
    }
    
    extension [Self <: FormatOptionLabelMeta[?], Option](x: Self & FormatOptionLabelMeta[Option]) {
      
      inline def setContext(value: FormatOptionLabelContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setSelectValue(value: Options[Option]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      inline def setSelectValueVarargs(value: Option*): Self = StObject.set(x, "selectValue", js.Array(value*))
    }
  }
  
  trait Props[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    /** HTML ID of an element containing an error message related to the input**/
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    /** Indicate if the value entered in the field is invalid **/
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    /** Aria label (for assistive tech) */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** HTML ID of an element that should be used as the label (for assistive tech) */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Used to set the priority with which screen reader should treat updates to live regions. The possible settings are: off, polite (default) or assertive */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    /** Customise the messages used by the aria-live component */
    var ariaLiveMessages: js.UndefOr[AriaLiveMessages[Option, IsMulti, Group]] = js.undefined
    
    /** Focus the control when it is mounted */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Remove the currently focused option when the user presses backspace when Select isClearable or isMulti */
    var backspaceRemovesValue: Boolean
    
    /** Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
    var blurInputOnSelect: Boolean
    
    /** When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
    var captureMenuScroll: Boolean
    
    /** Sets a className attribute on the outer component */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, all inner components will be given a prefixed className attribute.
      *
      * This is useful when styling via CSS classes instead of the Styles API approach.
      */
    var classNamePrefix: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If `true`, close the select menu when the user scrolls the document/body.
      *
      * If a function, takes a standard javascript `ScrollEvent` you return a boolean:
      *
      * `true` => The menu closes
      *
      * `false` => The menu stays open
      *
      * This is useful when you have a scrollable modal and want to portal the menu out,
      * but want to avoid graphical issues.
      */
    var closeMenuOnScroll: Boolean | (js.Function1[/* event */ Event, Boolean])
    
    /** Close the select menu when the user selects an option */
    var closeMenuOnSelect: Boolean
    
    /**
      * This complex object includes all the compositional components that are used
      * in `react-select`. If you wish to overwrite a component, pass in an object
      * with the appropriate namespace.
      *
      * If you only wish to restyle a component, we recommend using the `styles` prop
      * instead. For a list of the components that can be passed in, and the shape
      * that will be passed to them, see [the components docs](/components)
      */
    var components: SelectComponentsConfig[Option, IsMulti, Group]
    
    /** Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
    var controlShouldRenderValue: Boolean
    
    /** Delimiter used to join multiple values into a single HTML Input value */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /** Clear all values when the user presses escape AND the menu is closed */
    var escapeClearsValue: Boolean
    
    /** Custom method to filter whether an option should be displayed in the menu */
    var filterOption: (js.Function2[/* option */ FilterOptionOption[Option], /* inputValue */ String, Boolean]) | Null
    
    /** Sets the form attribute on the input */
    var form: js.UndefOr[String] = js.undefined
    
    /**
      * Formats group labels in the menu as React components
      *
      * An example can be found in the [Replacing builtins](/advanced#replacing-builtins) documentation.
      */
    def formatGroupLabel(group: Group): ReactNode
    
    /** Formats option labels in the menu and control as React components */
    var formatOptionLabel: js.UndefOr[
        js.Function2[
          /* data */ Option, 
          /* formatOptionLabelMeta */ FormatOptionLabelMeta[Option], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * Resolves option data to a string to be displayed as the label by components
      *
      * Note: Failure to resolve to a string type can interfere with filtering and
      * screen reader support.
      */
    var getOptionLabel: GetOptionLabel[Option]
    
    /** Resolves option data to a string to compare options and specify value attributes */
    var getOptionValue: GetOptionValue[Option]
    
    /** Hide the selected option from the menu */
    var hideSelectedOptions: js.UndefOr[Boolean] = js.undefined
    
    /** The id to set on the SelectContainer component. */
    var id: js.UndefOr[String] = js.undefined
    
    /** The id of the search input */
    var inputId: js.UndefOr[String] = js.undefined
    
    /** The value of the search input */
    var inputValue: String
    
    /** Define an id prefix for the select components e.g. {your-id}-value */
    var instanceId: js.UndefOr[Double | String] = js.undefined
    
    /** Is the select value clearable */
    var isClearable: js.UndefOr[Boolean] = js.undefined
    
    /** Is the select disabled */
    var isDisabled: Boolean
    
    /** Is the select in a state of loading (async) */
    var isLoading: Boolean
    
    /** Support multiple selected options */
    var isMulti: IsMulti
    
    /**
      * Override the built-in logic to detect whether an option is disabled
      *
      * An example can be found in the [Replacing builtins](/advanced#replacing-builtins) documentation.
      */
    def isOptionDisabled(option: Option, selectValue: Options[Option]): Boolean
    
    /** Override the built-in logic to detect whether an option is selected */
    var isOptionSelected: js.UndefOr[js.Function2[/* option */ Option, /* selectValue */ Options[Option], Boolean]] = js.undefined
    
    /** Is the select direction right-to-left */
    var isRtl: Boolean
    
    /** Whether to enable search functionality */
    var isSearchable: Boolean
    
    /** Async: Text to display when loading options */
    def loadingMessage(obj: InputValue): ReactNode
    
    /** Maximum height of the menu before scrolling */
    var maxMenuHeight: Double
    
    /** Whether the menu is open */
    var menuIsOpen: Boolean
    
    /**
      * Default placement of the menu in relation to the control. 'auto' will flip
      * when there isn't enough space below the control.
      */
    var menuPlacement: MenuPlacement
    
    /**
      * Whether the menu should use a portal, and where it should attach
      *
      * An example can be found in the [Portaling](/advanced#portaling) documentation
      */
    var menuPortalTarget: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /** The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: MenuPosition
    
    /** Whether to block scroll events when the menu is open */
    var menuShouldBlockScroll: Boolean
    
    /** Whether the menu should be scrolled into view when it opens */
    var menuShouldScrollIntoView: Boolean
    
    /** Minimum height of the menu before flipping */
    var minMenuHeight: Double
    
    /** Name of the HTML Input (optional - without this, no input will be rendered) */
    var name: js.UndefOr[String] = js.undefined
    
    /** Text to display when there are no options */
    def noOptionsMessage(obj: InputValue): ReactNode
    
    /** Handle blur events on the control */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /** Handle change events on the select */
    def onChange(newValue: OnChangeValue[Option, IsMulti], actionMeta: ActionMeta[Option]): Unit
    
    /** Handle focus events on the control */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /** Handle change events on the input */
    def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit
    
    /** Handle key down events on the select */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    /** Handle the menu closing */
    def onMenuClose(): Unit
    
    /** Handle the menu opening */
    def onMenuOpen(): Unit
    
    /** Fired when the user scrolls to the bottom of the menu */
    var onMenuScrollToBottom: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    /** Fired when the user scrolls to the top of the menu */
    var onMenuScrollToTop: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    /** Allows control of whether the menu is opened when the Select is clicked */
    var openMenuOnClick: Boolean
    
    /** Allows control of whether the menu is opened when the Select is focused */
    var openMenuOnFocus: Boolean
    
    /** Array of options that populate the select menu */
    var options: OptionsOrGroups[Option, Group]
    
    /** Number of options to jump in menu when page{up|down} keys are used */
    var pageSize: Double
    
    /** Placeholder for the select value */
    var placeholder: ReactNode
    
    /** Marks the value-holding input as required for form validation */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Status to relay to screen readers */
    def screenReaderStatus(obj: Count): String
    
    /**
      * Style modifier methods
      *
      * A basic example can be found at the bottom of the [Replacing builtins](/advanced#replacing-builtins) documentation.
      */
    var styles: StylesConfig[Option, IsMulti, Group]
    
    /** Sets the tabIndex attribute on the input */
    var tabIndex: Double
    
    /** Select the currently focused option when the user presses tab */
    var tabSelectsValue: Boolean
    
    /** Theme modifier method */
    var theme: js.UndefOr[ThemeConfig] = js.undefined
    
    /** The value of the select; reflected by the selected option */
    var value: PropsValue[Option]
  }
  object Props {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      backspaceRemovesValue: Boolean,
      blurInputOnSelect: Boolean,
      captureMenuScroll: Boolean,
      closeMenuOnScroll: Boolean | (js.Function1[/* event */ Event, Boolean]),
      closeMenuOnSelect: Boolean,
      components: SelectComponentsConfig[Option, IsMulti, Group],
      controlShouldRenderValue: Boolean,
      escapeClearsValue: Boolean,
      formatGroupLabel: Group => ReactNode,
      getOptionLabel: Option => String,
      getOptionValue: Option => String,
      inputValue: String,
      isDisabled: Boolean,
      isLoading: Boolean,
      isMulti: IsMulti,
      isOptionDisabled: (Option, Options[Option]) => Boolean,
      isRtl: Boolean,
      isSearchable: Boolean,
      loadingMessage: InputValue => ReactNode,
      maxMenuHeight: Double,
      menuIsOpen: Boolean,
      menuPlacement: MenuPlacement,
      menuPosition: MenuPosition,
      menuShouldBlockScroll: Boolean,
      menuShouldScrollIntoView: Boolean,
      minMenuHeight: Double,
      noOptionsMessage: InputValue => ReactNode,
      onChange: (OnChangeValue[Option, IsMulti], ActionMeta[Option]) => Unit,
      onInputChange: (String, InputActionMeta) => Unit,
      onMenuClose: () => Unit,
      onMenuOpen: () => Unit,
      openMenuOnClick: Boolean,
      openMenuOnFocus: Boolean,
      options: OptionsOrGroups[Option, Group],
      pageSize: Double,
      screenReaderStatus: Count => String,
      styles: StylesConfig[Option, IsMulti, Group],
      tabIndex: Double,
      tabSelectsValue: Boolean
    ): Props[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(backspaceRemovesValue = backspaceRemovesValue.asInstanceOf[js.Any], blurInputOnSelect = blurInputOnSelect.asInstanceOf[js.Any], captureMenuScroll = captureMenuScroll.asInstanceOf[js.Any], closeMenuOnScroll = closeMenuOnScroll.asInstanceOf[js.Any], closeMenuOnSelect = closeMenuOnSelect.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], controlShouldRenderValue = controlShouldRenderValue.asInstanceOf[js.Any], escapeClearsValue = escapeClearsValue.asInstanceOf[js.Any], formatGroupLabel = js.Any.fromFunction1(formatGroupLabel), getOptionLabel = js.Any.fromFunction1(getOptionLabel), getOptionValue = js.Any.fromFunction1(getOptionValue), inputValue = inputValue.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isOptionDisabled = js.Any.fromFunction2(isOptionDisabled), isRtl = isRtl.asInstanceOf[js.Any], isSearchable = isSearchable.asInstanceOf[js.Any], loadingMessage = js.Any.fromFunction1(loadingMessage), maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldBlockScroll = menuShouldBlockScroll.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any], noOptionsMessage = js.Any.fromFunction1(noOptionsMessage), onChange = js.Any.fromFunction2(onChange), onInputChange = js.Any.fromFunction2(onInputChange), onMenuClose = js.Any.fromFunction0(onMenuClose), onMenuOpen = js.Any.fromFunction0(onMenuOpen), openMenuOnClick = openMenuOnClick.asInstanceOf[js.Any], openMenuOnFocus = openMenuOnFocus.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], screenReaderStatus = js.Any.fromFunction1(screenReaderStatus), styles = styles.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tabSelectsValue = tabSelectsValue.asInstanceOf[js.Any], filterOption = null, value = null)
      __obj.asInstanceOf[Props[Option, IsMulti, Group]]
    }
    
    extension [Self <: Props[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (Props[Option, IsMulti, Group])) {
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def setAriaLiveMessages(value: AriaLiveMessages[Option, IsMulti, Group]): Self = StObject.set(x, "ariaLiveMessages", value.asInstanceOf[js.Any])
      
      inline def setAriaLiveMessagesUndefined: Self = StObject.set(x, "ariaLiveMessages", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackspaceRemovesValue(value: Boolean): Self = StObject.set(x, "backspaceRemovesValue", value.asInstanceOf[js.Any])
      
      inline def setBlurInputOnSelect(value: Boolean): Self = StObject.set(x, "blurInputOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCaptureMenuScroll(value: Boolean): Self = StObject.set(x, "captureMenuScroll", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixNull: Self = StObject.set(x, "classNamePrefix", null)
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseMenuOnScroll(value: Boolean | (js.Function1[/* event */ Event, Boolean])): Self = StObject.set(x, "closeMenuOnScroll", value.asInstanceOf[js.Any])
      
      inline def setCloseMenuOnScrollFunction1(value: /* event */ Event => Boolean): Self = StObject.set(x, "closeMenuOnScroll", js.Any.fromFunction1(value))
      
      inline def setCloseMenuOnSelect(value: Boolean): Self = StObject.set(x, "closeMenuOnSelect", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: SelectComponentsConfig[Option, IsMulti, Group]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setControlShouldRenderValue(value: Boolean): Self = StObject.set(x, "controlShouldRenderValue", value.asInstanceOf[js.Any])
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
      
      inline def setFilterOption(value: (/* option */ FilterOptionOption[Option], /* inputValue */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionNull: Self = StObject.set(x, "filterOption", null)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFormatGroupLabel(value: Group => ReactNode): Self = StObject.set(x, "formatGroupLabel", js.Any.fromFunction1(value))
      
      inline def setFormatOptionLabel(value: (/* data */ Option, /* formatOptionLabelMeta */ FormatOptionLabelMeta[Option]) => ReactNode): Self = StObject.set(x, "formatOptionLabel", js.Any.fromFunction2(value))
      
      inline def setFormatOptionLabelUndefined: Self = StObject.set(x, "formatOptionLabel", js.undefined)
      
      inline def setGetOptionLabel(value: Option => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setGetOptionValue(value: Option => String): Self = StObject.set(x, "getOptionValue", js.Any.fromFunction1(value))
      
      inline def setHideSelectedOptions(value: Boolean): Self = StObject.set(x, "hideSelectedOptions", value.asInstanceOf[js.Any])
      
      inline def setHideSelectedOptionsUndefined: Self = StObject.set(x, "hideSelectedOptions", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: Double | String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setIsClearable(value: Boolean): Self = StObject.set(x, "isClearable", value.asInstanceOf[js.Any])
      
      inline def setIsClearableUndefined: Self = StObject.set(x, "isClearable", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsMulti(value: IsMulti): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      inline def setIsOptionDisabled(value: (Option, Options[Option]) => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction2(value))
      
      inline def setIsOptionSelected(value: (/* option */ Option, /* selectValue */ Options[Option]) => Boolean): Self = StObject.set(x, "isOptionSelected", js.Any.fromFunction2(value))
      
      inline def setIsOptionSelectedUndefined: Self = StObject.set(x, "isOptionSelected", js.undefined)
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessage(value: InputValue => ReactNode): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction1(value))
      
      inline def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setMenuPlacement(value: MenuPlacement): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
      
      inline def setMenuPortalTarget(value: HTMLElement): Self = StObject.set(x, "menuPortalTarget", value.asInstanceOf[js.Any])
      
      inline def setMenuPortalTargetNull: Self = StObject.set(x, "menuPortalTarget", null)
      
      inline def setMenuPortalTargetUndefined: Self = StObject.set(x, "menuPortalTarget", js.undefined)
      
      inline def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuShouldBlockScroll(value: Boolean): Self = StObject.set(x, "menuShouldBlockScroll", value.asInstanceOf[js.Any])
      
      inline def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
      
      inline def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoOptionsMessage(value: InputValue => ReactNode): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction1(value))
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (OnChangeValue[Option, IsMulti], ActionMeta[Option]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputChange(value: (String, InputActionMeta) => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMenuClose(value: () => Unit): Self = StObject.set(x, "onMenuClose", js.Any.fromFunction0(value))
      
      inline def setOnMenuOpen(value: () => Unit): Self = StObject.set(x, "onMenuOpen", js.Any.fromFunction0(value))
      
      inline def setOnMenuScrollToBottom(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onMenuScrollToBottom", js.Any.fromFunction1(value))
      
      inline def setOnMenuScrollToBottomUndefined: Self = StObject.set(x, "onMenuScrollToBottom", js.undefined)
      
      inline def setOnMenuScrollToTop(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onMenuScrollToTop", js.Any.fromFunction1(value))
      
      inline def setOnMenuScrollToTopUndefined: Self = StObject.set(x, "onMenuScrollToTop", js.undefined)
      
      inline def setOpenMenuOnClick(value: Boolean): Self = StObject.set(x, "openMenuOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpenMenuOnFocus(value: Boolean): Self = StObject.set(x, "openMenuOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: OptionsOrGroups[Option, Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setScreenReaderStatus(value: Count => String): Self = StObject.set(x, "screenReaderStatus", js.Any.fromFunction1(value))
      
      inline def setStyles(value: StylesConfig[Option, IsMulti, Group]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabSelectsValue(value: Boolean): Self = StObject.set(x, "tabSelectsValue", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* theme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: PropsValue[Option]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type PublicBaseSelectProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = LibraryManagedAttributes[TypeofSelect, Props[Option, IsMulti, Group]]
  
  @js.native
  trait Select[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends Component[Props[Option, IsMulti, Group], State[Option, IsMulti, Group], Any] {
    
    def ariaOnChange(value: OnChangeValue[Option, IsMulti], actionMeta: ActionMeta[Option]): Unit = js.native
    
    var blockOptionHover: Boolean = js.native
    
    def blur(): Unit = js.native
    
    def blurInput(): Unit = js.native
    
    def buildCategorizedOptions(): js.Array[CategorizedGroupOrOption[Option, Group]] = js.native
    
    def buildFocusableOptions(): js.Array[Option] = js.native
    
    def clearValue(): Unit = js.native
    
    var commonProps: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSelect(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelect(prevProps: Props[Option, IsMulti, Group]): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSelect(): Unit = js.native
    
    var controlRef: HTMLDivElement | Null = js.native
    
    def cx(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): String = js.native
    
    def filterOption(option: FilterOptionOption[Option], inputValue: String): Boolean = js.native
    
    def focus(): Unit = js.native
    
    def focusInput(): Unit = js.native
    
    def focusOption(): Unit = js.native
    def focusOption(direction: FocusDirection): Unit = js.native
    
    def focusValue(direction: previous | next): Unit = js.native
    
    var focusedOptionRef: HTMLDivElement | Null = js.native
    
    def formatGroupLabel(data: Group): ReactNode = js.native
    
    def formatOptionLabel(data: Option, context: FormatOptionLabelContext): ReactNode = js.native
    
    def getCategorizedOptions(): js.Array[CategorizedGroupOrOption[Option, Group]] = js.native
    
    def getCommonProps(): ClearValue[Option, IsMulti, Group] = js.native
    
    def getComponents(): ClearIndicator = js.native
    
    var getControlRef: RefCallback[HTMLDivElement] = js.native
    
    def getElementId(element: group | input | listbox | option | placeholder | `live-region`): String = js.native
    
    def getFocusableOptions(): js.Array[Option] = js.native
    
    var getFocusedOptionRef: RefCallback[HTMLDivElement] = js.native
    
    var getInputRef: RefCallback[HTMLInputElement] = js.native
    
    var getMenuListRef: RefCallback[HTMLDivElement] = js.native
    
    def getOptionLabel(data: Option): String = js.native
    
    def getOptionValue(data: Option): String = js.native
    
    @JSName("getStyles")
    def getStyles_clearIndicator(key: clearIndicator, props: ClearIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_container(key: container, props: ContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_control(key: control, props: ControlProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_dropdownIndicator(key: dropdownIndicator, props: DropdownIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_group(key: group, props: GroupProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_groupHeading(key: groupHeading, props: GroupHeadingProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_indicatorSeparator(key: indicatorSeparator, props: IndicatorSeparatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_indicatorsContainer(key: indicatorsContainer, props: IndicatorsContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_input(key: input, props: InputProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_loadingIndicator(key: loadingIndicator, props: LoadingIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_loadingMessage(key: loadingMessage, props: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_menu(key: menu, props: MenuProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_menuList(key: menuList, props: MenuListProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_menuPortal(key: menuPortal, props: PortalStyleArgs): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_multiValue(key: multiValue, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_multiValueLabel(key: multiValueLabel, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_multiValueRemove(key: multiValueRemove, props: MultiValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_noOptionsMessage(key: noOptionsMessage, props: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_option(key: option, props: OptionProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_placeholder(key: placeholder, props: PlaceholderProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_singleValue(key: singleValue, props: SingleValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    @JSName("getStyles")
    def getStyles_valueContainer(key: valueContainer, props: ValueContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = js.native
    
    def getTheme(): Theme = js.native
    
    def getValue(): Options[Option] = js.native
    
    var handleInputChange: FormEventHandler[HTMLInputElement] = js.native
    
    def hasOptions(): Boolean = js.native
    
    def hasValue(): Boolean = js.native
    
    var initialTouchX: Double = js.native
    
    var initialTouchY: Double = js.native
    
    var inputRef: HTMLInputElement | Null = js.native
    
    var instancePrefix: String = js.native
    
    def isClearable(): Boolean = js.native
    
    var isComposing: Boolean = js.native
    
    def isOptionDisabled(option: Option, selectValue: Options[Option]): Boolean = js.native
    
    def isOptionSelected(option: Option, selectValue: Options[Option]): Boolean = js.native
    
    var menuListRef: HTMLDivElement | Null = js.native
    
    def onChange(newValue: OnChangeValue[Option, IsMulti], actionMeta: ActionMeta[Option]): Unit = js.native
    
    def onClearIndicatorMouseDown(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    def onClearIndicatorMouseDown(event: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
    
    var onClearIndicatorTouchEnd: TouchEventHandler[HTMLDivElement] = js.native
    
    def onCompositionEnd(): Unit = js.native
    
    def onCompositionStart(): Unit = js.native
    
    def onControlMouseDown(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    def onControlMouseDown(event: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
    
    var onControlTouchEnd: TouchEventHandler[HTMLDivElement] = js.native
    
    def onDropdownIndicatorMouseDown(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    def onDropdownIndicatorMouseDown(event: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
    
    var onDropdownIndicatorTouchEnd: TouchEventHandler[HTMLDivElement] = js.native
    
    var onInputBlur: FocusEventHandler[HTMLInputElement] = js.native
    
    def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
    
    var onInputFocus: FocusEventHandler[HTMLInputElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
    
    def onMenuClose(): Unit = js.native
    
    var onMenuMouseDown: MouseEventHandler[HTMLDivElement] = js.native
    
    var onMenuMouseMove: MouseEventHandler[HTMLDivElement] = js.native
    
    def onMenuOpen(): Unit = js.native
    
    def onOptionHover(focusedOption: Option): Unit = js.native
    
    def onScroll(event: Event): Unit = js.native
    
    def onTouchEnd(event: TouchEvent): Unit = js.native
    
    def onTouchMove(param0: TouchEvent): Unit = js.native
    
    def onTouchStart(param0: TouchEvent): Unit = js.native
    
    var onValueInputFocus: FocusEventHandler[Element] = js.native
    
    var openAfterFocus: Boolean = js.native
    
    def openMenu(focusOption: first | last): Unit = js.native
    
    def popValue(): Unit = js.native
    
    def removeValue(removedValue: Option): Unit = js.native
    
    def renderClearIndicator(): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderDropdownIndicator(): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderFormField(): js.UndefOr[typings.react.mod.global.JSX.Element] = js.native
    
    def renderIndicatorSeparator(): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderInput(): typings.react.mod.global.JSX.Element = js.native
    
    def renderLiveRegion(): typings.react.mod.global.JSX.Element = js.native
    
    def renderLoadingIndicator(): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderMenu(): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderPlaceholderOrValue(): typings.react.mod.global.JSX.Element | js.Array[typings.react.mod.global.JSX.Element] | Null = js.native
    
    var scrollToFocusedOptionOnUpdate: Boolean = js.native
    
    def selectOption(newValue: Option): Unit = js.native
    
    def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction): Unit = js.native
    def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction, option: Option): Unit = js.native
    
    def shouldHideSelectedOptions(): Boolean | IsMulti = js.native
    
    def startListeningComposition(): Unit = js.native
    
    def startListeningToTouch(): Unit = js.native
    
    def stopListeningComposition(): Unit = js.native
    
    def stopListeningToTouch(): Unit = js.native
    
    var userIsDragging: js.UndefOr[Boolean] = js.native
  }
  
  trait State[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var ariaSelection: (typings.reactSelect.distDeclarationsSrcAccessibilityMod.AriaSelection[Option, IsMulti]) | Null
    
    var clearFocusValueOnUpdate: Boolean
    
    var focusedOption: Option | Null
    
    var focusedValue: Option | Null
    
    var inputIsHidden: Boolean
    
    var inputIsHiddenAfterUpdate: js.UndefOr[Boolean | Null] = js.undefined
    
    var isFocused: Boolean
    
    var prevProps: (Props[Option, IsMulti, Group]) | Unit
    
    var prevWasFocused: Boolean
    
    var selectValue: Options[Option]
  }
  object State {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      clearFocusValueOnUpdate: Boolean,
      inputIsHidden: Boolean,
      isFocused: Boolean,
      prevProps: (Props[Option, IsMulti, Group]) | Unit,
      prevWasFocused: Boolean,
      selectValue: Options[Option]
    ): State[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(clearFocusValueOnUpdate = clearFocusValueOnUpdate.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevWasFocused = prevWasFocused.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any], ariaSelection = null, focusedOption = null, focusedValue = null)
      __obj.asInstanceOf[State[Option, IsMulti, Group]]
    }
    
    extension [Self <: State[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (State[Option, IsMulti, Group])) {
      
      inline def setAriaSelection(value: typings.reactSelect.distDeclarationsSrcAccessibilityMod.AriaSelection[Option, IsMulti]): Self = StObject.set(x, "ariaSelection", value.asInstanceOf[js.Any])
      
      inline def setAriaSelectionNull: Self = StObject.set(x, "ariaSelection", null)
      
      inline def setClearFocusValueOnUpdate(value: Boolean): Self = StObject.set(x, "clearFocusValueOnUpdate", value.asInstanceOf[js.Any])
      
      inline def setFocusedOption(value: Option): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      inline def setFocusedOptionNull: Self = StObject.set(x, "focusedOption", null)
      
      inline def setFocusedValue(value: Option): Self = StObject.set(x, "focusedValue", value.asInstanceOf[js.Any])
      
      inline def setFocusedValueNull: Self = StObject.set(x, "focusedValue", null)
      
      inline def setInputIsHidden(value: Boolean): Self = StObject.set(x, "inputIsHidden", value.asInstanceOf[js.Any])
      
      inline def setInputIsHiddenAfterUpdate(value: Boolean): Self = StObject.set(x, "inputIsHiddenAfterUpdate", value.asInstanceOf[js.Any])
      
      inline def setInputIsHiddenAfterUpdateNull: Self = StObject.set(x, "inputIsHiddenAfterUpdate", null)
      
      inline def setInputIsHiddenAfterUpdateUndefined: Self = StObject.set(x, "inputIsHiddenAfterUpdate", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setPrevProps(value: (Props[Option, IsMulti, Group]) | Unit): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevWasFocused(value: Boolean): Self = StObject.set(x, "prevWasFocused", value.asInstanceOf[js.Any])
      
      inline def setSelectValue(value: Options[Option]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      inline def setSelectValueVarargs(value: Option*): Self = StObject.set(x, "selectValue", js.Array(value*))
    }
  }
}
