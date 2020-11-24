package typings.reactSelect.selectMod

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.reactSelect.anon.ClearValue
import typings.reactSelect.anon.Context
import typings.reactSelect.anon.Event
import typings.reactSelect.componentsMod.PlaceholderOrValue
import typings.reactSelect.componentsMod.SelectComponents
import typings.reactSelect.reactSelectStrings.first
import typings.reactSelect.reactSelectStrings.group
import typings.reactSelect.reactSelectStrings.input
import typings.reactSelect.reactSelectStrings.last
import typings.reactSelect.reactSelectStrings.listbox
import typings.reactSelect.reactSelectStrings.next
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.reactSelectStrings.previous
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.FocusDirection
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select[OptionType /* <: OptionTypeBase */]
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  
  def announceAriaLiveContext(props: Event): Unit = js.native
  
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: Context): Unit = js.native
  
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: Boolean = js.native
  
  def blur(): Unit = js.native
  
  def blurInput(): Unit = js.native
  
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
  
  var clearFocusValueOnUpdate: Boolean = js.native
  
  def clearValue(): Unit = js.native
  
  var commonProps: js.Any = js.native
  
   // TODO
  var components: SelectComponents[OptionType] = js.native
  
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): String = js.native
  
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  
  def countOptions(): Double = js.native
  
  def filterOption(option: js.Object, inputValue: String): Boolean = js.native
  
  // aliased for consumers
  def focus(): Unit = js.native
  
  // ==============================
  // Methods
  // ==============================
  def focusInput(): Unit = js.native
  
  def focusOption(direction: FocusDirection): Unit = js.native
  
  @JSName("focusValue")
  def focusValue_next(direction: next): Unit = js.native
  @JSName("focusValue")
  def focusValue_previous(direction: previous): Unit = js.native
  
  var focusedOptionRef: ElRef = js.native
  
  var formatGroupLabel: typings.reactSelect.builtinsMod.formatGroupLabel[OptionType] = js.native
  
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): ReactNode = js.native
  
  def getActiveDescendentId(): js.Any = js.native
  
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): ClearValue[OptionType] = js.native
  
  def getControlRef(ref: HTMLElement): Unit = js.native
  
  @JSName("getElementId")
  def getElementId_group(element: group): String = js.native
  @JSName("getElementId")
  def getElementId_input(element: input): String = js.native
  @JSName("getElementId")
  def getElementId_listbox(element: listbox): String = js.native
  @JSName("getElementId")
  def getElementId_option(element: option): String = js.native
  
  def getFocusedOptionRef(ref: HTMLElement): Unit = js.native
  
  def getInputRef(ref: HTMLElement): Unit = js.native
  
  def getMenuListRef(ref: HTMLElement): Unit = js.native
  
  def getNextFocusedOption(options: OptionsType[OptionType]): OptionType = js.native
  
  def getNextFocusedValue(nextSelectValue: OptionsType[OptionType]): OptionType = js.native
  
  var getOptionLabel: typings.reactSelect.builtinsMod.getOptionLabel[OptionType] = js.native
  
  var getOptionValue: typings.reactSelect.builtinsMod.getOptionValue[OptionType] = js.native
  
  def getStyles(key: String, props: js.Object): js.Object = js.native
  
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: KeyboardEvent[HTMLInputElement]): Unit = js.native
  
  var hasGroups: Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasValue(): Boolean = js.native
  
  var initialTouchX: Double = js.native
  
  var initialTouchY: Double = js.native
  
  var inputIsHiddenAfterUpdate: Boolean | Null = js.native
  
  var inputRef: ElRef = js.native
  
  var instancePrefix: String = js.native
  
  def isClearable(): Boolean = js.native
  
  def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  
  def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  
  var menuListRef: ElRef = js.native
  
  def onClearIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onClearIndicatorTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
  
  def onCompositionEnd(): Unit = js.native
  
  def onCompositionStart(): Unit = js.native
  
  def onControlMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onControlTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
  
  def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onDropdownIndicatorTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
  
  def onInputBlur(event: FocusEvent[HTMLInputElement]): Unit = js.native
  
  def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
  
  def onInputFocus(event: FocusEvent[HTMLInputElement]): Unit = js.native
  
  // ==============================
  // Keyboard Handlers
  // ==============================
  def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit = js.native
  
  def onMenuClose(): Unit = js.native
  
  // ==============================
  // Mouse Handlers
  // ==============================
  def onMenuMouseDown(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  def onMenuMouseMove(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  // ==============================
  // Consumer Handlers
  // ==============================
  def onMenuOpen(): Unit = js.native
  
  def onOptionHover(focusedOption: OptionType): Unit = js.native
  
  def onScroll(event: typings.std.Event): Unit = js.native
  
  def onTouchEnd(event: typings.std.TouchEvent): Unit = js.native
  
  def onTouchMove(event: typings.std.TouchEvent): Unit = js.native
  
  def onTouchStart(event: typings.std.TouchEvent): Unit = js.native
  
  var openAfterFocus: Boolean = js.native
  
  @JSName("openMenu")
  def openMenu_first(focusOption: first): Unit = js.native
  @JSName("openMenu")
  def openMenu_last(focusOption: last): Unit = js.native
  
  def popValue(): Unit = js.native
  
  def removeValue(removedValue: OptionType): Unit = js.native
  
  def renderClearIndicator(): ReactNode = js.native
  
  def renderDropdownIndicator(): ReactNode = js.native
  
  def renderFormField(): ReactNode = js.native
  
  def renderIndicatorSeparator(): ReactNode = js.native
  
  def renderInput(): ReactNode = js.native
  
  def renderLiveRegion(): ReactNode = js.native
  
  def renderLoadingIndicator(): ReactNode = js.native
  
  def renderMenu(): ReactNode = js.native
  
  def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
  
  var scrollToFocusedOptionOnUpdate: Boolean = js.native
  
  def selectOption(newValue: OptionType): Unit = js.native
  
  def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
  
  def shouldHideSelectedOptions(): Boolean = js.native
  
  // ==============================
  // Composition Handlers
  // ==============================
  def startListeningComposition(): Unit = js.native
  
  // ==============================
  // Touch Handlers
  // ==============================
  def startListeningToTouch(): Unit = js.native
  
  def stopListeningComposition(): Unit = js.native
  
  def stopListeningToTouch(): Unit = js.native
  
  var userIsDragging: Boolean | Null = js.native
}
