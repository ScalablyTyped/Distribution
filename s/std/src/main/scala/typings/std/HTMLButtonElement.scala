package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <button> elements. */
@js.native
trait HTMLButtonElement extends HTMLElement {
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | Null = js.native
  /**
    * Overrides the action attribute (where the data on a form is sent) on the parent form element.
    */
  var formAction: java.lang.String = js.native
  /**
    * Used to override the encoding (formEnctype attribute) specified on the form element.
    */
  var formEnctype: java.lang.String = js.native
  /**
    * Overrides the submit method attribute previously specified on a form element.
    */
  var formMethod: java.lang.String = js.native
  /**
    * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
    */
  var formNoValidate: scala.Boolean = js.native
  /**
    * Overrides the target attribute on a form element.
    */
  var formTarget: java.lang.String = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Gets the classification and default behavior of the button.
    */
  var `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Sets or retrieves the default or selected value of the control.
    */
  var value: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): Unit = js.native
}

