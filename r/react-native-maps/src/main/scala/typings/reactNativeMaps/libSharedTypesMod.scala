package typings.reactNativeMaps

import typings.react.mod.ElementRef
import typings.reactNative.mod.HostComponent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNativeMaps.anon.ActionCoordinate
import typings.reactNativeMaps.anon.CoordinateId
import typings.reactNativeMaps.anon.CoordinatePosition
import typings.reactNativeMaps.anon.`2`
import typings.reactNativeMaps.anon.coordinateLatLngpositionP
import typings.reactNativeMaps.anon.coordinateLatLngpositionPAction
import typings.reactNativeMaps.reactNativeMapsStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSharedTypesMod {
  
  type CalloutPressEvent = NativeSyntheticEvent[typings.reactNativeMaps.anon.Point]
  
  type ClickEvent[T] = NativeSyntheticEvent[CoordinatePosition & T]
  
  trait Frame
    extends StObject
       with Point {
    
    var height: Double
    
    var width: Double
  }
  object Frame {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Frame = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait LatLng extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object LatLng {
    
    inline def apply(latitude: Double, longitude: Double): LatLng = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatLng]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatLng] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeMaps.reactNativeMapsStrings.butt
    - typings.reactNativeMaps.reactNativeMapsStrings.round
    - typings.reactNativeMaps.reactNativeMapsStrings.square
  */
  trait LineCapType extends StObject
  object LineCapType {
    
    inline def butt: typings.reactNativeMaps.reactNativeMapsStrings.butt = "butt".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.butt]
    
    inline def round: typings.reactNativeMaps.reactNativeMapsStrings.round = "round".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.round]
    
    inline def square: typings.reactNativeMaps.reactNativeMapsStrings.square = "square".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeMaps.reactNativeMapsStrings.miter
    - typings.reactNativeMaps.reactNativeMapsStrings.round
    - typings.reactNativeMaps.reactNativeMapsStrings.bevel
  */
  trait LineJoinType extends StObject
  object LineJoinType {
    
    inline def bevel: typings.reactNativeMaps.reactNativeMapsStrings.bevel = "bevel".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.bevel]
    
    inline def miter: typings.reactNativeMaps.reactNativeMapsStrings.miter = "miter".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.miter]
    
    inline def round: typings.reactNativeMaps.reactNativeMapsStrings.round = "round".asInstanceOf[typings.reactNativeMaps.reactNativeMapsStrings.round]
  }
  
  /* Inlined std.Omit<react-native-maps.react-native-maps/lib/sharedTypes.ClickEvent<{  action :'marker-deselect',   id :string}>, 'position'> */
  trait MarkerDeselectEvent extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: ElementRef[HostComponent[Any]]
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    var isDefaultPrevented: js.Function0[Boolean]
    
    var isPropagationStopped: js.Function0[Boolean]
    
    var isTrusted: Boolean
    
    var nativeEvent: coordinateLatLngpositionP
    
    var persist: js.Function0[Unit]
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
    
    var target: ElementRef[HostComponent[Any]]
    
    var timeStamp: Double
    
    var `type`: String
  }
  object MarkerDeselectEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: ElementRef[HostComponent[Any]],
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: coordinateLatLngpositionP,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: ElementRef[HostComponent[Any]],
      timeStamp: Double,
      `type`: String
    ): MarkerDeselectEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerDeselectEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerDeselectEvent] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: ElementRef[HostComponent[Any]]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: coordinateLatLngpositionP): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: ElementRef[HostComponent[Any]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerDragEvent = ClickEvent[`2`]
  
  type MarkerDragStartEndEvent = NativeSyntheticEvent[CoordinateId]
  
  type MarkerPressEvent = NativeSyntheticEvent[ActionCoordinate]
  
  /* Inlined std.Omit<react-native-maps.react-native-maps/lib/sharedTypes.ClickEvent<{  id :string,   action :'marker-select'}>, 'position'> */
  trait MarkerSelectEvent extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: ElementRef[HostComponent[Any]]
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    var isDefaultPrevented: js.Function0[Boolean]
    
    var isPropagationStopped: js.Function0[Boolean]
    
    var isTrusted: Boolean
    
    var nativeEvent: coordinateLatLngpositionPAction
    
    var persist: js.Function0[Unit]
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
    
    var target: ElementRef[HostComponent[Any]]
    
    var timeStamp: Double
    
    var `type`: String
  }
  object MarkerSelectEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: ElementRef[HostComponent[Any]],
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: coordinateLatLngpositionPAction,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: ElementRef[HostComponent[Any]],
      timeStamp: Double,
      `type`: String
    ): MarkerSelectEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerSelectEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerSelectEvent] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: ElementRef[HostComponent[Any]]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: coordinateLatLngpositionPAction): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: ElementRef[HostComponent[Any]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Provider = js.UndefOr[google]
  
  trait Region
    extends StObject
       with LatLng {
    
    var latitudeDelta: Double
    
    var longitudeDelta: Double
  }
  object Region {
    
    inline def apply(latitude: Double, latitudeDelta: Double, longitude: Double, longitudeDelta: Double): Region = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      inline def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
      
      inline def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
    }
  }
}
