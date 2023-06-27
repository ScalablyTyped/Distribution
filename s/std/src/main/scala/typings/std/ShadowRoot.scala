package typings.std

import typings.std.stdStrings.slotchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot) */
@js.native
trait ShadowRoot
  extends StObject
     with DocumentFragment
     with DocumentOrShadowRoot
     with InnerHTML {
  
  /** Throws a "NotSupportedError" DOMException if context object is a shadow root. */
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus) */
  /* standard dom */
  val delegatesFocus: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host) */
  /* standard dom */
  val host: Element = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode) */
  /* standard dom */
  val mode: ShadowRootMode = js.native
  
  /* standard dom */
  var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment) */
  /* standard dom */
  val slotAssignment: SlotAssignmentMode = js.native
}
