package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent)
  */
@js.native
trait MouseEvent
  extends StObject
     with UIEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/altKey) */
  /* standard dom */
  val altKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button) */
  /* standard dom */
  val button: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons) */
  /* standard dom */
  val buttons: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientX) */
  /* standard dom */
  val clientX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientY) */
  /* standard dom */
  val clientY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/ctrlKey) */
  /* standard dom */
  val ctrlKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/getModifierState) */
  /* standard dom */
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/initMouseEvent)
    */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/metaKey) */
  /* standard dom */
  val metaKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementX) */
  /* standard dom */
  val movementX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementY) */
  /* standard dom */
  val movementY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetX) */
  /* standard dom */
  val offsetX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetY) */
  /* standard dom */
  val offsetY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageX) */
  /* standard dom */
  val pageX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageY) */
  /* standard dom */
  val pageY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget) */
  /* standard dom */
  val relatedTarget: EventTarget | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenX) */
  /* standard dom */
  val screenX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenY) */
  /* standard dom */
  val screenY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/shiftKey) */
  /* standard dom */
  val shiftKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/x) */
  /* standard dom */
  val x: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/y) */
  /* standard dom */
  val y: Double = js.native
}
