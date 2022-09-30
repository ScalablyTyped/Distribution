package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.ScaleOptions
import typings.leaflet.mod.Control_.ZoomOptions
import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.Point_
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.react.mod.ReactNode
import typings.reactLeaflet.mod.^
import typings.reactLeaflet.reactLeafletStrings.leaflet
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def LeafletConsumer: Consumer[LeafletContext] = ^.asInstanceOf[js.Dynamic].selectDynamic("LeafletConsumer").asInstanceOf[Consumer[LeafletContext]]

inline def LeafletProvider: Provider[LeafletContext] = ^.asInstanceOf[js.Dynamic].selectDynamic("LeafletProvider").asInstanceOf[Provider[LeafletContext]]

inline def useLeaflet(): LeafletContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLeaflet")().asInstanceOf[LeafletContext]

inline def withLeaflet[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLeaflet")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[T, leaflet]]]

type AddLayerHandler = js.Function3[/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean], Unit]

type AttributionControlProps = AttributionOptions & MapControlProps

type Children = ReactNode | js.Array[ReactNode]

type LatLng = LatLng_ | js.Array[Double] | js.Object

type LatLngBounds = LatLngBounds_ | js.Array[LatLng]

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type Point = (js.Tuple2[Double, Double]) | Point_

type RemoveLayerHandler = js.Function1[/* layer */ Layer, Unit]

type ScaleControlProps = ScaleOptions & MapControlProps

type ZoomControlProps = ZoomOptions & MapControlProps
