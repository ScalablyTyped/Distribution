package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent)
  */
@js.native
trait TouchEvent
  extends StObject
     with UIEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey) */
  /* standard dom */
  val altKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches) */
  /* standard dom */
  val changedTouches: TouchList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey) */
  /* standard dom */
  val ctrlKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey) */
  /* standard dom */
  val metaKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey) */
  /* standard dom */
  val shiftKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches) */
  /* standard dom */
  val targetTouches: TouchList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches) */
  /* standard dom */
  val touches: TouchList = js.native
}
