package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown. */
@js.native
trait MouseEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val altKey: scala.Boolean = js.native
  
  /* standard dom */
  val button: Double = js.native
  
  /* standard dom */
  val buttons: Double = js.native
  
  /* standard dom */
  val clientX: Double = js.native
  
  /* standard dom */
  val clientY: Double = js.native
  
  /* standard dom */
  val ctrlKey: scala.Boolean = js.native
  
  /* standard dom */
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double
  ): Unit = js.native
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: EventTarget
  ): Unit = js.native
  
  /* standard dom */
  val metaKey: scala.Boolean = js.native
  
  /* standard dom */
  val movementX: Double = js.native
  
  /* standard dom */
  val movementY: Double = js.native
  
  /* standard dom */
  val offsetX: Double = js.native
  
  /* standard dom */
  val offsetY: Double = js.native
  
  /* standard dom */
  val pageX: Double = js.native
  
  /* standard dom */
  val pageY: Double = js.native
  
  /* standard dom */
  val relatedTarget: EventTarget | Null = js.native
  
  /* standard dom */
  val screenX: Double = js.native
  
  /* standard dom */
  val screenY: Double = js.native
  
  /* standard dom */
  val shiftKey: scala.Boolean = js.native
  
  /* standard dom */
  val x: Double = js.native
  
  /* standard dom */
  val y: Double = js.native
}
