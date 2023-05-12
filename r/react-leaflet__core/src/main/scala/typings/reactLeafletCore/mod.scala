package typings.reactLeafletCore

import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Evented
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.GridLayerOptions
import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.LeafletEventHandlerFnMap
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Path
import typings.leaflet.mod.SVGOverlay_
import typings.leaflet.mod.VideoOverlay_
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.anon.PartialLeafletContextInte
import typings.reactLeafletCore.anon.ReadonlyversionnumbermapM
import typings.reactLeafletCore.libCircleMod.CircleMarkerProps
import typings.reactLeafletCore.libCircleMod.CircleProps
import typings.reactLeafletCore.libComponentMod.ElementHook
import typings.reactLeafletCore.libComponentMod.PropsWithChildren
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import typings.reactLeafletCore.libDivOverlayMod.DivOverlay
import typings.reactLeafletCore.libDivOverlayMod.DivOverlayHook
import typings.reactLeafletCore.libDivOverlayMod.DivOverlayLifecycleHook
import typings.reactLeafletCore.libDivOverlayMod.SetOpenFunc
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.reactLeafletCore.libGenericMod.LayerWithChildrenProps
import typings.reactLeafletCore.libGenericMod.PathWithChildrenProps
import typings.reactLeafletCore.libLayerMod.LayerProps
import typings.reactLeafletCore.libMediaOverlayMod.MediaOverlayProps
import typings.reactLeafletCore.libPathMod.PathProps
import typings.std.HTMLElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-leaflet/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-leaflet/core", "CONTEXT_VERSION")
  @js.native
  val CONTEXT_VERSION: /* 1 */ Double = js.native
  
  @JSImport("@react-leaflet/core", "LeafletContext")
  @js.native
  val LeafletContext: Context[ReadonlyversionnumbermapM | Null] = js.native
  
  @JSImport("@react-leaflet/core", "LeafletProvider")
  @js.native
  val LeafletProvider: Provider[ReadonlyversionnumbermapM | Null] = js.native
  
  inline def addClassName(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createContainerComponent[E, P /* <: PropsWithChildren */](useElement: ElementHook[E, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainerComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createControlComponent[E /* <: Control_ */, P /* <: ControlOptions */](createInstance: js.Function1[/* props */ P, E]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlComponent")(createInstance.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createControlHook[E /* <: Control_ */, P /* <: ControlOptions */](useElement: typings.reactLeafletCore.libElementMod.ElementHook[E, P]): js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  
  inline def createDivOverlayComponent[E /* <: DivOverlay */, P /* <: PropsWithChildren */](useElement: ReturnType[DivOverlayHook[E, P]]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivOverlayComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createDivOverlayHook[E /* <: DivOverlay */, P /* <: LayerProps */](
    useElement: typings.reactLeafletCore.libElementMod.ElementHook[E, P],
    useLifecycle: DivOverlayLifecycleHook[E, P]
  ): js.Function2[
    /* props */ P, 
    /* setOpen */ SetOpenFunc, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDivOverlayHook")(useElement.asInstanceOf[js.Any], useLifecycle.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* props */ P, 
    /* setOpen */ SetOpenFunc, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  
  inline def createElementHook[E, P, C](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): js.Function2[
    /* props */ P, 
    /* context */ LeafletContextInterface, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElementHook")(createElement.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* props */ P, 
    /* context */ LeafletContextInterface, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  inline def createElementHook[E, P, C](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): js.Function2[
    /* props */ P, 
    /* context */ LeafletContextInterface, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementHook")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* props */ P, 
    /* context */ LeafletContextInterface, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  
  inline def createElementObject[T, C](instance: T, context: LeafletContextInterface): LeafletElement[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementObject")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[LeafletElement[T, C]]
  inline def createElementObject[T, C](instance: T, context: LeafletContextInterface, container: C): LeafletElement[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementObject")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[LeafletElement[T, C]]
  
  inline def createLayerComponent[E /* <: Layer */, P /* <: LayerWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLayerComponent")(createElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  inline def createLayerComponent[E /* <: Layer */, P /* <: LayerWithChildrenProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLayerComponent")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createLayerHook[E /* <: Layer */, P /* <: LayerProps */](useElement: typings.reactLeafletCore.libElementMod.ElementHook[E, P]): js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLayerHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  
  inline def createLeafComponent[E, P](useElement: ElementHook[E, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLeafComponent")(useElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def createLeafletContext(map: Map_): LeafletContextInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("createLeafletContext")(map.asInstanceOf[js.Any]).asInstanceOf[LeafletContextInterface]
  
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
  
  inline def createPathHook[E /* <: FeatureGroup_[Any] | Path */, P /* <: PathProps */](useElement: typings.reactLeafletCore.libElementMod.ElementHook[E, P]): js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPathHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ P, 
    ReturnType[typings.reactLeafletCore.libElementMod.ElementHook[E, P]]
  ]]
  
  inline def createTileLayerComponent[E /* <: Layer */, P /* <: LayerProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileLayerComponent")(createElement.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  inline def createTileLayerComponent[E /* <: Layer */, P /* <: LayerProps */](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTileLayerComponent")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[E]]]
  
  inline def extendContext(source: LeafletContextInterface, extra: PartialLeafletContextInte): LeafletContextInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("extendContext")(source.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[LeafletContextInterface]
  
  inline def removeClassName(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateCircle(layer: CircleMarker_[CircleMarkerProps], props: CircleMarkerProps, prevProps: CircleMarkerProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: CircleMarker_[CircleProps], props: CircleProps, prevProps: CircleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: Circle_[CircleMarkerProps], props: CircleMarkerProps, prevProps: CircleMarkerProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCircle(layer: Circle_[CircleProps], props: CircleProps, prevProps: CircleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCircle")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateClassName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")().asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: String, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: Unit, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: String, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: Unit, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateGridLayer[E /* <: GridLayer_ */, P /* <: GridLayerOptions */](layer: E, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGridLayer")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: ImageOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: SVGOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: VideoOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAttribution(map: Map_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAttribution")(map.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAttribution(map: Map_, attribution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAttribution")(map.asInstanceOf[js.Any], attribution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventHandlers(element: LeafletElement[Evented, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventHandlers")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEventHandlers(element: LeafletElement[Evented, Any], eventHandlers: LeafletEventHandlerFnMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventHandlers")(element.asInstanceOf[js.Any], eventHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLayerLifecycle(element: LeafletElement[Layer, Any], context: LeafletContextInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayerLifecycle")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLeafletContext(): LeafletContextInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("useLeafletContext")().asInstanceOf[LeafletContextInterface]
  
  inline def usePathOptions(element: LeafletElement[FeatureGroup_[Any] | Path, Any], props: PathProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePathOptions")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withPane[P /* <: LayerOptions */](props: P, context: LeafletContextInterface): P = (^.asInstanceOf[js.Dynamic].applyDynamic("withPane")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[P]
}
