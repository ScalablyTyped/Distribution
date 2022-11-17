package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRoot
  extends StObject
     with DocumentFragment
     with DocumentOrShadowRoot
     with InnerHTML {
  
  /** Throws a "NotSupportedError" DOMException if context object is a shadow root. */
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_slotchange")
  def addEventListener(`type`: "slotchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_slotchange")
  def addEventListener(
    `type`: "slotchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_slotchange")
  def addEventListener(
    `type`: "slotchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val delegatesFocus: scala.Boolean = js.native
  
  /* standard dom */
  val host: Element = js.native
  
  /* standard dom */
  val mode: ShadowRootMode = js.native
  
  /* standard dom */
  var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_slotchange")
  def removeEventListener(`type`: "slotchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_slotchange")
  def removeEventListener(
    `type`: "slotchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_slotchange")
  def removeEventListener(
    `type`: "slotchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val slotAssignment: SlotAssignmentMode = js.native
}
