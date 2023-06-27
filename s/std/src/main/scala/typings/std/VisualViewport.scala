package typings.std

import typings.std.stdStrings.resize
import typings.std.stdStrings.scroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport) */
@js.native
trait VisualViewport
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height) */
  /* standard dom */
  val height: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft) */
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetTop) */
  /* standard dom */
  val offsetTop: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event) */
  /* standard dom */
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event) */
  /* standard dom */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft) */
  /* standard dom */
  val pageLeft: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop) */
  /* standard dom */
  val pageTop: Double = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale) */
  /* standard dom */
  val scale: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/width) */
  /* standard dom */
  val width: Double = js.native
}
