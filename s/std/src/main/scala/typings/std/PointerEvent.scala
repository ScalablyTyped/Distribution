package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent)
  */
@js.native
trait PointerEvent
  extends StObject
     with MouseEvent {
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getCoalescedEvents)
    */
  /* standard dom */
  def getCoalescedEvents(): js.Array[PointerEvent] = js.native
  
  /* standard dom */
  def getPredictedEvents(): js.Array[PointerEvent] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height) */
  /* standard dom */
  val height: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary) */
  /* standard dom */
  val isPrimary: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId) */
  /* standard dom */
  val pointerId: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType) */
  /* standard dom */
  val pointerType: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure) */
  /* standard dom */
  val pressure: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tangentialPressure) */
  /* standard dom */
  val tangentialPressure: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltX) */
  /* standard dom */
  val tiltX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltY) */
  /* standard dom */
  val tiltY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist) */
  /* standard dom */
  val twist: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/width) */
  /* standard dom */
  val width: Double = js.native
}
