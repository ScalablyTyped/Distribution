package typings.reactLeafletCore

import typings.leaflet.mod.Popup_
import typings.leaflet.mod.Tooltip_
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import typings.reactLeafletCore.libElementMod.ElementHook
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.reactLeafletCore.libLayerMod.LayerProps
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDivOverlayMod {
  
  @JSImport("@react-leaflet/core/lib/div-overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDivOverlayHook[E /* <: DivOverlay */, P /* <: LayerProps */](useElement: ElementHook[E, P], useLifecycle: DivOverlayLifecycleHook[E, P]): js.Function2[/* props */ P, /* setOpen */ SetOpenFunc, ReturnType[ElementHook[E, P]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDivOverlayHook")(useElement.asInstanceOf[js.Any], useLifecycle.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ P, /* setOpen */ SetOpenFunc, ReturnType[ElementHook[E, P]]]]
  
  type DivOverlay = Popup_ | Tooltip_
  
  type DivOverlayHook[E /* <: DivOverlay */, P] = js.Function2[
    /* useElement */ ElementHook[E, P], 
    /* useLifecycle */ DivOverlayLifecycleHook[E, P], 
    js.Function2[/* props */ P, /* setOpen */ SetOpenFunc, ReturnType[ElementHook[E, P]]]
  ]
  
  type DivOverlayLifecycleHook[E, P] = js.Function4[
    /* element */ LeafletElement[E, Any], 
    /* context */ LeafletContextInterface, 
    /* props */ P, 
    /* setOpen */ SetOpenFunc, 
    Unit
  ]
  
  type SetOpenFunc = js.Function1[/* open */ Boolean, Unit]
}
