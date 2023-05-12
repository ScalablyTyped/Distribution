package typings.reactLeafletCore

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libDivOverlayMod.DivOverlay
import typings.reactLeafletCore.libDivOverlayMod.DivOverlayHook
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentMod {
  
  @JSImport("@react-leaflet/core/lib/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContainerComponent[E, P /* <: PropsWithChildren */](useElement: ElementHook[E, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainerComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createDivOverlayComponent[E /* <: DivOverlay */, P /* <: PropsWithChildren */](useElement: ReturnType[DivOverlayHook[E, P]]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivOverlayComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createLeafComponent[E, P](useElement: ElementHook[E, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLeafComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  type ElementHook[E, P] = js.Function1[/* props */ P, MutableRefObject[LeafletElement[E, Any]]]
  
  trait PropsWithChildren extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object PropsWithChildren {
    
    inline def apply(): PropsWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithChildren]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
