package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.reactMdUtils.focusContainerMod.FocusContainerProps
import typings.reactMdUtils.focusElementWithinMod.Focus
import typings.reactMdUtils.getInstanceMod.RefOrInstance
import typings.reactMdUtils.movementTypesMod.MovementConfig
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typings.reactMdUtils.usePreviousFocusMod.FocusFallback
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria", JSImport.Namespace)
@js.native
object wiaAriaMod extends js.Object {
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  /**
    * The `FocusContainer` is a wrapper for a few of the accessibility hooks to
    * maintain focus within an element.
    */
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps with RefAttributes[HTMLDivElement]] = js.native
  def extractTextContent(stringOrElement: String): String = js.native
  def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = js.native
  def extractTextContent(stringOrElement: HTMLElement): String = js.native
  def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = js.native
  def focusElementWithin(container: Document, focus: Focus): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: js.UndefOr[scala.Nothing], preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean
  ): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: js.UndefOr[scala.Nothing],
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: js.UndefOr[scala.Nothing],
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = js.native
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = js.native
  def getFocusableElements(container: Document): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = js.native
  def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = js.native
  def getItemId(id: String, i: Double): String = js.native
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = js.native
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = js.native
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean
  ): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: js.UndefOr[scala.Nothing],
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programatic: Boolean): Unit = js.native
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = js.native
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = js.native
  def usePreviousFocus(disabled: Boolean): Unit = js.native
  def usePreviousFocus(disabled: Boolean, fallback: js.UndefOr[FocusFallback], previousElement: HTMLElement): Unit = js.native
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = js.native
  def useScrollLock(enabled: Boolean): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = js.native
  def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = js.native
  @js.native
  object IncrementMovementKey extends js.Object {
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown with String = js.native
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft with String = js.native
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight with String = js.native
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp with String = js.native
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown with String = js.native
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp with String = js.native
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown with String = js.native
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft with String = js.native
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight with String = js.native
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp with String = js.native
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown with String = js.native
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp with String = js.native
    /* "PageDown" */ val PageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown with String = js.native
    /* "PageUp" */ val PageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp with String = js.native
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown with String = js.native
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft with String = js.native
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight with String = js.native
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.IncrementMovementKey with String] = js.native
  }
  
  @js.native
  object JumpMovementKey extends js.Object {
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd with String = js.native
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome with String = js.native
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd with String = js.native
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome with String = js.native
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd with String = js.native
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome with String = js.native
    /* "End" */ val End: typings.reactMdUtils.movementTypesMod.JumpMovementKey.End with String = js.native
    /* "Home" */ val Home: typings.reactMdUtils.movementTypesMod.JumpMovementKey.Home with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.JumpMovementKey with String] = js.native
  }
  
  @js.native
  object MovementPresets extends js.Object {
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    val VERTICAL_MENU: MovementConfig = js.native
    val VERTICAL_TABS: MovementConfig = js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
}

