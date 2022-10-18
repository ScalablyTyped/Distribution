package typings.reactNativeMaps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Context
import typings.reactNative.mod.HostComponent
import typings.reactNativeMaps.anon.Android
import typings.reactNativeMaps.libMapCalloutMod.MapCallout
import typings.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubview
import typings.reactNativeMaps.libMapCircleMod.MapCircle
import typings.reactNativeMaps.libMapCircleMod.MapCircleProps
import typings.reactNativeMaps.libMapHeatmapMod.MapHeatmap
import typings.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps
import typings.reactNativeMaps.libMapLocalTileMod.MapLocalTile
import typings.reactNativeMaps.libMapPolygonMod.MapPolygon
import typings.reactNativeMaps.libMapPolygonMod.MapPolygonProps
import typings.reactNativeMaps.libMapPolylineMod.MapPolyline
import typings.reactNativeMaps.libMapPolylineMod.MapPolylineProps
import typings.reactNativeMaps.libMapUrlTileMod.MapUrlTile
import typings.reactNativeMaps.libMapWMSTileMod.MapWMSTile
import typings.reactNativeMaps.libSharedTypesMod.Provider
import typings.reactNativeMaps.reactNativeMapsStrings.AIRGoogleMap
import typings.reactNativeMaps.reactNativeMapsStrings.AIRMap
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecorateMapComponentMod {
  
  @JSImport("react-native-maps/lib/decorateMapComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Type /* <: Component */](Component: Type, componentName: ComponentName, providers: Providers): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "NOT_SUPPORTED")
  @js.native
  val NOT_SUPPORTED: ImplementationStatus = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "ProviderContext")
  @js.native
  val ProviderContext: Context[Provider] = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "SUPPORTED")
  @js.native
  val SUPPORTED: ImplementationStatus = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "USES_DEFAULT_IMPLEMENTATION")
  @js.native
  val USES_DEFAULT_IMPLEMENTATION: ImplementationStatus = js.native
  
  inline def createNotSupportedComponent(message: String): js.Function0[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotSupportedComponent")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Null]]
  
  inline def getNativeMapName(provider: Provider): AIRMap | AIRGoogleMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeMapName")(provider.asInstanceOf[js.Any]).asInstanceOf[AIRMap | AIRGoogleMap]
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "googleMapIsInstalled")
  @js.native
  val googleMapIsInstalled: /* true */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - org.scalablytyped.runtime.Instantiable0[
  typings.reactNativeMaps.libMapCalloutMod.MapCallout | typings.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubview | typings.reactNativeMaps.libMapLocalTileMod.MapLocalTile | typings.reactNativeMaps.libMapUrlTileMod.MapUrlTile | typings.reactNativeMaps.libMapWMSTileMod.MapWMSTile]
    - org.scalablytyped.runtime.Instantiable1[
  (/ * props * / typings.reactNativeMaps.libMapCircleMod.MapCircleProps) | (/ * props * / typings.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps) | (/ * props * / typings.reactNativeMaps.libMapPolygonMod.MapPolygonProps) | (/ * props * / typings.reactNativeMaps.libMapPolylineMod.MapPolylineProps), 
  typings.reactNativeMaps.libMapCircleMod.MapCircle | typings.reactNativeMaps.libMapHeatmapMod.MapHeatmap | typings.reactNativeMaps.libMapPolygonMod.MapPolygon | typings.reactNativeMaps.libMapPolylineMod.MapPolyline]
    - typings.reactNativeMaps.anon.TypeofMapMarker
    - typings.reactNativeMaps.anon.TypeofMapOverlay
  */
  type Component = _Component | (Instantiable0[MapCallout | MapCalloutSubview | MapLocalTile | MapUrlTile | MapWMSTile]) | (Instantiable1[
    (/* props */ MapCircleProps) | (/* props */ MapHeatmapProps) | (/* props */ MapPolygonProps) | (/* props */ MapPolylineProps), 
    MapCircle | MapHeatmap | MapPolygon | MapPolyline
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeMaps.reactNativeMapsStrings.Callout
    - typings.reactNativeMaps.reactNativeMapsStrings.CalloutSubview
    - typings.reactNativeMaps.reactNativeMapsStrings.Circle
    - typings.reactNativeMaps.reactNativeMapsStrings.Heatmap
    - typings.reactNativeMaps.reactNativeMapsStrings.LocalTile
    - typings.reactNativeMaps.reactNativeMapsStrings.Marker
    - typings.reactNativeMaps.reactNativeMapsStrings.Overlay
    - typings.reactNativeMaps.reactNativeMapsStrings.Polygon
    - typings.reactNativeMaps.reactNativeMapsStrings.Polyline
    - typings.reactNativeMaps.reactNativeMapsStrings.UrlTile
    - typings.reactNativeMaps.reactNativeMapsStrings.WMSTile
  */
  trait ComponentName extends StObject
  object ComponentName {
    
    inline def Callout: typings.reactNativeMaps.reactNativeMapsStrings.Callout = "Callout".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Callout]
    
    inline def CalloutSubview: typings.reactNativeMaps.reactNativeMapsStrings.CalloutSubview = "CalloutSubview".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.CalloutSubview]
    
    inline def Circle: typings.reactNativeMaps.reactNativeMapsStrings.Circle = "Circle".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Circle]
    
    inline def Heatmap: typings.reactNativeMaps.reactNativeMapsStrings.Heatmap = "Heatmap".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Heatmap]
    
    inline def LocalTile: typings.reactNativeMaps.reactNativeMapsStrings.LocalTile = "LocalTile".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.LocalTile]
    
    inline def Marker: typings.reactNativeMaps.reactNativeMapsStrings.Marker = "Marker".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Marker]
    
    inline def Overlay: typings.reactNativeMaps.reactNativeMapsStrings.Overlay = "Overlay".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Overlay]
    
    inline def Polygon: typings.reactNativeMaps.reactNativeMapsStrings.Polygon = "Polygon".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Polygon]
    
    inline def Polyline: typings.reactNativeMaps.reactNativeMapsStrings.Polyline = "Polyline".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.Polyline]
    
    inline def UrlTile: typings.reactNativeMaps.reactNativeMapsStrings.UrlTile = "UrlTile".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.UrlTile]
    
    inline def WMSTile: typings.reactNativeMaps.reactNativeMapsStrings.WMSTile = "WMSTile".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.WMSTile]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeMaps.reactNativeMapsStrings.SUPPORTED
    - typings.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION
    - typings.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED
  */
  trait ImplementationStatus extends StObject
  object ImplementationStatus {
    
    inline def NOT_SUPPORTED: typings.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED]
    
    inline def SUPPORTED: typings.reactNativeMaps.reactNativeMapsStrings.SUPPORTED = "SUPPORTED".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.SUPPORTED]
    
    inline def USES_DEFAULT_IMPLEMENTATION: typings.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION = "USES_DEFAULT_IMPLEMENTATION".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION]
  }
  
  type MapManagerCommand = Any
  
  type NativeComponent[H] = HostComponent[H] | (ReturnType[js.Function1[/* message */ String, js.Function0[Null]]])
  
  trait Providers extends StObject {
    
    var google: Android
  }
  object Providers {
    
    inline def apply(google: Android): Providers = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[Providers]
    }
    
    extension [Self <: Providers](x: Self) {
      
      inline def setGoogle(value: Android): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    }
  }
  
  type UIManagerCommand = Double
  
  trait _Component extends StObject
}
