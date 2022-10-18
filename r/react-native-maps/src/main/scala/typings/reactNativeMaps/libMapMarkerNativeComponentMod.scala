package typings.reactNativeMaps

import typings.reactNative.mod.HostComponent
import typings.reactNativeMaps.libMapMarkerMod.NativeProps
import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapMarkerNativeComponentMod {
  
  @JSImport("react-native-maps/lib/MapMarkerNativeComponent", "Commands")
  @js.native
  val Commands: NativeCommands = js.native
  
  type MapMarkerNativeComponentType = HostComponent[NativeProps]
  
  trait NativeCommands extends StObject {
    
    def animateMarkerToCoordinate(viewRef: NonNullable[MapMarkerNativeComponentType | Null], coordinate: LatLng, duration: Double): Unit
    
    def hideCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def redraw(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def redrawCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def showCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
  }
  object NativeCommands {
    
    inline def apply(
      animateMarkerToCoordinate: (NonNullable[MapMarkerNativeComponentType | Null], LatLng, Double) => Unit,
      hideCallout: NonNullable[MapMarkerNativeComponentType | Null] => Unit,
      redraw: NonNullable[MapMarkerNativeComponentType | Null] => Unit,
      redrawCallout: NonNullable[MapMarkerNativeComponentType | Null] => Unit,
      showCallout: NonNullable[MapMarkerNativeComponentType | Null] => Unit
    ): NativeCommands = {
      val __obj = js.Dynamic.literal(animateMarkerToCoordinate = js.Any.fromFunction3(animateMarkerToCoordinate), hideCallout = js.Any.fromFunction1(hideCallout), redraw = js.Any.fromFunction1(redraw), redrawCallout = js.Any.fromFunction1(redrawCallout), showCallout = js.Any.fromFunction1(showCallout))
      __obj.asInstanceOf[NativeCommands]
    }
    
    extension [Self <: NativeCommands](x: Self) {
      
      inline def setAnimateMarkerToCoordinate(value: (NonNullable[MapMarkerNativeComponentType | Null], LatLng, Double) => Unit): Self = StObject.set(x, "animateMarkerToCoordinate", js.Any.fromFunction3(value))
      
      inline def setHideCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Unit): Self = StObject.set(x, "hideCallout", js.Any.fromFunction1(value))
      
      inline def setRedraw(value: NonNullable[MapMarkerNativeComponentType | Null] => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
      
      inline def setRedrawCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Unit): Self = StObject.set(x, "redrawCallout", js.Any.fromFunction1(value))
      
      inline def setShowCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Unit): Self = StObject.set(x, "showCallout", js.Any.fromFunction1(value))
    }
  }
}
