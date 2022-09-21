package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc. */
@js.native
trait PointerEvent
  extends StObject
     with MouseEvent {
  
  /** Available only in secure contexts. */
  /* standard dom */
  def getCoalescedEvents(): js.Array[PointerEvent] = js.native
  
  /* standard dom */
  def getPredictedEvents(): js.Array[PointerEvent] = js.native
  
  /* standard dom */
  val height: Double = js.native
  
  /* standard dom */
  val isPrimary: scala.Boolean = js.native
  
  /* standard dom */
  val pointerId: Double = js.native
  
  /* standard dom */
  val pointerType: java.lang.String = js.native
  
  /* standard dom */
  val pressure: Double = js.native
  
  /* standard dom */
  val tangentialPressure: Double = js.native
  
  /* standard dom */
  val tiltX: Double = js.native
  
  /* standard dom */
  val tiltY: Double = js.native
  
  /* standard dom */
  val twist: Double = js.native
  
  /* standard dom */
  val width: Double = js.native
}
