package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement) */
@js.native
trait HTMLDialogElement
  extends StObject
     with HTMLElement {
  
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
  
  /**
    * Closes the dialog element.
    *
    * The argument, if provided, provides a return value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  def close(returnValue: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open) */
  /* standard dom */
  var open: scala.Boolean = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue) */
  /* standard dom */
  var returnValue: java.lang.String = js.native
  
  /**
    * Displays the dialog element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
    */
  /* standard dom */
  def show(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal) */
  /* standard dom */
  def showModal(): Unit = js.native
}
