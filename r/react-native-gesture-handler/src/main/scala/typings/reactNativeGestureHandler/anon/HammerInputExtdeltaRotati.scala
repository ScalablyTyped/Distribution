package typings.reactNativeGestureHandler.anon

import typings.hammerjs.HammerPoint
import typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`8`
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web_hammer/GestureHandler.HammerInputExt & {  deltaRotation :number} */
trait HammerInputExtdeltaRotati extends StObject {
  
  var angle: Double
  
  var center: HammerPoint
  
  var changedPointers: js.Array[Any]
  
  var deltaRotation: Double
  
  var deltaTime: Double
  
  var deltaX: Double
  
  var deltaY: Double
  
  var direction: Double
  
  var distance: Double
  
  var eventType: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | `4` | `8`
  
  var isFinal: Boolean
  
  var isFirst: Boolean
  
  var maxPointers: Double
  
  var offsetDirection: Double
  
  var overallVelocity: Double
  
  var overallVelocityX: Double
  
  var overallVelocityY: Double
  
  var pointerType: String
  
  var pointers: js.Array[Any]
  
  var preventDefault: js.Function
  
  var rotation: Double
  
  var scale: Double
  
  var srcEvent: TouchEvent | MouseEvent | PointerEvent
  
  var target: HTMLElement
  
  var timeStamp: Double
  
  var `type`: String
  
  var velocity: Double
  
  var velocityX: Double
  
  var velocityY: Double
}
object HammerInputExtdeltaRotati {
  
  inline def apply(
    angle: Double,
    center: HammerPoint,
    changedPointers: js.Array[Any],
    deltaRotation: Double,
    deltaTime: Double,
    deltaX: Double,
    deltaY: Double,
    direction: Double,
    distance: Double,
    eventType: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | `4` | `8`,
    isFinal: Boolean,
    isFirst: Boolean,
    maxPointers: Double,
    offsetDirection: Double,
    overallVelocity: Double,
    overallVelocityX: Double,
    overallVelocityY: Double,
    pointerType: String,
    pointers: js.Array[Any],
    preventDefault: js.Function,
    rotation: Double,
    scale: Double,
    srcEvent: TouchEvent | MouseEvent | PointerEvent,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    velocity: Double,
    velocityX: Double,
    velocityY: Double
  ): HammerInputExtdeltaRotati = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], changedPointers = changedPointers.asInstanceOf[js.Any], deltaRotation = deltaRotation.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isFinal = isFinal.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], maxPointers = maxPointers.asInstanceOf[js.Any], offsetDirection = offsetDirection.asInstanceOf[js.Any], overallVelocity = overallVelocity.asInstanceOf[js.Any], overallVelocityX = overallVelocityX.asInstanceOf[js.Any], overallVelocityY = overallVelocityY.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerInputExtdeltaRotati]
  }
  
  extension [Self <: HammerInputExtdeltaRotati](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: HammerPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setChangedPointers(value: js.Array[Any]): Self = StObject.set(x, "changedPointers", value.asInstanceOf[js.Any])
    
    inline def setChangedPointersVarargs(value: Any*): Self = StObject.set(x, "changedPointers", js.Array(value*))
    
    inline def setDeltaRotation(value: Double): Self = StObject.set(x, "deltaRotation", value.asInstanceOf[js.Any])
    
    inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`1` | typings.reactNativeGestureHandler.reactNativeGestureHandlerNumbers.`2` | `4` | `8`
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    inline def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setOffsetDirection(value: Double): Self = StObject.set(x, "offsetDirection", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocity(value: Double): Self = StObject.set(x, "overallVelocity", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocityX(value: Double): Self = StObject.set(x, "overallVelocityX", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocityY(value: Double): Self = StObject.set(x, "overallVelocityY", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: js.Array[Any]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersVarargs(value: Any*): Self = StObject.set(x, "pointers", js.Array(value*))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
    
    inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
  }
}
