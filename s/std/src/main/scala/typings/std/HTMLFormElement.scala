package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A <form> element in the DOM; it allows access to and in some cases modification of aspects of the form, as well as access to its component elements. */
@js.native
trait HTMLFormElement
  extends StObject
     with HTMLElement
     with /* standard dom */
/* index */ NumberDictionary[Element]
     with /* standard dom */
/* name */ StringDictionary[Any] {
  
  /** Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form. */
  /* standard dom */
  var acceptCharset: java.lang.String = js.native
  
  /** Sets or retrieves the URL to which the form content is sent for processing. */
  /* standard dom */
  var action: java.lang.String = js.native
  
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
  
  /** Specifies whether autocomplete is applied to an editable text field. */
  /* standard dom */
  var autocomplete: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /** Retrieves a collection, in source order, of all controls in a given form. */
  /* standard dom */
  val elements: HTMLFormControlsCollection = js.native
  
  /** Sets or retrieves the MIME encoding for the form. */
  /* standard dom */
  var encoding: java.lang.String = js.native
  
  /** Sets or retrieves the encoding type for the form. */
  /* standard dom */
  var enctype: java.lang.String = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  
  /** Sets or retrieves the number of objects in a collection. */
  /* standard dom */
  val length: Double = js.native
  
  /** Sets or retrieves how to send the form data to the server. */
  /* standard dom */
  var method: java.lang.String = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** Designates a form that is not validated when submitted. */
  /* standard dom */
  var noValidate: scala.Boolean = js.native
  
  /* standard dom */
  var rel: java.lang.String = js.native
  
  /* standard dom */
  val relList: DOMTokenList = js.native
  
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
  def reportValidity(): scala.Boolean = js.native
  
  /* standard dom */
  def requestSubmit(): Unit = js.native
  def requestSubmit(submitter: HTMLElement): Unit = js.native
  
  /** Fires when the user resets a form. */
  /* standard dom */
  def reset(): Unit = js.native
  
  /** Fires when a FORM is about to be submitted. */
  /* standard dom */
  def submit(): Unit = js.native
  
  /** Sets or retrieves the window or frame at which to target content. */
  /* standard dom */
  var target: java.lang.String = js.native
}
