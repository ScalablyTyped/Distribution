package typings.reachDropdown

import typings.reachDescendants.mod.Descendant
import typings.reachDropdown.anon.Data
import typings.reachDropdown.anon.DataControls
import typings.reachDropdown.anon.DataProps
import typings.reachDropdown.anon.DropdownContextValueisOpe
import typings.reachDropdown.anon.Index
import typings.reachDropdown.anon.Props
import typings.reachDropdown.anon.Ref
import typings.reachDropdown.anon.RefForwardedRef
import typings.reachDropdown.anon.X
import typings.reachDropdown.reachDropdownStrings.button
import typings.reachDropdown.reachDropdownStrings.div
import typings.reachPolymorphic.mod.ForwardRefComponent
import typings.reachPopover.mod.Position
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.Dispatch
import typings.react.mod.FC
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * DropdownItem
    */
  @JSImport("@reach/dropdown", "DropdownItem")
  @js.native
  val DropdownItem: ForwardRefComponent[div, DropdownItemProps] = js.native
  
  /**
    * DropdownItem
    */
  @JSImport("@reach/dropdown", "DropdownItems")
  @js.native
  val DropdownItems: ForwardRefComponent[div, DropdownItemsProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownPopover")
  @js.native
  val DropdownPopover: ForwardRefComponent[div, DropdownPopoverProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownProvider")
  @js.native
  val DropdownProvider: FC[DropdownProviderProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownTrigger")
  @js.native
  val DropdownTrigger: ForwardRefComponent[button, DropdownTriggerProps] = js.native
  
  inline def useDropdownContext(callerComponentName: String): InternalDropdownContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownContext")(callerComponentName.asInstanceOf[js.Any]).asInstanceOf[InternalDropdownContextValue]
  
  inline def useDropdownDescendants(): js.Array[DropdownDescendant] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownDescendants")().asInstanceOf[js.Array[DropdownDescendant]]
  
  inline def useDropdownItem_div(param0: DropdownItemProps & ComponentPropsWithoutRef[div] & Ref): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def useDropdownItems_div(param0: DropdownItemsProps & ComponentPropsWithoutRef[div] & Ref): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItems")(param0.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  inline def useDropdownPopover_div(param0: DropdownPopoverProps & ComponentPropsWithoutRef[div] & Ref): DataProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownPopover")(param0.asInstanceOf[js.Any]).asInstanceOf[DataProps]
  
  inline def useDropdownTrigger_button(param0: DropdownTriggerProps & ComponentPropsWithoutRef[button] & RefForwardedRef): DataControls = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownTrigger")(param0.asInstanceOf[js.Any]).asInstanceOf[DataControls]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reachDropdown.anon.Type
    - typings.reachDropdown.anon.`0`
    - typings.reachDropdown.anon.`1`
    - typings.reachDropdown.anon.Payload
    - typings.reachDropdown.anon.`2`
    - typings.reachDropdown.anon.PayloadType
    - typings.reachDropdown.anon.`3`
    - typings.reachDropdown.anon.PayloadString
    - typings.reachDropdown.anon.PayloadStringType
  */
  trait DropdownAction extends StObject
  object DropdownAction {
    
    inline def `0`(): typings.reachDropdown.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLOSE_MENU")
      __obj.asInstanceOf[typings.reachDropdown.anon.`0`]
    }
    
    inline def `1`(): typings.reachDropdown.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("OPEN_MENU_AT_FIRST_ITEM")
      __obj.asInstanceOf[typings.reachDropdown.anon.`1`]
    }
    
    inline def `2`(): typings.reachDropdown.anon.`2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("OPEN_MENU_CLEARED")
      __obj.asInstanceOf[typings.reachDropdown.anon.`2`]
    }
    
    inline def `3`(): typings.reachDropdown.anon.`3` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLEAR_SELECTION_INDEX")
      __obj.asInstanceOf[typings.reachDropdown.anon.`3`]
    }
    
    inline def Payload(payload: Index): typings.reachDropdown.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("OPEN_MENU_AT_INDEX")
      __obj.asInstanceOf[typings.reachDropdown.anon.Payload]
    }
    
    inline def PayloadString(payload: String): typings.reachDropdown.anon.PayloadString = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_BUTTON_ID")
      __obj.asInstanceOf[typings.reachDropdown.anon.PayloadString]
    }
    
    inline def PayloadStringType(payload: String): typings.reachDropdown.anon.PayloadStringType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SEARCH_FOR_ITEM")
      __obj.asInstanceOf[typings.reachDropdown.anon.PayloadStringType]
    }
    
    inline def PayloadType(payload: typings.reachDropdown.anon.DropdownRef): typings.reachDropdown.anon.PayloadType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SELECT_ITEM_AT_INDEX")
      __obj.asInstanceOf[typings.reachDropdown.anon.PayloadType]
    }
    
    inline def Type(): typings.reachDropdown.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLICK_MENU_ITEM")
      __obj.asInstanceOf[typings.reachDropdown.anon.Type]
    }
  }
  
  trait DropdownContextValue extends StObject {
    
    var isExpanded: Boolean
  }
  object DropdownContextValue {
    
    inline def apply(isExpanded: Boolean): DropdownContextValue = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownContextValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownContextValue] (val x: Self) extends AnyVal {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownDescendant
    extends StObject
       with Descendant[HTMLElement] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isLink: Boolean
    
    var key: String
  }
  object DropdownDescendant {
    
    inline def apply(index: Double, isLink: Boolean, key: String): DropdownDescendant = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isLink = isLink.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[DropdownDescendant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownDescendant] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownItemProps extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    def onSelect(): Unit
    
    var valueText: js.UndefOr[String] = js.undefined
  }
  object DropdownItemProps {
    
    inline def apply(onSelect: () => Unit): DropdownItemProps = {
      val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
      __obj.asInstanceOf[DropdownItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    }
  }
  
  trait DropdownItemsProps extends StObject {
    
    var children: ReactNode
  }
  object DropdownItemsProps {
    
    inline def apply(): DropdownItemsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownItemsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownItemsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait DropdownPopoverProps extends StObject {
    
    var children: ReactNode
    
    var portal: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object DropdownPopoverProps {
    
    inline def apply(): DropdownPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownPopoverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownPopoverProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait DropdownProviderProps extends StObject {
    
    var children: ReactNode | (js.Function1[/* props */ DropdownContextValueisOpe, ReactNode])
    
    var id: js.UndefOr[String] = js.undefined
  }
  object DropdownProviderProps {
    
    inline def apply(): DropdownProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ DropdownContextValueisOpe, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ DropdownContextValueisOpe => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type DropdownRef = RefObject[Null | HTMLElement]
  
  trait DropdownState extends StObject {
    
    var isExpanded: Boolean
    
    var selectionIndex: Double
    
    var triggerId: Null | String
    
    var typeaheadQuery: String
  }
  object DropdownState {
    
    inline def apply(isExpanded: Boolean, selectionIndex: Double, typeaheadQuery: String): DropdownState = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], typeaheadQuery = typeaheadQuery.asInstanceOf[js.Any], triggerId = null)
      __obj.asInstanceOf[DropdownState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownState] (val x: Self) extends AnyVal {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
      
      inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
      
      inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
      
      inline def setTypeaheadQuery(value: String): Self = StObject.set(x, "typeaheadQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownTriggerProps extends StObject {
    
    var children: ReactNode
  }
  object DropdownTriggerProps {
    
    inline def apply(): DropdownTriggerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownTriggerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownTriggerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait InternalDropdownContextValue extends StObject {
    
    var dispatch: Dispatch[DropdownAction]
    
    var dropdownId: js.UndefOr[String] = js.undefined
    
    var dropdownRef: DropdownRef
    
    var mouseDownStartPosRef: MutableRefObject[X]
    
    var popoverRef: PopoverRef
    
    var readyToSelect: MutableRefObject[Boolean]
    
    var selectCallbacks: MutableRefObject[js.Array[js.Function0[Unit]]]
    
    var state: DropdownState
    
    var triggerClickedRef: MutableRefObject[Boolean]
    
    var triggerRef: TriggerRef
  }
  object InternalDropdownContextValue {
    
    inline def apply(
      dispatch: DropdownAction => Unit,
      dropdownRef: DropdownRef,
      mouseDownStartPosRef: MutableRefObject[X],
      popoverRef: PopoverRef,
      readyToSelect: MutableRefObject[Boolean],
      selectCallbacks: MutableRefObject[js.Array[js.Function0[Unit]]],
      state: DropdownState,
      triggerClickedRef: MutableRefObject[Boolean],
      triggerRef: TriggerRef
    ): InternalDropdownContextValue = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), dropdownRef = dropdownRef.asInstanceOf[js.Any], mouseDownStartPosRef = mouseDownStartPosRef.asInstanceOf[js.Any], popoverRef = popoverRef.asInstanceOf[js.Any], readyToSelect = readyToSelect.asInstanceOf[js.Any], selectCallbacks = selectCallbacks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], triggerClickedRef = triggerClickedRef.asInstanceOf[js.Any], triggerRef = triggerRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDropdownContextValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalDropdownContextValue] (val x: Self) extends AnyVal {
      
      inline def setDispatch(value: DropdownAction => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDropdownId(value: String): Self = StObject.set(x, "dropdownId", value.asInstanceOf[js.Any])
      
      inline def setDropdownIdUndefined: Self = StObject.set(x, "dropdownId", js.undefined)
      
      inline def setDropdownRef(value: DropdownRef): Self = StObject.set(x, "dropdownRef", value.asInstanceOf[js.Any])
      
      inline def setMouseDownStartPosRef(value: MutableRefObject[X]): Self = StObject.set(x, "mouseDownStartPosRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRef(value: PopoverRef): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setReadyToSelect(value: MutableRefObject[Boolean]): Self = StObject.set(x, "readyToSelect", value.asInstanceOf[js.Any])
      
      inline def setSelectCallbacks(value: MutableRefObject[js.Array[js.Function0[Unit]]]): Self = StObject.set(x, "selectCallbacks", value.asInstanceOf[js.Any])
      
      inline def setState(value: DropdownState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTriggerClickedRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "triggerClickedRef", value.asInstanceOf[js.Any])
      
      inline def setTriggerRef(value: TriggerRef): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
    }
  }
  
  type PopoverRef = RefObject[Null | HTMLElement]
  
  type TriggerRef = RefObject[Null | HTMLElement]
}
