package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A <form> element in the DOM; it allows access to and in some cases modification of aspects of the form, as well as access to its component elements. */
@js.native
trait HTMLFormElement
  extends HTMLElement
     with /* index */ NumberDictionary[Element]
     with /* name */ StringDictionary[js.Any] {
  /**
    * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
    */
  var acceptCharset: java.lang.String = js.native
  /**
    * Sets or retrieves the URL to which the form content is sent for processing.
    */
  var action: java.lang.String = js.native
  /**
    * Specifies whether autocomplete is applied to an editable text field.
    */
  var autocomplete: java.lang.String = js.native
  /**
    * Retrieves a collection, in source order, of all controls in a given form.
    */
  val elements: HTMLFormControlsCollection = js.native
  /**
    * Sets or retrieves the MIME encoding for the form.
    */
  var encoding: java.lang.String = js.native
  /**
    * Sets or retrieves the encoding type for the form.
    */
  var enctype: java.lang.String = js.native
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
  /**
    * Sets or retrieves how to send the form data to the server.
    */
  var method: java.lang.String = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Designates a form that is not validated when submitted.
    */
  var noValidate: scala.Boolean = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
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
  def reportValidity(): scala.Boolean = js.native
  /**
    * Fires when the user resets a form.
    */
  def reset(): Unit = js.native
  /**
    * Fires when a FORM is about to be submitted.
    */
  def submit(): Unit = js.native
}

