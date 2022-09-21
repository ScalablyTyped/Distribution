package typings.std

import typings.std.stdStrings.backward
import typings.std.stdStrings.forward
import typings.std.stdStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating the layout and presentation of <textarea> elements. */
@js.native
trait HTMLTextAreaElement
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
  
  /* standard dom */
  var autocomplete: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var cols: Double = js.native
  
  /** Sets or retrieves the initial contents of the object. */
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /* standard dom */
  var dirName: java.lang.String = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
  /** Sets or retrieves the maximum number of characters that the user can enter in a text control. */
  /* standard dom */
  var maxLength: Double = js.native
  
  /* standard dom */
  var minLength: Double = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field. */
  /* standard dom */
  var placeholder: java.lang.String = js.native
  
  /** Sets or retrieves the value indicated whether the content of the object is read-only. */
  /* standard dom */
  var readOnly: scala.Boolean = js.native
  
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
  
  /** When present, marks an element that can't be submitted without a value. */
  /* standard dom */
  var required: scala.Boolean = js.native
  
  /** Sets or retrieves the number of horizontal rows contained in the object. */
  /* standard dom */
  var rows: Double = js.native
  
  /** Highlights the input area of a form element. */
  /* standard dom */
  def select(): Unit = js.native
  
  /* standard dom */
  var selectionDirection: forward | backward | none = js.native
  
  /** Gets or sets the end position or offset of a text selection. */
  /* standard dom */
  var selectionEnd: Double = js.native
  
  /** Gets or sets the starting position or offset of a text selection. */
  /* standard dom */
  var selectionStart: Double = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /* standard dom */
  def setRangeText(replacement: java.lang.String): Unit = js.native
  /* standard dom */
  def setRangeText(replacement: java.lang.String, start: Double, end: Double): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double, selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    */
  /* standard dom */
  def setSelectionRange(): Unit = js.native
  def setSelectionRange(start: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Double, end: Null, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Double): Unit = js.native
  def setSelectionRange(start: Null, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Null, direction: forward | backward | none): Unit = js.native
  
  /* standard dom */
  val textLength: Double = js.native
  
  /** Retrieves the type of control. */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /** Retrieves or sets the text in the entry field of the textArea element. */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
  
  /** Sets or retrieves how to handle wordwrapping in the object. */
  /* standard dom */
  var wrap: java.lang.String = js.native
}
