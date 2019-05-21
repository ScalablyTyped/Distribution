package typings
package reactDashSelectLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[OptionType]
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: scala.Boolean = js.native
  var clearFocusValueOnUpdate: scala.Boolean = js.native
  var commonProps: js.Any = js.native
   // TODO
  var components: reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  var focusedOptionRef: ElRef = js.native
  var formatGroupLabel: reactDashSelectLib.libBuiltinsMod.formatGroupLabel[OptionType] = js.native
  var getOptionLabel: reactDashSelectLib.libBuiltinsMod.getOptionLabel[OptionType] = js.native
  var getOptionValue: reactDashSelectLib.libBuiltinsMod.getOptionValue[OptionType] = js.native
  var hasGroups: scala.Boolean = js.native
  var initialTouchX: scala.Double = js.native
  var initialTouchY: scala.Double = js.native
  var inputIsHiddenAfterUpdate: scala.Boolean | scala.Null = js.native
  var inputRef: ElRef = js.native
  var instancePrefix: java.lang.String = js.native
  var menuListRef: ElRef = js.native
  var openAfterFocus: scala.Boolean = js.native
  var scrollToFocusedOptionOnUpdate: scala.Boolean = js.native
  var userIsDragging: scala.Boolean | scala.Null = js.native
  def announceAriaLiveContext(props: reactDashSelectLib.Anon_ContextEvent): scala.Unit = js.native
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: reactDashSelectLib.Anon_Context): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def blurInput(): scala.Unit = js.native
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: reactDashSelectLib.libTypesMod.OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: reactDashSelectLib.libComponentsMod.SelectComponents[OptionType]): scala.Unit = js.native
  def clearValue(): scala.Unit = js.native
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): java.lang.String = js.native
  def countOptions(): scala.Double = js.native
  def filterOption(option: js.Object, inputValue: java.lang.String): scala.Boolean = js.native
  // aliased for consumers
  def focus(): scala.Unit = js.native
  // ==============================
  // Methods
  // ==============================
  def focusInput(): scala.Unit = js.native
  def focusOption(direction: reactDashSelectLib.libTypesMod.FocusDirection): scala.Unit = js.native
  @JSName("focusValue")
  def focusValue_next(direction: reactDashSelectLib.reactDashSelectLibStrings.next): scala.Unit = js.native
  @JSName("focusValue")
  def focusValue_previous(direction: reactDashSelectLib.reactDashSelectLibStrings.previous): scala.Unit = js.native
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): reactLib.reactMod.ReactNode = js.native
  def getActiveDescendentId(): js.Any = js.native
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): reactDashSelectLib.Anon_Action[OptionType] = js.native
  def getControlRef(ref: stdLib.HTMLElement): scala.Unit = js.native
  @JSName("getElementId")
  def getElementId_group(element: reactDashSelectLib.reactDashSelectLibStrings.group): java.lang.String = js.native
  @JSName("getElementId")
  def getElementId_input(element: reactDashSelectLib.reactDashSelectLibStrings.input): java.lang.String = js.native
  @JSName("getElementId")
  def getElementId_listbox(element: reactDashSelectLib.reactDashSelectLibStrings.listbox): java.lang.String = js.native
  @JSName("getElementId")
  def getElementId_option(element: reactDashSelectLib.reactDashSelectLibStrings.option): java.lang.String = js.native
  def getFocusedOptionRef(ref: stdLib.HTMLElement): scala.Unit = js.native
  def getInputRef(ref: stdLib.HTMLElement): scala.Unit = js.native
  def getMenuListRef(ref: stdLib.HTMLElement): scala.Unit = js.native
  def getNextFocusedOption(options: reactDashSelectLib.libTypesMod.OptionsType[OptionType]): OptionType = js.native
  def getNextFocusedValue(nextSelectValue: reactDashSelectLib.libTypesMod.OptionsType[OptionType]): OptionType = js.native
  def getStyles(key: java.lang.String, props: js.Object): js.Object = js.native
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def hasOptions(): scala.Boolean = js.native
  def hasValue(): scala.Boolean = js.native
  def isClearable(): scala.Boolean = js.native
  def isOptionDisabled(option: OptionType, selectValue: reactDashSelectLib.libTypesMod.OptionsType[OptionType]): scala.Boolean = js.native
  def isOptionSelected(option: OptionType, selectValue: reactDashSelectLib.libTypesMod.OptionsType[OptionType]): scala.Boolean = js.native
  def onClearIndicatorMouseDown(event: MouseOrTouchEvent): scala.Unit = js.native
  def onClearIndicatorTouchEnd(event: reactLib.reactMod.TouchEvent[stdLib.HTMLElement]): scala.Unit = js.native
  def onCompositionEnd(): scala.Unit = js.native
  def onCompositionStart(): scala.Unit = js.native
  def onControlMouseDown(event: MouseOrTouchEvent): scala.Unit = js.native
  def onControlTouchEnd(event: reactLib.reactMod.TouchEvent[stdLib.HTMLElement]): scala.Unit = js.native
  def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): scala.Unit = js.native
  def onDropdownIndicatorTouchEnd(event: reactLib.reactMod.TouchEvent[stdLib.HTMLElement]): scala.Unit = js.native
  def onInputBlur(event: reactLib.reactMod.FocusEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def onInputChange(newValue: java.lang.String, actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta): scala.Unit = js.native
  def onInputFocus(event: reactLib.reactMod.FocusEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  // ==============================
  // Keyboard Handlers
  // ==============================
  def onKeyDown(event: reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement]): scala.Unit = js.native
  def onMenuClose(): scala.Unit = js.native
  // ==============================
  // Mouse Handlers
  // ==============================
  def onMenuMouseDown(event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onMenuMouseMove(event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  // ==============================
  // Consumer Handlers
  // ==============================
  def onMenuOpen(): scala.Unit = js.native
  def onOptionHover(focusedOption: OptionType): scala.Unit = js.native
  def onScroll(event: stdLib.Event): scala.Unit = js.native
  def onTouchEnd(event: stdLib.TouchEvent): scala.Unit = js.native
  def onTouchMove(event: stdLib.TouchEvent): scala.Unit = js.native
  def onTouchStart(event: stdLib.TouchEvent): scala.Unit = js.native
  @JSName("openMenu")
  def openMenu_first(focusOption: reactDashSelectLib.reactDashSelectLibStrings.first): scala.Unit = js.native
  @JSName("openMenu")
  def openMenu_last(focusOption: reactDashSelectLib.reactDashSelectLibStrings.last): scala.Unit = js.native
  def popValue(): scala.Unit = js.native
  def removeValue(removedValue: OptionType): scala.Unit = js.native
  def renderClearIndicator(): reactLib.reactMod.ReactNode = js.native
  def renderDropdownIndicator(): reactLib.reactMod.ReactNode = js.native
  def renderFormField(): reactLib.reactMod.ReactNode = js.native
  def renderIndicatorSeparator(): reactLib.reactMod.ReactNode = js.native
  def renderInput(): reactLib.reactMod.ReactNode = js.native
  def renderLiveRegion(): reactLib.reactMod.ReactNode = js.native
  def renderLoadingIndicator(): reactLib.reactMod.ReactNode = js.native
  def renderMenu(): reactLib.reactMod.ReactNode = js.native
  def renderPlaceholderOrValue(): reactDashSelectLib.libComponentsMod.PlaceholderOrValue[OptionType] | scala.Null = js.native
  def selectOption(newValue: OptionType): scala.Unit = js.native
  def setValue(
    newValue: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    action: reactDashSelectLib.libTypesMod.ActionTypes
  ): scala.Unit = js.native
  def setValue(
    newValue: reactDashSelectLib.libTypesMod.ValueType[OptionType],
    action: reactDashSelectLib.libTypesMod.ActionTypes,
    option: OptionType
  ): scala.Unit = js.native
  def shouldHideSelectedOptions(): scala.Boolean = js.native
  // ==============================
  // Composition Handlers
  // ==============================
  def startListeningComposition(): scala.Unit = js.native
  // ==============================
  // Touch Handlers
  // ==============================
  def startListeningToTouch(): scala.Unit = js.native
  def stopListeningComposition(): scala.Unit = js.native
  def stopListeningToTouch(): scala.Unit = js.native
}

