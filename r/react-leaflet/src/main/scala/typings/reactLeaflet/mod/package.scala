package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def LeafletConsumer: typings.react.mod.Consumer[typings.reactLeaflet.mod.LeafletContext] = typings.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LeafletConsumer").asInstanceOf[typings.react.mod.Consumer[typings.reactLeaflet.mod.LeafletContext]]

@scala.inline
def LeafletProvider: typings.react.mod.Provider[typings.reactLeaflet.mod.LeafletContext] = typings.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LeafletProvider").asInstanceOf[typings.react.mod.Provider[typings.reactLeaflet.mod.LeafletContext]]

@scala.inline
def useLeaflet(): typings.reactLeaflet.mod.LeafletContext = typings.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLeaflet")().asInstanceOf[typings.reactLeaflet.mod.LeafletContext]

@scala.inline
def withLeaflet[T /* <: typings.reactLeaflet.mod.ContextProps */](WrappedComponent: typings.react.mod.ComponentType[T]): typings.react.mod.ComponentType[
typings.reactLeaflet.mod.Omit[T, typings.reactLeaflet.reactLeafletStrings.leaflet]] = typings.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withLeaflet")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
typings.reactLeaflet.mod.Omit[T, typings.reactLeaflet.reactLeafletStrings.leaflet]]]

type AddLayerHandler = js.Function3[
/* layer */ typings.leaflet.mod.Layer, 
/* name */ java.lang.String, 
/* checked */ js.UndefOr[scala.Boolean], 
scala.Unit]

type AttributionControlProps = typings.leaflet.mod.Control_.AttributionOptions & typings.reactLeaflet.mod.MapControlProps

type Children = typings.react.mod.ReactNode | js.Array[typings.react.mod.ReactNode]

type LatLng = typings.leaflet.mod.LatLng_ | js.Array[scala.Double] | js.Object

type LatLngBounds = typings.leaflet.mod.LatLngBounds_ | js.Array[typings.reactLeaflet.mod.LatLng]

type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

type Point = (js.Tuple2[scala.Double, scala.Double]) | typings.leaflet.mod.Point_

type RemoveLayerHandler = js.Function1[/* layer */ typings.leaflet.mod.Layer, scala.Unit]

type ScaleControlProps = typings.leaflet.mod.Control_.ScaleOptions & typings.reactLeaflet.mod.MapControlProps

type ZoomControlProps = typings.leaflet.mod.Control_.ZoomOptions & typings.reactLeaflet.mod.MapControlProps
