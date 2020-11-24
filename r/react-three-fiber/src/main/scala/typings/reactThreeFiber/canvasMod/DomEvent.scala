package typings.reactThreeFiber.canvasMod

import typings.react.mod.AbstractView
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativePointerEvent
import typings.react.mod.NativeWheelEvent
import typings.reactThreeFiber.reactThreeFiberStrings.mouse
import typings.reactThreeFiber.reactThreeFiberStrings.pen
import typings.reactThreeFiber.reactThreeFiberStrings.touch
import typings.std.Element
import typings.std.EventTarget
import typings.three.mod.Object3D
import typings.three.mod.Ray
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactThreeFiber.canvasMod.PointerEvent
  - typings.reactThreeFiber.canvasMod.MouseEvent
  - typings.reactThreeFiber.canvasMod.WheelEvent
*/
trait DomEvent extends js.Object
object DomEvent {
  
  @scala.inline
  def PointerEvent(
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    camera: Camera,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with Element,
    defaultPrevented: Boolean,
    delta: Double,
    detail: Double,
    distance: Double,
    eventObject: Object3D,
    eventPhase: Double,
    getModifierState: String => Boolean,
    height: Double,
    intersections: js.Array[Intersection],
    isDefaultPrevented: () => Boolean,
    isPrimary: Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativePointerEvent,
    `object`: typings.three.object3DMod.Object3D,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    point: Vector3,
    pointerId: Double,
    pointerType: mouse | pen | touch,
    pressure: Double,
    preventDefault: () => Unit,
    ray: Ray,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    sourceEvent: typings.react.mod.PointerEvent[Element],
    stopPropagation: () => Unit,
    stopped: Boolean,
    tangentialPressure: Double,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    twist: Double,
    `type`: String,
    unprojectedPoint: typings.three.mod.Vector3,
    view: AbstractView,
    width: Double
  ): DomEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  
  @scala.inline
  def MouseEvent(
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    camera: Camera,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with Element,
    defaultPrevented: Boolean,
    delta: Double,
    detail: Double,
    distance: Double,
    eventObject: Object3D,
    eventPhase: Double,
    getModifierState: String => Boolean,
    intersections: js.Array[Intersection],
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeMouseEvent,
    `object`: typings.three.object3DMod.Object3D,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    point: Vector3,
    preventDefault: () => Unit,
    ray: Ray,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    sourceEvent: typings.react.mod.MouseEvent[Element, NativeMouseEvent],
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    unprojectedPoint: typings.three.mod.Vector3,
    view: AbstractView
  ): DomEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  
  @scala.inline
  def WheelEvent(
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    camera: Camera,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with Element,
    defaultPrevented: Boolean,
    delta: Double,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    detail: Double,
    distance: Double,
    eventObject: Object3D,
    eventPhase: Double,
    getModifierState: String => Boolean,
    intersections: js.Array[Intersection],
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeWheelEvent,
    `object`: typings.three.object3DMod.Object3D,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    point: Vector3,
    preventDefault: () => Unit,
    ray: Ray,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    sourceEvent: typings.react.mod.WheelEvent[Element],
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    unprojectedPoint: typings.three.mod.Vector3,
    view: AbstractView
  ): DomEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
}
