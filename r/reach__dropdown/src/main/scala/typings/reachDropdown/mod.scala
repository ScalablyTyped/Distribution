package typings.reachDropdown

import typings.reachDropdown.anon.Data
import typings.reachDropdown.anon.DataIsExpanded
import typings.reachDropdown.anon.DataProps
import typings.reachDropdown.anon.Props
import typings.reachDropdown.anon.Ref
import typings.reachDropdown.anon.RefForwardedRef
import typings.reachDropdown.reachDropdownStrings.button
import typings.reachDropdown.reachDropdownStrings.div
import typings.reachDropdown.srcMod.DropdownDescendant
import typings.reachDropdown.srcMod.DropdownItemProps
import typings.reachDropdown.srcMod.DropdownItemsProps
import typings.reachDropdown.srcMod.DropdownPopoverProps
import typings.reachDropdown.srcMod.DropdownProviderProps
import typings.reachDropdown.srcMod.DropdownTriggerProps
import typings.reachDropdown.srcMod.InternalDropdownContextValue
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.FC
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
  val DropdownItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DropdownItemProps> */ Any = js.native
  
  /**
    * DropdownItem
    */
  @JSImport("@reach/dropdown", "DropdownItems")
  @js.native
  val DropdownItems: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DropdownItemsProps> */ Any = js.native
  
  @JSImport("@reach/dropdown", "DropdownPopover")
  @js.native
  val DropdownPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DropdownPopoverProps> */ Any = js.native
  
  @JSImport("@reach/dropdown", "DropdownProvider")
  @js.native
  val DropdownProvider: FC[DropdownProviderProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownTrigger")
  @js.native
  val DropdownTrigger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', DropdownTriggerProps> */ Any = js.native
  
  inline def useDropdownContext(childName: String): InternalDropdownContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownContext")(childName.asInstanceOf[js.Any]).asInstanceOf[InternalDropdownContextValue]
  
  inline def useDropdownDescendants(): js.Array[DropdownDescendant] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownDescendants")().asInstanceOf[js.Array[DropdownDescendant]]
  
  inline def useDropdownItem_div(
    hasIndexPropIsLinkOnClickOnDragStartOnMouseDownOnMouseEnterOnMouseLeaveOnMouseMoveOnMouseUpOnSelectDisabledOnFocusValueTextPropForwardedRefProps: DropdownItemProps & ComponentPropsWithoutRef[div] & RefForwardedRef
  ): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItem")(hasIndexPropIsLinkOnClickOnDragStartOnMouseDownOnMouseEnterOnMouseLeaveOnMouseMoveOnMouseUpOnSelectDisabledOnFocusValueTextPropForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  inline def useDropdownItems_div(
    hasIdOnKeyDownForwardedRefProps: DropdownItemsProps & ComponentPropsWithoutRef[div] & RefForwardedRef
  ): DataProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItems")(hasIdOnKeyDownForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[DataProps]
  
  inline def useDropdownPopover_div(
    hasOnBlurPortalPositionForwardedRefProps: DropdownPopoverProps & ComponentPropsWithoutRef[div] & RefForwardedRef
  ): DataIsExpanded = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownPopover")(hasOnBlurPortalPositionForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[DataIsExpanded]
  
  inline def useDropdownTrigger_button(
    hasOnKeyDownOnMouseDownIdForwardedRefProps: DropdownTriggerProps & ComponentPropsWithoutRef[button] & Ref
  ): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownTrigger")(hasOnKeyDownOnMouseDownIdForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[Data]
}
