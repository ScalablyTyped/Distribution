package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <button> elements. */
@js.native
trait HTMLButtonElement
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
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /** Overrides the action attribute (where the data on a form is sent) on the parent form element. */
  /* standard dom */
  var formAction: java.lang.String = js.native
  
  /** Used to override the encoding (formEnctype attribute) specified on the form element. */
  /* standard dom */
  var formEnctype: java.lang.String = js.native
  
  /** Overrides the submit method attribute previously specified on a form element. */
  /* standard dom */
  var formMethod: java.lang.String = js.native
  
  /** Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option. */
  /* standard dom */
  var formNoValidate: scala.Boolean = js.native
  
  /** Overrides the target attribute on a form element. */
  /* standard dom */
  var formTarget: java.lang.String = js.native
  
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard dom */
  var name: java.lang.String = js.native
  
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
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /** Gets the classification and default behavior of the button. */
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /** Sets or retrieves the default or selected value of the control. */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
