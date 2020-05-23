package typings.std

import typings.std.stdStrings.backward
import typings.std.stdStrings.forward
import typings.std.stdStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating the layout and presentation of <textarea> elements. */
@js.native
trait HTMLTextAreaElement extends HTMLElement {
  var autocomplete: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var cols: Double = js.native
  /**
    * Sets or retrieves the initial contents of the object.
    */
  var defaultValue: java.lang.String = js.native
  var dirName: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | Null = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  /**
    * Sets or retrieves the maximum number of characters that the user can enter in a text control.
    */
  var maxLength: Double = js.native
  var minLength: Double = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
    */
  var placeholder: java.lang.String = js.native
  /**
    * Sets or retrieves the value indicated whether the content of the object is read-only.
    */
  var readOnly: scala.Boolean = js.native
  /**
    * When present, marks an element that can't be submitted without a value.
    */
  var required: scala.Boolean = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  var rows: Double = js.native
  var selectionDirection: forward | backward | none = js.native
  /**
    * Gets or sets the end position or offset of a text selection.
    */
  var selectionEnd: Double = js.native
  /**
    * Gets or sets the starting position or offset of a text selection.
    */
  var selectionStart: Double = js.native
  val textLength: Double = js.native
  /**
    * Retrieves the type of control.
    */
  val `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Retrieves or sets the text in the entry field of the textArea element.
    */
  var value: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Sets or retrieves how to handle wordwrapping in the object.
    */
  var wrap: java.lang.String = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Highlights the input area of a form element.
    */
  def select(): Unit = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  def setRangeText(replacement: java.lang.String): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double, selectionMode: SelectionMode): Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    */
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_backward(start: Double, end: Double, direction: backward): Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_forward(start: Double, end: Double, direction: forward): Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_none(start: Double, end: Double, direction: none): Unit = js.native
}

