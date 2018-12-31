package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFormElement
  extends HTMLElement
     with /* index */ org.scalablytyped.runtime.NumberDictionary[Element]
     with /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: scala.Double = js.native
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
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Fires when the user resets a form.
    */
  def reset(): scala.Unit = js.native
  /**
    * Fires when a FORM is about to be submitted.
    */
  def submit(): scala.Unit = js.native
}

@JSGlobal("HTMLFormElement")
@js.native
object HTMLFormElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLFormElement]

