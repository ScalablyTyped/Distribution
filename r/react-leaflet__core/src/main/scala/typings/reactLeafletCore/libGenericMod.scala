package typings.reactLeafletCore

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.Path
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libComponentMod.PropsWithChildren
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import typings.reactLeafletCore.libDivOverlayMod.DivOverlay
import typings.reactLeafletCore.libDivOverlayMod.DivOverlayLifecycleHook
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.reactLeafletCore.libLayerMod.LayerProps
import typings.reactLeafletCore.libPathMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGenericMod {
  
  @JSImport("@react-leaflet/core/lib/generic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControlComponent[E /* <: Control_ */, P /* <: ControlOptions */](createInstance: js.Function1[/* props */ P, E]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlComponent")(createInstance.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createLayerComponent[E /* <: Layer */, P /* <: LayerWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLayerComponent")(createElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  inline def createLayerComponent[E /* <: Layer */, P /* <: LayerWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLayerComponent")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createOverlayComponent[E /* <: DivOverlay */, P /* <: LayerWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    useLifecycle: DivOverlayLifecycleHook[E, P]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(createElement.asInstanceOf[js.Any], useLifecycle.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createPathComponent[E /* <: FeatureGroup_[Any] | Path */, P /* <: PathWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPathComponent")(createElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  inline def createPathComponent[E /* <: FeatureGroup_[Any] | Path */, P /* <: PathWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPathComponent")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createTileLayerComponent[E /* <: Layer */, P /* <: LayerProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileLayerComponent")(createElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  inline def createTileLayerComponent[E /* <: Layer */, P /* <: LayerProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTileLayerComponent")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  trait LayerWithChildrenProps
    extends StObject
       with LayerProps
       with PropsWithChildren
  object LayerWithChildrenProps {
    
    inline def apply(): LayerWithChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerWithChildrenProps]
    }
  }
  
  trait PathWithChildrenProps
    extends StObject
       with PathProps
       with PropsWithChildren
  object PathWithChildrenProps {
    
    inline def apply(): PathWithChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathWithChildrenProps]
    }
  }
}
