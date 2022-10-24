package typings.reactMdUtils

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.reactMdUtils.typesWiaAriaFocusContainerMod.FocusContainerProps
import typings.reactMdUtils.typesWiaAriaFocusElementWithinMod.Focus
import typings.reactMdUtils.typesWiaAriaGetInstanceMod.RefOrInstance
import typings.reactMdUtils.typesWiaAriaIsFocusableMod.ElementFocusType
import typings.reactMdUtils.typesWiaAriaMovementTypesMod.MovementConfig
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.typesWiaAriaMovementUseFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementProviders
import typings.reactMdUtils.typesWiaAriaRadioRadioGroupMod.RadioGroupProps
import typings.reactMdUtils.typesWiaAriaRadioRadioWidgetMod.RadioWidgetProps
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import typings.reactMdUtils.typesWiaAriaTryToSubmitRelatedFormMod.KeyboardSubmitEventPartial
import typings.reactMdUtils.typesWiaAriaUsePreviousFocusMod.FocusFallback
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaMod {
  
  @JSImport("@react-md/utils/types/wia-aria", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "FOCUSABLE_ELEMENTS")
  @js.native
  val FOCUSABLE_ELEMENTS: js.Array[String] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey & String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowDown & String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowLeft & String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowRight & String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowUp & String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageDown & String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageUp & String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowDown & String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowLeft & String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowRight & String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowUp & String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowDown & String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowUp & String = js.native
    
    /* "PageDown" */ val PageDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageDown & String = js.native
    
    /* "PageUp" */ val PageUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageUp & String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowDown & String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowLeft & String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowRight & String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowUp & String = js.native
  }
  
  @JSImport("@react-md/utils/types/wia-aria", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey & String] = js.native
    
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltEnd & String = js.native
    
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltHome & String = js.native
    
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlEnd & String = js.native
    
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlHome & String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftEnd & String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftHome & String = js.native
    
    /* "End" */ val End: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.End & String = js.native
    
    /* "Home" */ val Home: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.Home & String = js.native
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
  
  @JSImport("@react-md/utils/types/wia-aria", "PROGRAMATICALLY_FOCUSABLE")
  @js.native
  val PROGRAMATICALLY_FOCUSABLE: String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "RadioGroup")
  @js.native
  val RadioGroup: ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria", "TAB_FOCUSABLE")
  @js.native
  val TAB_FOCUSABLE: String = js.native
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def disableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extractTextContent(stringOrElement: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def focusElementWithin(container: Document, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isFocusable(element: Document): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Document, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def tryToSubmitRelatedForm(event: KeyboardSubmitEventPartial): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToSubmitRelatedForm")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: ActiveDescendantOptions[D, CE, IE]): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Unit, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: KeyboardMovementOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
