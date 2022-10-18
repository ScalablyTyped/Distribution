package typings.reactNativeMaps

import typings.reactNative.mod.HostComponent
import typings.reactNativeMaps.anon.PartialCamera
import typings.reactNativeMaps.libMapViewDottypesMod.EdgePadding
import typings.reactNativeMaps.libMapViewMod.NativeProps
import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.libSharedTypesMod.Region
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapViewNativeComponentMod {
  
  @JSImport("react-native-maps/lib/MapViewNativeComponent", "Commands")
  @js.native
  val Commands: NativeCommands = js.native
  
  type MapViewNativeComponentType = HostComponent[NativeProps]
  
  trait NativeCommands extends StObject {
    
    def animateCamera(viewRef: NonNullable[MapViewNativeComponentType | Null], camera: PartialCamera, duration: Double): Unit
    
    def animateToRegion(viewRef: NonNullable[MapViewNativeComponentType | Null], region: Region, duration: Double): Unit
    
    def fitToCoordinates(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      coordinates: js.Array[LatLng],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def fitToElements(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def fitToSuppliedMarkers(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      markers: js.Array[String],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def setCamera(viewRef: NonNullable[MapViewNativeComponentType | Null], camera: PartialCamera): Unit
    
    def setIndoorActiveLevelIndex(viewRef: NonNullable[MapViewNativeComponentType | Null], activeLevelIndex: Double): Unit
    
    def setMapBoundaries(viewRef: NonNullable[MapViewNativeComponentType | Null], northEast: LatLng, southWest: LatLng): Unit
  }
  object NativeCommands {
    
    inline def apply(
      animateCamera: (NonNullable[MapViewNativeComponentType | Null], PartialCamera, Double) => Unit,
      animateToRegion: (NonNullable[MapViewNativeComponentType | Null], Region, Double) => Unit,
      fitToCoordinates: (NonNullable[MapViewNativeComponentType | Null], js.Array[LatLng], EdgePadding, Boolean) => Unit,
      fitToElements: (NonNullable[MapViewNativeComponentType | Null], EdgePadding, Boolean) => Unit,
      fitToSuppliedMarkers: (NonNullable[MapViewNativeComponentType | Null], js.Array[String], EdgePadding, Boolean) => Unit,
      setCamera: (NonNullable[MapViewNativeComponentType | Null], PartialCamera) => Unit,
      setIndoorActiveLevelIndex: (NonNullable[MapViewNativeComponentType | Null], Double) => Unit,
      setMapBoundaries: (NonNullable[MapViewNativeComponentType | Null], LatLng, LatLng) => Unit
    ): NativeCommands = {
      val __obj = js.Dynamic.literal(animateCamera = js.Any.fromFunction3(animateCamera), animateToRegion = js.Any.fromFunction3(animateToRegion), fitToCoordinates = js.Any.fromFunction4(fitToCoordinates), fitToElements = js.Any.fromFunction3(fitToElements), fitToSuppliedMarkers = js.Any.fromFunction4(fitToSuppliedMarkers), setCamera = js.Any.fromFunction2(setCamera), setIndoorActiveLevelIndex = js.Any.fromFunction2(setIndoorActiveLevelIndex), setMapBoundaries = js.Any.fromFunction3(setMapBoundaries))
      __obj.asInstanceOf[NativeCommands]
    }
    
    extension [Self <: NativeCommands](x: Self) {
      
      inline def setAnimateCamera(value: (NonNullable[MapViewNativeComponentType | Null], PartialCamera, Double) => Unit): Self = StObject.set(x, "animateCamera", js.Any.fromFunction3(value))
      
      inline def setAnimateToRegion(value: (NonNullable[MapViewNativeComponentType | Null], Region, Double) => Unit): Self = StObject.set(x, "animateToRegion", js.Any.fromFunction3(value))
      
      inline def setFitToCoordinates(
        value: (NonNullable[MapViewNativeComponentType | Null], js.Array[LatLng], EdgePadding, Boolean) => Unit
      ): Self = StObject.set(x, "fitToCoordinates", js.Any.fromFunction4(value))
      
      inline def setFitToElements(value: (NonNullable[MapViewNativeComponentType | Null], EdgePadding, Boolean) => Unit): Self = StObject.set(x, "fitToElements", js.Any.fromFunction3(value))
      
      inline def setFitToSuppliedMarkers(
        value: (NonNullable[MapViewNativeComponentType | Null], js.Array[String], EdgePadding, Boolean) => Unit
      ): Self = StObject.set(x, "fitToSuppliedMarkers", js.Any.fromFunction4(value))
      
      inline def setSetCamera(value: (NonNullable[MapViewNativeComponentType | Null], PartialCamera) => Unit): Self = StObject.set(x, "setCamera", js.Any.fromFunction2(value))
      
      inline def setSetIndoorActiveLevelIndex(value: (NonNullable[MapViewNativeComponentType | Null], Double) => Unit): Self = StObject.set(x, "setIndoorActiveLevelIndex", js.Any.fromFunction2(value))
      
      inline def setSetMapBoundaries(value: (NonNullable[MapViewNativeComponentType | Null], LatLng, LatLng) => Unit): Self = StObject.set(x, "setMapBoundaries", js.Any.fromFunction3(value))
    }
  }
}
