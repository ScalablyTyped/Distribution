package typings.reactDashSelect.srcSelectMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEvent
import typings.reactDashSelect.Anon_Action
import typings.reactDashSelect.Anon_Context
import typings.reactDashSelect.Anon_ContextEvent
import typings.reactDashSelect.reactDashSelectStrings.first
import typings.reactDashSelect.reactDashSelectStrings.group
import typings.reactDashSelect.reactDashSelectStrings.input
import typings.reactDashSelect.reactDashSelectStrings.last
import typings.reactDashSelect.reactDashSelectStrings.listbox
import typings.reactDashSelect.reactDashSelectStrings.next
import typings.reactDashSelect.reactDashSelectStrings.option
import typings.reactDashSelect.reactDashSelectStrings.previous
import typings.reactDashSelect.srcComponentsMod.PlaceholderOrValue
import typings.reactDashSelect.srcComponentsMod.SelectComponents
import typings.reactDashSelect.srcTypesMod.ActionTypes
import typings.reactDashSelect.srcTypesMod.FocusDirection
import typings.reactDashSelect.srcTypesMod.InputActionMeta
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[OptionType]
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: Boolean = js.native
  var clearFocusValueOnUpdate: Boolean = js.native
  var commonProps: js.Any = js.native
   // TODO
  var components: SelectComponents[OptionType] = js.native
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  var focusedOptionRef: ElRef = js.native
  var formatGroupLabel: typings.reactDashSelect.srcBuiltinsMod.formatGroupLabel[OptionType] = js.native
  var getOptionLabel: typings.reactDashSelect.srcBuiltinsMod.getOptionLabel[OptionType] = js.native
  var getOptionValue: typings.reactDashSelect.srcBuiltinsMod.getOptionValue[OptionType] = js.native
  var hasGroups: Boolean = js.native
  var initialTouchX: Double = js.native
  var initialTouchY: Double = js.native
  var inputIsHiddenAfterUpdate: Boolean | Null = js.native
  var inputRef: ElRef = js.native
  var instancePrefix: String = js.native
  var menuListRef: ElRef = js.native
  var openAfterFocus: Boolean = js.native
  var scrollToFocusedOptionOnUpdate: Boolean = js.native
  var userIsDragging: Boolean | Null = js.native
  def announceAriaLiveContext(props: Anon_ContextEvent): Unit = js.native
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: Anon_Context): Unit = js.native
  def blur(): Unit = js.native
  def blurInput(): Unit = js.native
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
  def clearValue(): Unit = js.native
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): String = js.native
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
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): ReactNode = js.native
  def getActiveDescendentId(): js.Any = js.native
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): Anon_Action[OptionType] = js.native
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
  def getStyles(key: String, props: js.Object): js.Object = js.native
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def hasOptions(): Boolean = js.native
  def hasValue(): Boolean = js.native
  def isClearable(): Boolean = js.native
  def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
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
  def onScroll(event: Event): Unit = js.native
  def onTouchEnd(event: typings.std.TouchEvent): Unit = js.native
  def onTouchMove(event: typings.std.TouchEvent): Unit = js.native
  def onTouchStart(event: typings.std.TouchEvent): Unit = js.native
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
}

