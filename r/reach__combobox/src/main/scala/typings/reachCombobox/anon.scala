package typings.reachCombobox

import typings.reachPopover.mod.Position
import typings.reachPopover.mod.PossibleNode
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @reach/combobox.@reach/combobox.ComboboxPopoverProps & std.Partial<std.Omit<@reach/popover.@reach/popover.PopoverProps, 'unstable_skipInitialRender'>> */
  trait ComboboxPopoverPropsParti extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you pass `<ComboboxPopover portal={false} />` the popover will not
      * render inside of a portal, but in the same order as the React tree. This
      * is mostly useful for styling the entire component together, like the pink
      * focus outline in the example earlier in this page.
      *
      * @see Docs https://reach.tech/combobox#comboboxpopover-portal
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var targetRef: js.UndefOr[RefObject[PossibleNode]] = js.undefined
    
    var unstable_observableRefs: js.UndefOr[js.Array[RefObject[PossibleNode]]] = js.undefined
    
    var unstable_skipInitialPortalRender: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxPopoverPropsParti {
    
    inline def apply(): ComboboxPopoverPropsParti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxPopoverPropsParti]
    }
    
    extension [Self <: ComboboxPopoverPropsParti](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTargetRef(value: RefObject[PossibleNode]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setUnstable_observableRefs(value: js.Array[RefObject[PossibleNode]]): Self = StObject.set(x, "unstable_observableRefs", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observableRefsUndefined: Self = StObject.set(x, "unstable_observableRefs", js.undefined)
      
      inline def setUnstable_observableRefsVarargs(value: RefObject[PossibleNode]*): Self = StObject.set(x, "unstable_observableRefs", js.Array(value*))
      
      inline def setUnstable_skipInitialPortalRender(value: Boolean): Self = StObject.set(x, "unstable_skipInitialPortalRender", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipInitialPortalRenderUndefined: Self = StObject.set(x, "unstable_skipInitialPortalRender", js.undefined)
    }
  }
}
