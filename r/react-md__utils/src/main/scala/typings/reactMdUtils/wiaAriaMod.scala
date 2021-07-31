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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wiaAriaMod {
  
  @JSImport("@react-md/utils/types/wia-aria", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.IncrementMovementKey & String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown & String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft & String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight & String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp & String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown & String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp & String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown & String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft & String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight & String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp & String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown & String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp & String = js.native
    
    /* "PageDown" */ val PageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown & String = js.native
    
    /* "PageUp" */ val PageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp & String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown & String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft & String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight & String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp & String = js.native
  }
  
  @JSImport("@react-md/utils/types/wia-aria", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.JumpMovementKey & String] = js.native
    
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd & String = js.native
    
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome & String = js.native
    
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd & String = js.native
    
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome & String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd & String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome & String = js.native
    
    /* "End" */ val End: typings.reactMdUtils.movementTypesMod.JumpMovementKey.End & String = js.native
    
    /* "Home" */ val Home: typings.reactMdUtils.movementTypesMod.JumpMovementKey.Home & String = js.native
  }
  
  object MovementPresets {
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @scala.inline
  def disable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def extractTextContent(stringOrElement: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def focusElementWithin(container: Document, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: Document, focus: Focus, programatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: HTMLElement, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  @scala.inline
  def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  @scala.inline
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  @scala.inline
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  @scala.inline
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(hasDefaultFocusedIndexOnChangeOptions.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  @scala.inline
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Unit, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  @scala.inline
  def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
