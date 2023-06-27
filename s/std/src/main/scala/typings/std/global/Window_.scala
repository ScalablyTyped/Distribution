package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Window")
@js.native
/* standard dom */
open class Window_ ()
  extends StObject
     with Window {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/localStorage) */
  /* standard dom */
  /* CompleteClass */
  override val localStorage: typings.std.Storage = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/sessionStorage) */
  /* standard dom */
  /* CompleteClass */
  override val sessionStorage: typings.std.Storage = js.native
}
